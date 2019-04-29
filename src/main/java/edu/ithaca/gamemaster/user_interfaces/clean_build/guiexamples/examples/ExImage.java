package edu.ithaca.gamemaster.user_interfaces.clean_build.guiexamples.examples;

import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ExImage extends JPanel
{

    public ExImage()
    {
        ImageIcon imageIcon = new ImageIcon(this.getClass().getResource("*/d&d.jpg"));
        JLabel label = new JLabel(imageIcon);
        add(label);
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.add(new ExImage());
        frame.setVisible(true);
        frame.setPreferredSize(new Dimension(200, 300));
    }
}
