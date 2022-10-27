package gui.components;

import javax.swing.*;
import javax.swing.plaf.basic.BasicProgressBarUI;
import java.awt.*;

public class CustomProgressBar extends JProgressBar {

    public CustomProgressBar(int min, int max, int value, String text){
        setValue(value);
        setMinimum(min);
        setMaximum(max);
        setString(text);

        setUI(new BasicProgressBarUI() {
            @Override
            protected void paintString(Graphics g, int x, int y, int width, int height, int amountFull, Insets b) {
                g.setColor(new Color(0,0,0));
                super.paintString(g, x, y, width, height, amountFull, b);
            }
        });


    }
}
