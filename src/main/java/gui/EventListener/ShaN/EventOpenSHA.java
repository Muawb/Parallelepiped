package gui.EventListener.ShaN;

import gui.FilesFound;
import system.function.Algoritms;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class EventOpenSHA implements ActionListener {

    private JTextField outLine;
    private File file = null;

    public EventOpenSHA(JTextField base){
        this.outLine = base;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            FilesFound test = new FilesFound();
            if (file == null) {
                file = test.createDialogFrame();
            }

            Algoritms a = new Algoritms("SHA-1");
            String result = a.hex(file);
            System.out.println(result);

            outLine.setText(result);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
