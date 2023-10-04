package main;

import javax.swing.*;
import java.awt.*;

public class Board extends JPanel{

    public int tilesize= 85;

    int cols=8;
    int rows=8;

    public Board(){
        this.setPreferredSize(new Dimension(cols * tilesize,rows * tilesize));
        this.setBackground(Color.green);

    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2d= (Graphics2D)  g;

        for(int r=0;r<rows;r++)
            for (int c=0;c<cols;c++)
            {
                g2d.setColor((c+r)%2==0? new Color(234, 183, 130):new Color(231, 144, 63));
                g2d.fillRect(c*tilesize, r*tilesize,tilesize,tilesize);
            }
    }

}

