package edu.ithaca.gamemaster.map;

import java.awt.*;
import javax.swing.*;
public class Player  extends JComponent{

    private int x, y;
    private int width, height = 40;
    private Image img;
    private int Health;

    public Player(int x, int y, int Health){

        this.x =x;
        this.y = y;
        this.Health = Health;
    }
    @Override
    public void paintComponent(Graphics g) {

        g.fillRect(x,y,width,height);

    }
}
