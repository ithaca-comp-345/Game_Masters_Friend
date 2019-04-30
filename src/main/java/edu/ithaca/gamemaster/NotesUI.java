package edu.ithaca.gamemaster;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class NotesUI extends JFrame implements ActionListener{
    public JButton button;
    public JTextArea text;
    public JPanel panel;

    public Notes note;

    public static JFrame noteFrame = new JFrame("Notes");


    public NotesUI(Notes note){
        this.note = note;
        note.setNotes("ndnddj");
        createUIComponents();
    }

    private void createUIComponents() {
        button.setActionCommand("Save");
        button.addActionListener(this);
        text.setText(note.getNotes());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        if(action.equals("Save")) {
            System.out.println(text.getText());
            note.setNotes(text.getText());
            System.out.println(note.getNotes());
        }
    }

    public static void main(String[] args) throws IOException {
        noteFrame.setSize(500,450);
        noteFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Notes note = new Notes("lol1");
        noteFrame.setContentPane(new NotesUI(note).panel);
        noteFrame.setVisible(true);
        System.out.println(note.getNotes());
    }
}