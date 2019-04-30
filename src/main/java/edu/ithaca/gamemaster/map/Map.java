package edu.ithaca.gamemaster.map;

import java.awt.*;
import javax.swing.*;

public class Map extends JFrame {

    JFrame frame;


    public Map(String path) {
        //Create and set up the window.
        this.frame = new JFrame("D&D MAP");
        ImageIcon icon = new ImageIcon(path);
        JLabel label1 = new JLabel(icon);

        JPanel panel = new JPanel();
        panel.add(label1);
        frame.add(panel);

        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(icon.getIconWidth(), icon.getIconHeight()));
        frame.setResizable(false);

    }

    public  void display(){
        this.frame.pack();
        this.frame.setVisible(true);

    }

}