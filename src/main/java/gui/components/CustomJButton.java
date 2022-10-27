package gui.components;

import javax.swing.*;
import java.awt.*;

public class CustomJButton extends JButton implements Factory{

    private Font size;
    private Color rgb;
    private int height;
    private int width;

    public CustomJButton(String text, Color rgb, int width, int height, Font font){
        super(text);
        this.size = font;
        this.rgb = rgb;
        this.height = height;
        this.width = width;
    }

    @Override
    public void build(){
        setFont(size);
        setBackground(rgb);
        setPreferredSize(new Dimension(width, height));
    }
}
