package gui.EventListener.MD;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventExitMD implements ActionListener {

    private JPanel panelOne;
    private JPanel panelTwo;

    public EventExitMD(JPanel po, JPanel pt){
        this.panelOne = po;
        this.panelTwo = pt;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        panelOne.setVisible(false);
        panelTwo.setVisible(true);
    }
}
