package edu.ithaca.gamemaster.user_interfaces.clean_build;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class CampaignUI extends JFrame implements ActionListener {
    private JButton addSession;
    private JPanel panel;
    private JList<Object> sessionList;
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

    private Campaign campaign;

    public static JFrame campaignFrame = new JFrame("Campaign");

    public CampaignUI(Campaign campaign){
        this.campaign = campaign;
        createUIComponents();
    }

    private void createUIComponents() {
        addSession.setActionCommand("AddSession");
        addSession.addActionListener(this);

        invitePlayerButton.setActionCommand("InvitePlayer");
        invitePlayerButton.addActionListener(this);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        if(action.equals("AddSession")){
            String session= JOptionPane.showInputDialog("Session name: ", null);
            System.out.println(session);
            campaign.createSession(session);
            sessionList.setListData(campaign.getSessionList());
        }
    }

    public static void main(String[] args) throws IOException {
        campaignFrame.setSize(500,450);
        campaignFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Campaign campaign = new Campaign("campaign1");
        campaignFrame.setContentPane(new CampaignUI(campaign).panel);
        campaignFrame.setVisible(true);


    }






}
