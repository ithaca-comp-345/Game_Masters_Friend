package edu.ithaca.gamemaster.user_interfaces.clean_build;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

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
    private JLabel sessionL3;
    private JLabel sessionL4;
    private JLabel sessionL5;
    private JLabel sessionL6;
    private JLabel sessionL7;
    private JLabel sessionL8;
    private JLabel sessionL9;
    private JLabel sessionL10;
    private JLabel sessionL11;
    private JLabel sessionL12;
    private JButton sButton1;
    private JButton sButton2;
    private JButton sButton3;
    private JButton sButton4;
    private JButton sButton5;
    private JButton sButton6;
    private JButton sButton7;
    private JButton sButton8;
    private JButton sButton9;
    private JButton sButton10;
    private JButton sButton11;
    private JButton sButton12;
    private JLabel sCampaign1;
    private JLabel sCampaign2;
    private JLabel sCampaign3;
    private JLabel sCampaign4;
    private JLabel sCampaign5;
    private JLabel sCampaign6;
    private JLabel sCampaign7;
    private JLabel sCampaign8;
    private JLabel sCampaign9;
    private JLabel sCampaign10;
    private JLabel sCampaign11;
    private JLabel sCampaign12;
    private JLabel sDate1;
    private JLabel sDate2;
    private JLabel sDate3;
    private JLabel sDate4;
    private JLabel sDate5;
    private JLabel sDate6;
    private JLabel sDate7;
    private JLabel sDate8;
    private JLabel sDate9;
    private JLabel sDate10;
    private JLabel sDate11;
    private JLabel sDate12;
    private JLabel sessionMax;
    private JButton sDelete1;
    private JButton sDelete2;
    private JButton sDelete3;
    private JButton sDelete4;
    private JButton sDelete5;
    private JButton sDelete6;
    private JButton sDelete7;
    private JButton sDelete8;
    private JButton sDelete9;
    private JButton sDelete10;
    private JButton sDelete11;
    private JButton sDelete12;
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

    private void hideSession(){
        ButtonHidden.twoButtonLabelHide(sessionL1,sCampaign1,sButton1,sDelete1);
        ButtonHidden.twoButtonLabelHide(sessionL2,sCampaign2,sButton2,sDelete2);
        ButtonHidden.twoButtonLabelHide(sessionL3,sCampaign3,sButton3,sDelete3);
        ButtonHidden.twoButtonLabelHide(sessionL4,sCampaign4,sButton4,sDelete4);
        ButtonHidden.twoButtonLabelHide(sessionL5,sCampaign5,sButton5,sDelete5);
        ButtonHidden.twoButtonLabelHide(sessionL6,sCampaign6,sButton6,sDelete6);
        ButtonHidden.twoButtonLabelHide(sessionL7,sCampaign7,sButton7,sDelete7);
        ButtonHidden.twoButtonLabelHide(sessionL8,sCampaign8,sButton8,sDelete8);
        ButtonHidden.twoButtonLabelHide(sessionL9,sCampaign9,sButton9,sDelete9);
        ButtonHidden.twoButtonLabelHide(sessionL10,sCampaign10,sButton10,sDelete10);
        ButtonHidden.twoButtonLabelHide(sessionL11,sCampaign11,sButton11,sDelete11);
        ButtonHidden.twoButtonLabelHide(sessionL12,sCampaign12,sButton12,sDelete12);
    }

    public GameMasterLandingPage(User continuity){
        campaignCount = 0;

        user = continuity;
        createUIComponents();
        hideContent();
        hideSession();

        //create campaign button
        createANewCampaignButton.setActionCommand("CreateCampaign");
        createANewCampaignButton.addActionListener(this);

        startANewSessionButton.setActionCommand("CreateSession");
        startANewSessionButton.addActionListener(this);

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
                    user.createCampaign(newCampaign); //need to test campaign name valid
                    try {
                        System.out.println(user.getACreatedCampaign(newCampaign));
                    } catch (FileNotFoundException e){
                        e.printStackTrace();
                    }
                    campaignL1.setText(newCampaign);
                    campaignCount++;
                    campaignMax.setText("Active Campaigns: "+campaignCount);
                    hideContent();
                } else if (campaignL2.getText().equals("")) {
                    user.createCampaign(newCampaign);
                    try {
                        System.out.println(user.getACreatedCampaign(newCampaign));
                    } catch (FileNotFoundException e){
                        e.printStackTrace();
                    }
                    campaignL2.setText(newCampaign);
                    campaignCount++;
                    campaignMax.setText("Active Campaigns: "+campaignCount);
                    hideContent();
                } else if (campaignL3.getText().equals("")) {
                    user.createCampaign(newCampaign);
                    try {
                        System.out.println(user.getACreatedCampaign(newCampaign));
                    } catch (FileNotFoundException e){
                        e.printStackTrace();
                    }
                    campaignL3.setText(newCampaign);
                    campaignCount++;
                    campaignMax.setText("Active Campaigns: "+campaignCount);
                    hideContent();
                } else if (campaignL4.getText().equals("")) {
                    user.createCampaign(newCampaign);
                    try {
                        System.out.println(user.getACreatedCampaign(newCampaign));
                    } catch (FileNotFoundException e){
                        e.printStackTrace();
                    }
                    campaignL4.setText(newCampaign);
                    campaignCount++;
                    campaignMax.setText("Active Campaigns: "+campaignCount);
                    hideContent();
                } else if (campaignL5.getText().equals("")) {
                    user.createCampaign(newCampaign);
                    try {
                        System.out.println(user.getACreatedCampaign(newCampaign));
                    } catch (FileNotFoundException e){
                        e.printStackTrace();
                    }
                    campaignL5.setText(newCampaign);
                    campaignCount++;
                    campaignMax.setText("Active Campaigns: "+campaignCount);
                    hideContent();
                } else if (campaignL6.getText().equals("")) {
                    user.createCampaign(newCampaign);
                    try {
                        System.out.println(user.getACreatedCampaign(newCampaign));
                    } catch (FileNotFoundException e){
                        e.printStackTrace();
                    }
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
                try {
                    user.deleteCampaign(confirm);
                } catch(FileNotFoundException e){
                    e.printStackTrace();
                }
            }
        }if(action.equals("dc2")){
            //needs to remove campaign from user
            String confirm = JOptionPane.showInputDialog("Deleting this campaign will delete all campaign-owned artifacts... Are you sure, type the name of the campaign to continue");
            if(confirm.equals(campaignL2.getText())) {

                campaignL2.setText("");
                campaignCount--;
                campaignMax.setText("Active Campaigns: " + campaignCount);
                hideContent();
                try {
                    user.deleteCampaign(confirm);
                } catch(FileNotFoundException e){
                    e.printStackTrace();
                }
            }
        }if(action.equals("dc3")){
            //needs to remove campaign from user
            String confirm = JOptionPane.showInputDialog("Deleting this campaign will delete all campaign-owned artifacts... Are you sure, type the name of the campaign to continue");
            if(confirm.equals(campaignL3.getText())) {

                campaignL3.setText("");
                campaignCount--;
                campaignMax.setText("Active Campaigns: " + campaignCount);
                hideContent();
                try {
                    user.deleteCampaign(confirm);
                } catch(FileNotFoundException e){
                    e.printStackTrace();
                }
            }
        }if(action.equals("dc4")){
            //needs to remove campaign from user
            String confirm = JOptionPane.showInputDialog("Deleting this campaign will delete all campaign-owned artifacts... Are you sure, type the name of the campaign to continue");
            if(confirm.equals(campaignL4.getText())) {

                campaignL4.setText("");
                campaignCount--;
                campaignMax.setText("Active Campaigns: " + campaignCount);
                hideContent();
                try {
                    user.deleteCampaign(confirm);
                } catch(FileNotFoundException e){
                    e.printStackTrace();
                }
            }
        }if(action.equals("dc5")){
            //needs to remove campaign from user
            String confirm = JOptionPane.showInputDialog("Deleting this campaign will delete all campaign-owned artifacts... Are you sure, type the name of the campaign to continue");
            if(confirm.equals(campaignL5.getText())) {

                campaignL5.setText("");
                campaignCount--;
                campaignMax.setText("Active Campaigns: " + campaignCount);
                try {
                    user.deleteCampaign(confirm);
                } catch(FileNotFoundException e){
                    e.printStackTrace();
                }
            }
            hideContent();

        }if(action.equals("dc6")){
            //needs to remove campaign from user
            String confirm = JOptionPane.showInputDialog("Deleting this campaign will delete all campaign-owned artifacts... Are you sure, type the name of the campaign to continue");
            if(confirm.equals(campaignL6.getText())) {
                campaignL6.setText("");
                campaignCount--;
                campaignMax.setText("Active Campaigns: " + campaignCount);
                try {
                    user.deleteCampaign(confirm);
                } catch(FileNotFoundException e){
                    e.printStackTrace();
                }
            }
            hideContent();

        }

        if(action.equals("CreateSession")){
            JOptionPaneMultiInput twoOpt = new JOptionPaneMultiInput();
            String sessName = twoOpt.sessionName;
            String campName = twoOpt.campaignName;
            try {
                Session session = user.getACreatedCampaign(campName).createSession(sessName); //needs to check for valid session name and campaign name
                session.start("Default Goal"); //needs to be changed but good for demo; //TODO
                if(sessionL1.getText().equals("") && sCampaign1.getText().equals("") && sDate1.getText().equals("")){
                    sessionL1.setText(sessName);
                    sCampaign1.setText(session.getParentCampaign().getCampaignName());
                    sDate1.setText(session.getTimeStart());
                    hideSession();
                }else if(sessionL2.getText().equals("") && sCampaign2.getText().equals("") && sDate2.getText().equals("")){
                    sessionL2.setText(sessName);
                    sCampaign2.setText(session.getParentCampaign().getCampaignName());
                    sDate2.setText(session.getTimeStart());
                    hideSession();
                }else if(sessionL3.getText().equals("") && sCampaign3.getText().equals("") && sDate3.getText().equals("")){
                    sessionL3.setText(sessName);
                    sCampaign3.setText(session.getParentCampaign().getCampaignName());
                    sDate3.setText(session.getTimeStart());
                    hideSession();
                }else if(sessionL4.getText().equals("") && sCampaign4.getText().equals("") && sDate4.getText().equals("")){
                    sessionL4.setText(sessName);
                    sCampaign4.setText(session.getParentCampaign().getCampaignName());
                    sDate4.setText(session.getTimeStart());
                    hideSession();
                }else if(sessionL5.getText().equals("") && sCampaign5.getText().equals("") && sDate5.getText().equals("")){
                    sessionL5.setText(sessName);
                    sCampaign5.setText(session.getParentCampaign().getCampaignName());
                    sDate5.setText(session.getTimeStart());
                    hideSession();
                }else if(sessionL6.getText().equals("") && sCampaign6.getText().equals("") && sDate6.getText().equals("")){
                    sessionL6.setText(sessName);
                    sCampaign6.setText(session.getParentCampaign().getCampaignName());
                    sDate6.setText(session.getTimeStart());
                    hideSession();
                }else if(sessionL7.getText().equals("") && sCampaign7.getText().equals("") && sDate7.getText().equals("")){
                    sessionL7.setText(sessName);
                    sCampaign7.setText(session.getParentCampaign().getCampaignName());
                    sDate7.setText(session.getTimeStart());
                    hideSession();
                }else if(sessionL8.getText().equals("") && sCampaign8.getText().equals("") && sDate8.getText().equals("")){
                    sessionL8.setText(sessName);
                    sCampaign8.setText(session.getParentCampaign().getCampaignName());
                    sDate8.setText(session.getTimeStart());
                    hideSession();
                }else if(sessionL9.getText().equals("") && sCampaign9.getText().equals("") && sDate9.getText().equals("")){
                    sessionL9.setText(sessName);
                    sCampaign9.setText(session.getParentCampaign().getCampaignName());
                    sDate9.setText(session.getTimeStart());
                    hideSession();
                }else if(sessionL10.getText().equals("") && sCampaign10.getText().equals("") && sDate10.getText().equals("")){
                    sessionL10.setText(sessName);
                    sCampaign10.setText(session.getParentCampaign().getCampaignName());
                    sDate10.setText(session.getTimeStart());
                    hideSession();
                }else if(sessionL11.getText().equals("") && sCampaign11.getText().equals("") && sDate11.getText().equals("")){
                    sessionL11.setText(sessName);
                    sCampaign11.setText(session.getParentCampaign().getCampaignName());
                    sDate11.setText(session.getTimeStart());
                    hideSession();
                }else if(sessionL12.getText().equals("") && sCampaign12.getText().equals("") && sDate12.getText().equals("")){
                    sessionL12.setText(sessName);
                    sCampaign12.setText(session.getParentCampaign().getCampaignName());
                    sDate12.setText(session.getTimeStart());
                    hideSession();
                }else{
                    sessionMax.setText("Max Reached");
                }
            }catch (FileNotFoundException e){
                e.printStackTrace();
            }

            System.out.println(campName + " " + sessName);
        }

    }
}



