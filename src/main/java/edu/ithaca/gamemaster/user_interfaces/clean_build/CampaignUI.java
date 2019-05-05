package edu.ithaca.gamemaster.user_interfaces.clean_build;

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
    private JButton viewSessionsButton;
    private JButton invitePlayerButton;
    private JButton viewPlayersButton;
    private JList playerList;
    private JButton addCharacterButton;
    private JButton viewCharacterButton;
    private JList characterList;
    private JButton addNPCButton;
    private JButton viewNPCButton;
    private JList npcList;
    DefaultListModel<Session> sessions = new DefaultListModel<>();

    private Campaign campaign;
    public GMController controller;
    public static JFrame campaignFrame = new JFrame("Campaign");

    public CampaignUI(Campaign campaign){
        this.campaign = campaign;
      //  sessionList.setListData(campaign.getSessionList());
        characterList.setListData(campaign.getCharacterList());
        npcList.setListData(campaign.getNPCList());
        playerList.setListData(campaign.getPlayerList());

        sessionList.setModel(sessions);
        this.controller = new GMController();

        Session newSess = new Session("dmm", campaign);
        int size = campaign.getSessionListClean().size();
        int i = 0;
        while(i<size){
            sessions.addElement(campaign.getSessionListClean().get(i));
            i++;
        }


        createUIComponents();
    }

    private void createUIComponents() {
        addSession.setActionCommand("AddSession");
        addSession.addActionListener(this);
        viewSessionsButton.setActionCommand("ViewSession");
        viewSessionsButton.addActionListener(this);

        invitePlayerButton.setActionCommand("InvitePlayer");
        invitePlayerButton.addActionListener(this);
        viewPlayersButton.setActionCommand("ViewPlayer");
        viewPlayersButton.addActionListener(this);

        addCharacterButton.setActionCommand("AddCharacter");
        addCharacterButton.addActionListener(this);
        viewCharacterButton.setActionCommand("ViewCharacter");
        viewCharacterButton.addActionListener(this);

        addNPCButton.setActionCommand("AddNPC");
        addNPCButton.addActionListener(this);
        viewNPCButton.setActionCommand("viewNPC");
        viewNPCButton.addActionListener(this);

        sessionList.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                Session s = sessionList.getSelectedValue();
                System.out.println();
                campaignFrame.setContentPane(new SessionUI(s, campaign, campaignFrame).Session);
                campaignFrame.setVisible(true);
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
