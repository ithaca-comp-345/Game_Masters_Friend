package edu.ithaca.gamemaster.utility;

import javax.swing.*;
public class SwingUtility {
    public static void showPanel(JPanel panel){
        JFrame frame = new JFrame();
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
