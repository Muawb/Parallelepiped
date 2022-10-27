package gui.EventListener.ShaN;

import gui.components.CustomJPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventExitSHA implements ActionListener {

    private CustomJPanel panelOne;
    private CustomJPanel panelTwo;

    public EventExitSHA(CustomJPanel po, CustomJPanel pt){
        this.panelOne = po;
        this.panelTwo = pt;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        panelOne.setVisible(true);
        panelTwo.setVisible(false);
    }
}
