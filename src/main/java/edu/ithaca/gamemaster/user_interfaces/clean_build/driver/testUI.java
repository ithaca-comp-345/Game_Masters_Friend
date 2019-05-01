package edu.ithaca.gamemaster.user_interfaces.clean_build.driver;

import edu.ithaca.gamemaster.user_interfaces.clean_build.JOptionPaneMultiInput;

import javax.swing.*;
import java.io.IOException;

public class testUI {
    public static void main(String[] args) throws IOException {

        JFrame frame = new JFrame("Game Masters Companion");
        frame.setSize(800,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JOptionPaneMultiInput dialog = new JOptionPaneMultiInput();



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
