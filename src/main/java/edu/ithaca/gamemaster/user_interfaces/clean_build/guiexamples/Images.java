package edu.ithaca.gamemaster.user_interfaces.clean_build.guiexamples;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Images extends JPanel {
    private BufferedImage image;

    public Images(String file){
        try{
            image= ImageIO.read(new File(file));
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
    }
}
