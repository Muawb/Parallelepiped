package gui.EventListener.ShaT;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventExit implements ActionListener {

    private JPanel panelOne;
    private JPanel panelTwo;

    public EventExit(JPanel po, JPanel pt){
        this.panelOne = po;
        this.panelTwo = pt;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        panelOne.setVisible(true);
        panelTwo.setVisible(false);
    }
}
