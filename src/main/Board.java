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
}

