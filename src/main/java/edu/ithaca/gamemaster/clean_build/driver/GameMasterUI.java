package edu.ithaca.gamemaster.clean_build.driver;

import edu.ithaca.gamemaster.clean_build.gui.Background;
import edu.ithaca.gamemaster.clean_build.gui.GameFrame;
import edu.ithaca.gamemaster.clean_build.gui.Images;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GameMasterUI {
    public static void main(String[] args) throws IOException {

        JFrame frame = new JFrame("Game Masters Companion");
        frame.setSize(800,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



                //image stuff not tested
//                BufferedImage img = null;
//                try{
//                    img = ImageIO.read(new File("C:/Users/Milo Rue/Desktop/d&d.jpg"));
//                }catch (Exception e){
//                    e.printStackTrace();
//                }
//
//                JLabel lbl = new JLabel();
//                lbl.setIcon(new ImageIcon(img));
//                lbl.setSize(100,100);
//
//                frame.getContentPane().add(lbl, BorderLayout.WEST);
//                frame.pack();
//                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }

    }
