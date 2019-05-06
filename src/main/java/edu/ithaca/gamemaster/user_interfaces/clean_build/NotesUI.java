package edu.ithaca.gamemaster.user_interfaces.clean_build;

import edu.ithaca.gamemaster.user_interfaces.Notes;
import edu.ithaca.gamemaster.user_interfaces.SessionUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class NotesUI extends JPanel implements ActionListener{
    public JButton button;
    public JTextArea text;
    public JPanel panel;
    private JButton closeButton;

    public Notes note;
    public Session session;



    public NotesUI(Notes note, Session s){
        this.note = note;
        this.session = s;
        createUIComponents();
    }

    private void createUIComponents() {
        button.setActionCommand("Save");
        button.addActionListener(this);
        text.setText(note.getNotes());
        closeButton.setActionCommand("Close");
        closeButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        if(action.equals("Save")) {
            System.out.println(text.getText());
            note.setNotes(text.getText());
            System.out.println(note.getNotes());
        }
//        if(action.equals("Close")){
//            noteFrame.setContentPane(new SessionUI(session).Session);
//            noteFrame.setVisible(true);
//        }
    }

//    public static void main(String[] args) throws IOException {
//        noteFrame.setSize(500,450);
//        noteFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        Notes note = new Notes("lol1");
//        noteFrame.setContentPane(new NotesUI(note).panel);
//        noteFrame.setVisible(true);
//        System.out.println(note.getNotes());
//    }
}