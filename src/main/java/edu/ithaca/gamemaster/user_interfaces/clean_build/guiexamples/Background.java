package edu.ithaca.gamemaster.user_interfaces.clean_build.guiexamples;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Background extends JPanel {
    private Image background;

    public Background(String filename) throws IOException {
        background = ImageIO.read(new File(filename));

    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(background, 0 ,0, this);
    }
}
