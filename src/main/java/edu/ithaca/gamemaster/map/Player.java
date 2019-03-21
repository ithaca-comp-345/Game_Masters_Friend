package edu.ithaca.gamemaster.map;

import java.awt.*;
import javax.swing.*;
public class Player  extends JPanel{

    private int x, y;
    private int width = 40;
    private int height = 40;
    private Image img;
    private int Health;

    public Player(int x, int y, int Health){

        this.x =x;
        this.y = y;
        this.Health = Health;
    }
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(this.x,this.y,this.width,this.height);
    }


}
