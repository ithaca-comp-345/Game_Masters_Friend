package edu.ithaca.gamemaster.user_interfaces.clean_build;

import edu.ithaca.gamemaster.NPC;
import edu.ithaca.gamemaster.Player;
import edu.ithaca.gamemaster.user_interfaces.SessionUI;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class CampaignUI extends JPanel implements ActionListener {
    private JButton addSession;
    public JPanel panel;
    private JList<Session> sessionList;
    private JButton invitePlayerButton;
    private JList<User> playerList;
    private JButton addCharacterButton;
    private JList<Player> characterList;
    private JButton addNPCButton;
    private JList<NPC> npcList;
    DefaultListModel<Session> sessions = new DefaultListModel<>();
    DefaultListModel<NPC> npcs = new DefaultListModel<>();
    DefaultListModel<User> players = new DefaultListModel<>();
    DefaultListModel<Player> characters = new DefaultListModel<>();


    private Campaign campaign;
    public GMController controller;
    public static JFrame campaignFrame = new JFrame("Campaign");

    public CampaignUI(Campaign campaign){
        this.campaign = campaign;

        sessionList.setModel(sessions);
        npcList.setModel(npcs);
        playerList.setModel(players);
        characterList.setModel(characters);

        this.controller = new GMController();

        int i = 0;
        while(i<campaign.getSessionListClean().size()){
            sessions.addElement(campaign.getSessionListClean().get(i));
            i++;
        }
        i = 0;
        while (i<campaign.getNPCList().size()){
            npcs.addElement(campaign.getNPCList().get(i));
            i++;
        }
        i=0;
        while(i<campaign.getPlayerList().size()){
            players.addElement(campaign.getPlayerList().get(i));
            i++;
        }
        i=0;
        while(i<campaign.getCharacterList().size()){
            characters.addElement(campaign.getCharacterList().get(i));
        }

        createUIComponents();
    }

    private void createUIComponents() {
        addSession.setActionCommand("AddSession");
        addSession.addActionListener(this);


        invitePlayerButton.setActionCommand("InvitePlayer");
        invitePlayerButton.addActionListener(this);

        addCharacterButton.setActionCommand("AddCharacter");
        addCharacterButton.addActionListener(this);

        addNPCButton.setActionCommand("AddNPC");
        addNPCButton.addActionListener(this);

        sessionList.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                Session s = sessionList.getSelectedValue();
                System.out.println();
                campaignFrame.setContentPane(new SessionUI(s, campaign, campaignFrame).Session);
                campaignFrame.setVisible(true);
            }
        });

        npcList.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                NPC npc = npcList.getSelectedValue();
            }
        });
        characterList.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                Player character = characterList.getSelectedValue();
            }
        });

        playerList.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                User player = playerList.getSelectedValue();
            }
        });



    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        if(action.equals("AddSession")){
            String session= JOptionPane.showInputDialog("Session name: ", null);
            System.out.println(session);
            campaign.createSession(session);
            sessions.addElement(campaign.getSessionListClean().get(campaign.getSessionListClean().size()-1));
        }
        if(action.equals("AddNPC")){

        }

    }

    public static void main(String[] args) throws IOException {
        campaignFrame.setSize(500,450);
        campaignFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Campaign campaign = new Campaign("campaign1");
        campaign.createSession("session1");
        campaign.createSession("session2");
        campaignFrame.setContentPane(new CampaignUI(campaign).panel);
        campaignFrame.setVisible(true);
    }






}
