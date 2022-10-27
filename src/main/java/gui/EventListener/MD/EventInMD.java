package gui.EventListener.MD;

import system.function.Algoritms;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class EventInMD implements DocumentListener {

    private JTextField in;
    private JTextField out;

    public EventInMD(JTextField in, JTextField out){
        this.in = in;
        this.out = out;
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        try {
            Algoritms algoritms = new Algoritms("MD5");
            String line = in.getText();
            String result = algoritms.md(line);
            out.setText(result);
        } catch (Exception ex){
            ex.printStackTrace();
        }

    }

    @Override
    public void removeUpdate(DocumentEvent e) {

    }

    @Override
    public void changedUpdate(DocumentEvent e) {

    }
}
