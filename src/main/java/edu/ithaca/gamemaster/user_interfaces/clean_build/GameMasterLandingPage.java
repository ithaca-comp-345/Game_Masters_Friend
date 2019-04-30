package edu.ithaca.gamemaster.user_interfaces.clean_build;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameMasterLandingPage extends JFrame implements ActionListener {
    public JPanel LandingPage;
    private JButton createANewCharacterButton;
    private JButton createANewCampaignButton;
    private JButton createANewNPCButton;
    private JButton startANewSessionButton;
    private JPanel ActiveCampaigns;
    private JPanel ActiveSessions;
    private JButton viewAllPastCampaignsButton;
    private JButton cButton1;
    private JPanel CharacterList;
    private JPanel NPCList;
    private JButton viewEditButton;
    private JPanel PastSessions;
    private JPanel CompletedCampaigns;
    private JButton vewAllPastSessionsButton;
    private JButton viewEditButton2;
    private JLabel campaignL1;
    private JLabel campaignL2;
    private JLabel sessionL1;
    private JLabel sessionL2;
    private JLabel campaignL3;
    private JLabel campaignL4;
    private JLabel campaignL5;
    private JLabel campaignL6;
    private JButton cButton2;
    private JButton cButton3;
    private JButton cButton4;
    private JButton cButton5;
    private JButton cButton6;
    private JLabel campaignMax;
    private JButton cDelete1;
    private JButton cDelete2;
    private JButton cDelete3;
    private JButton cDelete4;
    private JButton cDelete5;
    private JButton cDelete6;
    private JTable PastSessionsTable;

    private User user;

    private int campaignCount;

    private void createUIComponents() {
        JLabel test = new JLabel();
        test.setText("Testing Stuff");
        test.add(LandingPage);

        campaignMax.setText("Active Campaigns: 0");





    }

    private void hideContent(){

        ButtonHidden.twoButtonHide(campaignL1,cButton1,cDelete1);
        ButtonHidden.twoButtonHide(campaignL2,cButton2,cDelete2);
        ButtonHidden.twoButtonHide(campaignL3,cButton3,cDelete3);
        ButtonHidden.twoButtonHide(campaignL4,cButton4,cDelete4);
        ButtonHidden.twoButtonHide(campaignL5,cButton5,cDelete5);
        ButtonHidden.twoButtonHide(campaignL6,cButton6,cDelete6);
    }

    public GameMasterLandingPage(User continuity){
        campaignCount = 0;

        user = continuity;
        createUIComponents();
        hideContent();

        //create campaign button
        createANewCampaignButton.setActionCommand("CreateCampaign");
        createANewCampaignButton.addActionListener(this);

        //delete button action
        cDelete1.setActionCommand("dc1");
        cDelete2.setActionCommand("dc2");
        cDelete3.setActionCommand("dc3");
        cDelete4.setActionCommand("dc4");
        cDelete5.setActionCommand("dc5");
        cDelete6.setActionCommand("dc6");

        cDelete1.addActionListener(this);
        cDelete2.addActionListener(this);
        cDelete3.addActionListener(this);
        cDelete4.addActionListener(this);
        cDelete5.addActionListener(this);
        cDelete6.addActionListener(this);


    }

    public void actionPerformed(ActionEvent ae){

        String action = ae.getActionCommand();
        if(action.equals("CreateCampaign")) {
            String newCampaign = JOptionPane.showInputDialog("What is the name of your new Campaign?", null);
            if (!newCampaign.equals("")) {
                if (campaignL1.getText().equals("")) {
                    System.out.println("New Campaign: " + newCampaign);
                    campaignL1.setText(newCampaign);
                    campaignCount++;
                    campaignMax.setText("Active Campaigns: "+campaignCount);
                    hideContent();
                } else if (campaignL2.getText().equals("")) {
                    campaignL2.setText(newCampaign);
                    campaignCount++;
                    campaignMax.setText("Active Campaigns: "+campaignCount);
                    hideContent();
                } else if (campaignL3.getText().equals("")) {
                    campaignL3.setText(newCampaign);
                    campaignCount++;
                    campaignMax.setText("Active Campaigns: "+campaignCount);
                    hideContent();
                } else if (campaignL4.getText().equals("")) {
                    campaignL4.setText(newCampaign);
                    campaignCount++;
                    campaignMax.setText("Active Campaigns: "+campaignCount);
                    hideContent();
                } else if (campaignL5.getText().equals("")) {
                    campaignL5.setText(newCampaign);
                    campaignCount++;
                    campaignMax.setText("Active Campaigns: "+campaignCount);
                    hideContent();
                } else if (campaignL6.getText().equals("")) {
                    campaignL6.setText(newCampaign);
                    campaignCount++;
                    campaignMax.setText("Active Campaigns: "+campaignCount);
                    hideContent();
                } else {
                }
            }
            else{
            }

        }
        if(action.equals("dc1")){
            //needs to remove campaign from user
            String confirm = JOptionPane.showInputDialog("Deleting this campaign will delete all campaign-owned artifacts... Are you sure, type the name of the campaign to continue");
            if(confirm.equals(campaignL1.getText())) {
                campaignL1.setText("");
                campaignCount--;
                campaignMax.setText("Active Campaigns: " + campaignCount);
                hideContent();
            }
        }if(action.equals("dc2")){
            //needs to remove campaign from user
            String confirm = JOptionPane.showInputDialog("Deleting this campaign will delete all campaign-owned artifacts... Are you sure, type the name of the campaign to continue");
            if(confirm.equals(campaignL2.getText())) {
                campaignL2.setText("");
                campaignCount--;
                campaignMax.setText("Active Campaigns: " + campaignCount);
                hideContent();
            }
        }if(action.equals("dc3")){
            //needs to remove campaign from user
            String confirm = JOptionPane.showInputDialog("Deleting this campaign will delete all campaign-owned artifacts... Are you sure, type the name of the campaign to continue");
            if(confirm.equals(campaignL3.getText())) {
                campaignL3.setText("");
                campaignCount--;
                campaignMax.setText("Active Campaigns: " + campaignCount);
                hideContent();
            }
        }if(action.equals("dc4")){
            //needs to remove campaign from user
            String confirm = JOptionPane.showInputDialog("Deleting this campaign will delete all campaign-owned artifacts... Are you sure, type the name of the campaign to continue");
            if(confirm.equals(campaignL4.getText())) {
                campaignL4.setText("");
                campaignCount--;
                campaignMax.setText("Active Campaigns: " + campaignCount);
                hideContent();
            }
        }if(action.equals("dc5")){
            //needs to remove campaign from user
            String confirm = JOptionPane.showInputDialog("Deleting this campaign will delete all campaign-owned artifacts... Are you sure, type the name of the campaign to continue");
            if(confirm.equals(campaignL5.getText())) {
                campaignL5.setText("");
                campaignCount--;
                campaignMax.setText("Active Campaigns: " + campaignCount);
            }
            hideContent();
        }if(action.equals("dc6")){
            //needs to remove campaign from user
            String confirm = JOptionPane.showInputDialog("Deleting this campaign will delete all campaign-owned artifacts... Are you sure, type the name of the campaign to continue");
            if(confirm.equals(campaignL6.getText())) {
                campaignL6.setText("");
                campaignCount--;
                campaignMax.setText("Active Campaigns: " + campaignCount);
                hideContent();
            }
        }

    }
}



