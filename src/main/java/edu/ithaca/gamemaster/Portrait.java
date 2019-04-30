package edu.ithaca.gamemaster;

import edu.ithaca.gamemaster.map.Player;


import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


//Need a path to image and a character, image will be resize


public class Portrait {

    JFrame frame;

    public Portrait(String path, Character player) {
        //Create and set up the window.
        this.frame = new JFrame(player.getName() + " - D&D ");
        ImageIcon icon = new ImageIcon(path);

        Image resizeImage = icon.getImage();
        Image newImg = resizeImage.getScaledInstance(400,300, Image.SCALE_SMOOTH);
        icon = new ImageIcon(newImg);
        JLabel portrait = new JLabel(icon);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        //adding portrait
        panel.add(portrait);
        Dimension size = portrait.getPreferredSize();
        portrait.setBounds(50,10, size.width,size.height);

        JLabel name = new JLabel("Name: " + player.getName());
        JLabel strength = new JLabel("Strength: " + player.getStrength());
        JLabel hp = new JLabel("Hp: " + player.getHP());
        JLabel dexterity = new JLabel("Dexterity: " + player.getDexterity());
        JLabel intelligence = new JLabel("Intelligence: " + player.getIntelligence());
        JLabel armor = new JLabel("Armor: " + player.getArmor());
        JLabel speed = new JLabel( "Speed: " + player.getSpeed());

        speed.setForeground(Color.WHITE);
        intelligence.setForeground(Color.WHITE);
        dexterity.setForeground(Color.WHITE);
        name.setForeground(Color.WHITE);
        strength.setForeground(Color.white);
        hp.setForeground(Color.white);
        armor.setForeground(Color.WHITE);
        //Labels
        panel.add(name);
        panel.add(strength);
        panel.add(hp);
        panel.add(dexterity);
        panel.add(intelligence);
        panel.add(armor);
        panel.add(speed);

        size = name.getPreferredSize();
        name.setBounds(50,325,size.width, size.height);
        size = strength.getPreferredSize();
        strength.setBounds(50,345,size.width, size.height);
        size = hp.getPreferredSize();
        hp.setBounds(50,365,size.width, size.height);
        size = dexterity.getPreferredSize();
        dexterity.setBounds(50,385, size.width,size.height);
        size = intelligence.getPreferredSize();
        intelligence.setBounds(50,405, size.width, size.height);
        size = armor.getPreferredSize();
        armor.setBounds(50,425,size.width, size.height);
        size = speed.getPreferredSize();
        speed.setBounds(50,445,size.width, size.height);


        frame.add(panel);
        panel.setBackground(Color.black);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(500, 485));
        frame.setResizable(false);

    }

    public  void display(){
        this.frame.pack();

        this.frame.setVisible(true);

    }

}
