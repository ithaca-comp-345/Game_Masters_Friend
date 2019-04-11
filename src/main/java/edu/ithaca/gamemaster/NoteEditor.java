package edu.ithaca.gamemaster;


import javax.swing.*;
import javax.swing.Action;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class NoteEditor extends JFrame {
    private JButton button;
    private JTextArea text;

    public String s;

    public NoteEditor(Notes n){
        createView(n);

        setTitle("Notes");
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);

    }

    public void createView(Notes n){
        JPanel panel = new JPanel();
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
