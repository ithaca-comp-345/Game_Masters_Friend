package edu.ithaca.gamemaster;


import edu.ithaca.gamemaster.user_interfaces.Notes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NoteEditor extends JFrame {
    public JButton button;
    public JTextArea text;
    public JPanel panel;

    public String s;

    public NoteEditor(Notes n){
        createView(n);

        setTitle("Notes");
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);

    }

    public void display(){

        panel.setVisible(true);
    }

    public void createView(Notes n){
        panel = new JPanel();
        getContentPane().add(panel);

        text = new JTextArea(n.getNotes());
        text.setPreferredSize(new Dimension(200,200));
        panel.add(text);


        button = new JButton("Save");
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                n.setNotes(text.getText());
                System.out.println(n.getNotes());
            }
        });
        panel.add(button);
    }

}
