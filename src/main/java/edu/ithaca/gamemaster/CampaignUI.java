package edu.ithaca.gamemaster;

import edu.ithaca.gamemaster.user_interfaces.clean_build.GameMasterUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class CampaignUI extends JFrame implements ActionListener{


    private JPanel panel;
    private JButton addPlayer;
    private JButton addNPC;
    private JLabel sessions;
    private JList sessionList;
    private JList playerList;
    private JList npcList;
    private JButton addLocation;
    private JList characterList;
    private JButton addCharacter;
    private JButton addNotes;
    private JList locationList;

    private Campaign campaign;

    public static JFrame campaignFrame = new JFrame("Campaign");

    private void createUIComponents() {
        addPlayer.setActionCommand("AddPlayer");
        addNPC.setActionCommand("AddNPC");
        addLocation.setActionCommand("AddLocation");
        addCharacter.setActionCommand("AddCharacter");


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        if(action.equals("AddPlayer")){
        }
        if(action.equals("AddNPC")){}
        if(action.equals("AddLocation")){}
        if(action.equals("AddCharacter")){}

    }

    public static void main(String[] args) throws IOException {



        campaignFrame.setSize(500,450);
        campaignFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        campaignFrame.setContentPane(new CampaignUI().panel);
        campaignFrame.setVisible(true);


    }
}
