package gui.components;

import javax.swing.*;
import java.awt.*;

public class CustomJPanel extends JPanel implements Factory {

    private Color rgb;
    private int x;
    private int y;
    private int width;
    private int height;


    public CustomJPanel(LayoutManager layout, Color rgb, int x, int y, int width, int height){
        super(layout);
        this.rgb = rgb;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void build(){
        setBackground(rgb);
        setBounds(x,y,width,height);
    }
}
