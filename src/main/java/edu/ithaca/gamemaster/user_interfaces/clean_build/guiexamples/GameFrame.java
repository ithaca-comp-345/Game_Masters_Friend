package edu.ithaca.gamemaster.user_interfaces.clean_build.guiexamples;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameFrame extends JFrame {
    public GameFrame(String title){
        super(title);

        setLayout(new BorderLayout());

        //components
        JTextArea testArea = new JTextArea();
        testArea.setText("Why?");
        JButton button = new JButton("Press Me!");


        //add it to pane
        Container contain = getContentPane();

        contain.add(testArea, BorderLayout.PAGE_START);
        contain.add(button, BorderLayout.CENTER);

        //behavior
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                testArea.setText("You pressed it");
            }
        });
    }
}
