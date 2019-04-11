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
        Player player = new Player(250,250,100);

        JPanel panel = new JPanel();
        panel.add(label1);
        panel.add(player);
        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(icon.getIconWidth(), icon.getIconHeight()));
        frame.setResizable(false);

        //Display the window.
//        frame.pack();
//        frame.setVisible(true);
    }

    public  void display(){
        this.frame.pack();
        this.frame.setVisible(true);

    }


    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Map  map = new Map("/home/dev/Desktop/comp345/Game_Masters_Friend/src/main/java/edu/ithaca/gamemaster/map/image.jpg");
                map.display();
            }
        });

    }
}