package gui.EventListener.ShaT;

import system.function.Algoritms;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class EventIn implements DocumentListener {

    private JTextField in;
    private JTextField out;

    public EventIn(JTextField in, JTextField out){
        this.in = in;
        this.out = out;
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        try {
            Algoritms algoritms = new Algoritms("SHA-256");
            String text = in.getText();
            String result = algoritms.sha(text);
            out.setText(result);
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }

    @Override
    public void removeUpdate(DocumentEvent e) {

    }

    @Override
    public void changedUpdate(DocumentEvent e) {

    }
}
