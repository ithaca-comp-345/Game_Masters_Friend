package edu.ithaca.gamemaster.user_interfaces;

import edu.ithaca.gamemaster.user_interfaces.clean_build.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class SessionUI extends JPanel implements ActionListener {
    public JPanel Session;
    public JPanel Notes;
    private JButton editNote;
    private JTextArea noteArea;
    private JLabel sessionStart;
    private JLabel sessionName;
    private JButton closeSessionButton;
    private JLabel startTime;
    public Notes notes;

    Session session;
    Campaign campaign;
    GMController controller;
    User loggedUser;

    public static JFrame sessionFrame;

    public SessionUI(Session sess, Campaign campaign, JFrame campaignFrame, GMController controller, User loggedUser){
        this.campaign= campaign;
        this.session = sess;
        this.sessionFrame = campaignFrame;
        this.controller = controller;
        this.loggedUser = loggedUser;
        createUIComponents();
    }

    private void createUIComponents(){
        editNote.setActionCommand("editNote");
        editNote.addActionListener(this);

        closeSessionButton.setActionCommand("close");
        closeSessionButton.addActionListener(this);


        noteArea.setText(session.getNotes());
       // sessionStart.setText("Session start time: ");
      //  System.out.println(session.getTimeStart());
       // startTime.setText(session.getTimeStart());
        sessionName.setText(session.getSessionName());



    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        if (action.equals("editNote")){
            System.out.println(session.getNotes());
            session.editNotes(noteArea.getText());
            System.out.println(session.getNotes());
        }
        if(action.equals("close")){
            sessionFrame.setContentPane(new CampaignUI(campaign, controller, sessionFrame, loggedUser).panel);
            sessionFrame.setVisible(true);

        }

    }

}
