package edu.ithaca.gamemaster.user_interfaces.clean_build;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.*;

public class GameMasterLandingPage extends JPanel implements ActionListener {
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
    private JButton charButton1;
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
    private JLabel character1;
    private JLabel character2;
    private JLabel character3;
    private JLabel character4;
    private JLabel character5;
    private JLabel character6;
    private JLabel character7;
    private JLabel character8;
    private JLabel character9;
    private JLabel character10;
    private JLabel character11;
    private JLabel character12;
    private JButton charButton2;
    private JButton charButton3;
    private JButton charButton4;
    private JButton charButton5;
    private JButton charButton6;
    private JButton charButton7;
    private JButton charButton8;
    private JButton charButton9;
    private JButton charButton10;
    private JButton charButton11;
    private JButton charButton12;
    private JButton charDelete1;
    private JButton charDelete2;
    private JButton charDelete3;
    private JButton charDelete4;
    private JButton charDelete5;
    private JButton charDelete6;
    private JButton charDelete7;
    private JButton charDelete8;
    private JButton charDelete9;
    private JButton charDelete10;
    private JButton charDelete11;
    private JButton charDelete12;
    private JButton logoutButton;
    private JTable PastSessionsTable;

    GMController controller;
    ArrayList<Campaign> campaignsList;

    private int campaignCount;

    ArrayList<Session> campaign1Sessions;
    ArrayList<Session> campaign2Sessions;
    ArrayList<Session> campaign3Sessions;
    ArrayList<Session> campaign4Sessions;
    ArrayList<Session> campaign5Sessions;
    ArrayList<Session> campaign6Sessions;




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

    private void hideCharacter(){
        ButtonHidden.twoButtonHide(character1,charButton1,charDelete1);
        ButtonHidden.twoButtonHide(character2,charButton2,charDelete2);
        ButtonHidden.twoButtonHide(character3,charButton3,charDelete3);
        ButtonHidden.twoButtonHide(character4,charButton4,charDelete4);
        ButtonHidden.twoButtonHide(character5,charButton5,charDelete5);
        ButtonHidden.twoButtonHide(character6,charButton6,charDelete6);
        ButtonHidden.twoButtonHide(character7,charButton7,charDelete7);
        ButtonHidden.twoButtonHide(character8,charButton8,charDelete8);
        ButtonHidden.twoButtonHide(character9,charButton9,charDelete9);
        ButtonHidden.twoButtonHide(character10,charButton10,charDelete10);
        ButtonHidden.twoButtonHide(character11,charButton11,charDelete11);
        ButtonHidden.twoButtonHide(character12,charButton12,charDelete12);


    }

    public GameMasterLandingPage(GMController controller, ArrayList<Campaign> campaigns){
        campaignCount = 0;
        this.controller=controller;
        this.campaignsList = campaigns;

        createUIComponents();
        hideContent();
        hideSession();
        hideCharacter();

        loadCampaigns();
//        ListSessions();

        //create campaign button
        createANewCampaignButton.setActionCommand("CreateCampaign");
        createANewCampaignButton.addActionListener(this);

        //create session button
        startANewSessionButton.setActionCommand("CreateSession");
        startANewSessionButton.addActionListener(this);

        //create character button
        createANewCharacterButton.setActionCommand("CreateCharacter");
        createANewCharacterButton.addActionListener(this);

        //logout button
        logoutButton.setActionCommand("Logout");
        logoutButton.addActionListener(this);

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

        //delete session action
        sDelete1.setActionCommand("ds1");
        sDelete2.setActionCommand("ds2");
        sDelete3.setActionCommand("ds3");
        sDelete4.setActionCommand("ds4");
        sDelete5.setActionCommand("ds5");
        sDelete6.setActionCommand("ds6");
        sDelete7.setActionCommand("ds7");
        sDelete8.setActionCommand("ds8");
        sDelete9.setActionCommand("ds9");
        sDelete10.setActionCommand("ds10");
        sDelete11.setActionCommand("ds11");
        sDelete12.setActionCommand("ds12");

        sDelete1.addActionListener(this);
        sDelete2.addActionListener(this);
        sDelete3.addActionListener(this);
        sDelete4.addActionListener(this);
        sDelete5.addActionListener(this);
        sDelete6.addActionListener(this);
        sDelete7.addActionListener(this);
        sDelete8.addActionListener(this);
        sDelete9.addActionListener(this);
        sDelete10.addActionListener(this);
        sDelete11.addActionListener(this);
        sDelete12.addActionListener(this);
    }

    public void loadCampaigns(){
        campaignMax.setText("Active Campaigns: " + controller.loggedInUser.campaignCount);
        System.out.println(controller.loggedInUser.campaignCount);
        if(controller.loggedInUser.campaignCount>0) {
            if(controller.loggedInUser.campaignCount>0){
                campaignL1.setText(campaignsList.get(0).getCampaignName());
                hideContent();
            }
            if(controller.loggedInUser.campaignCount>1){
                campaignL2.setText(campaignsList.get(1).getCampaignName());
                hideContent();
            }
            if(controller.loggedInUser.campaignCount>2){
                campaignL3.setText(campaignsList.get(2).getCampaignName());
                hideContent();
            }
            if(controller.loggedInUser.campaignCount>3){
                campaignL4.setText(campaignsList.get(3).getCampaignName());
                hideContent();
            }
            if(controller.loggedInUser.campaignCount>4){
                campaignL5.setText(campaignsList.get(4).getCampaignName());
                hideContent();
            }
            if(controller.loggedInUser.campaignCount>5){
                campaignL6.setText(campaignsList.get(5).getCampaignName());
                hideContent();
            }
        }

        }


    public void ListSessions(){
        if(controller.loggedInUser.campaignCount==1) {
            campaign1Sessions = campaignsList.get(0).getSessionListClean();
        }else if(controller.loggedInUser.campaignCount==2){
            campaign1Sessions = campaignsList.get(0).getSessionListClean();
            campaign2Sessions = campaignsList.get(1).getSessionListClean();
        }else if(controller.loggedInUser.campaignCount==3){
            campaign1Sessions = campaignsList.get(0).getSessionListClean();
            campaign2Sessions = campaignsList.get(1).getSessionListClean();
            campaign3Sessions = campaignsList.get(2).getSessionListClean();
        }else if(controller.loggedInUser.campaignCount==4){
            campaign1Sessions = campaignsList.get(0).getSessionListClean();
            campaign2Sessions = campaignsList.get(1).getSessionListClean();
            campaign3Sessions = campaignsList.get(2).getSessionListClean();
            campaign4Sessions = campaignsList.get(3).getSessionListClean();
        }else if(controller.loggedInUser.campaignCount==5){
            campaign1Sessions = campaignsList.get(0).getSessionListClean();
            campaign2Sessions = campaignsList.get(1).getSessionListClean();
            campaign3Sessions = campaignsList.get(2).getSessionListClean();
            campaign4Sessions = campaignsList.get(3).getSessionListClean();
            campaign5Sessions = campaignsList.get(4).getSessionListClean();
        }else if(controller.loggedInUser.campaignCount==6){
            campaign1Sessions = campaignsList.get(0).getSessionListClean();
            campaign2Sessions = campaignsList.get(1).getSessionListClean();
            campaign3Sessions = campaignsList.get(2).getSessionListClean();
            campaign4Sessions = campaignsList.get(3).getSessionListClean();
            campaign5Sessions = campaignsList.get(4).getSessionListClean();
            campaign6Sessions = campaignsList.get(5).getSessionListClean();
        }
        else{
            campaign1Sessions = new ArrayList<>();
            campaign2Sessions = new ArrayList<>();
            campaign3Sessions = new ArrayList<>();
            campaign4Sessions = new ArrayList<>();
            campaign5Sessions = new ArrayList<>();
            campaign6Sessions = new ArrayList<>();

        }
        if(!campaign1Sessions.isEmpty()){
            for(int i = 0; i< campaign1Sessions.size(); i++){
                if(i==0){
                    sessionL1.setText(campaign1Sessions.get(0).getSessionName());
                    sCampaign1.setText(campaignsList.get(0).getCampaignName());
                    sDate1.setText(campaign1Sessions.get(0).getTimeStart());
                }if(i==1){
                    sessionL2.setText(campaign1Sessions.get(1).getSessionName());
                    sCampaign2.setText(campaignsList.get(1).getCampaignName());
                    sDate2.setText(campaign1Sessions.get(1).getTimeStart());
                }if(i==2){
                    sessionL3.setText(campaign1Sessions.get(2).getSessionName());
                    sCampaign3.setText(campaignsList.get(2).getCampaignName());
                    sDate3.setText(campaign1Sessions.get(2).getTimeStart());
                }if(i==3){
                    sessionL4.setText(campaign1Sessions.get(3).getSessionName());
                    sCampaign4.setText(campaignsList.get(3).getCampaignName());
                    sDate4.setText(campaign1Sessions.get(3).getTimeStart());
                }if(i==4){
                    sessionL5.setText(campaign1Sessions.get(4).getSessionName());
                    sCampaign5.setText(campaignsList.get(4).getCampaignName());
                    sDate5.setText(campaign1Sessions.get(4).getTimeStart());
                }if(i==5){
                    sessionL6.setText(campaign1Sessions.get(5).getSessionName());
                    sCampaign6.setText(campaignsList.get(5).getCampaignName());
                    sDate6.setText(campaign1Sessions.get(5).getTimeStart());
                }if(i==6){
                    sessionL7.setText(campaign1Sessions.get(6).getSessionName());
                    sCampaign7.setText(campaignsList.get(6).getCampaignName());
                    sDate7.setText(campaign1Sessions.get(6).getTimeStart());
                }if(i==7){
                    sessionL8.setText(campaign1Sessions.get(7).getSessionName());
                    sCampaign8.setText(campaignsList.get(7).getCampaignName());
                    sDate8.setText(campaign1Sessions.get(7).getTimeStart());
                }if(i==8){
                    sessionL9.setText(campaign1Sessions.get(8).getSessionName());
                    sCampaign9.setText(campaignsList.get(8).getCampaignName());
                    sDate9.setText(campaign1Sessions.get(8).getTimeStart());
                }if(i==9){
                    sessionL10.setText(campaign1Sessions.get(9).getSessionName());
                    sCampaign10.setText(campaignsList.get(9).getCampaignName());
                    sDate10.setText(campaign1Sessions.get(9).getTimeStart());
                }if(i==10){
                    sessionL11.setText(campaign1Sessions.get(10).getSessionName());
                    sCampaign11.setText(campaignsList.get(10).getCampaignName());
                    sDate11.setText(campaign1Sessions.get(10).getTimeStart());
                }if(i==11){
                    sessionL12.setText(campaign1Sessions.get(11).getSessionName());
                    sCampaign12.setText(campaignsList.get(11).getCampaignName());
                    sDate12.setText(campaign1Sessions.get(11).getTimeStart());
                }


            }
        }if(!campaign2Sessions.isEmpty()){
            for(int i = 0; i< campaign2Sessions.size(); i++){
                if(i==0){
                    sessionL1.setText(campaign2Sessions.get(0).getSessionName());
                    sCampaign1.setText(campaignsList.get(2).getCampaignName());
                    sDate1.setText(campaign2Sessions.get(0).getTimeStart());
                }if(i==1){
                    sessionL2.setText(campaign2Sessions.get(1).getSessionName());
                    sCampaign2.setText(campaignsList.get(2).getCampaignName());
                    sDate2.setText(campaign2Sessions.get(1).getTimeStart());
                }if(i==2){
                    sessionL3.setText(campaign2Sessions.get(2).getSessionName());
                    sCampaign3.setText(campaignsList.get(2).getCampaignName());
                    sDate3.setText(campaign2Sessions.get(2).getTimeStart());
                }if(i==3){
                    sessionL4.setText(campaign2Sessions.get(3).getSessionName());
                    sCampaign4.setText(campaignsList.get(2).getCampaignName());
                    sDate4.setText(campaign2Sessions.get(3).getTimeStart());
                }if(i==4){
                    sessionL5.setText(campaign2Sessions.get(4).getSessionName());
                    sCampaign5.setText(campaignsList.get(2).getCampaignName());
                    sDate5.setText(campaign2Sessions.get(4).getTimeStart());
                }if(i==5){
                    sessionL6.setText(campaign2Sessions.get(5).getSessionName());
                    sCampaign6.setText(campaignsList.get(2).getCampaignName());
                    sDate6.setText(campaign2Sessions.get(5).getTimeStart());
                }if(i==6){
                    sessionL7.setText(campaign2Sessions.get(6).getSessionName());
                    sCampaign7.setText(campaignsList.get(2).getCampaignName());
                    sDate7.setText(campaign2Sessions.get(6).getTimeStart());
                }if(i==7){
                    sessionL8.setText(campaign2Sessions.get(7).getSessionName());
                    sCampaign8.setText(campaignsList.get(2).getCampaignName());
                    sDate8.setText(campaign2Sessions.get(7).getTimeStart());
                }if(i==8){
                    sessionL9.setText(campaign2Sessions.get(8).getSessionName());
                    sCampaign9.setText(campaignsList.get(2).getCampaignName());
                    sDate9.setText(campaign2Sessions.get(8).getTimeStart());
                }if(i==9){
                    sessionL10.setText(campaign2Sessions.get(9).getSessionName());
                    sCampaign10.setText(campaignsList.get(2).getCampaignName());
                    sDate10.setText(campaign2Sessions.get(9).getTimeStart());
                }if(i==10){
                    sessionL11.setText(campaign2Sessions.get(10).getSessionName());
                    sCampaign11.setText(campaignsList.get(2).getCampaignName());
                    sDate11.setText(campaign2Sessions.get(10).getTimeStart());
                }if(i==11){
                    sessionL12.setText(campaign2Sessions.get(11).getSessionName());
                    sCampaign12.setText(campaignsList.get(2).getCampaignName());
                    sDate12.setText(campaign2Sessions.get(11).getTimeStart());
                }


            }
        }if(!campaign3Sessions.isEmpty()){
            for(int i = 0; i< campaign3Sessions.size(); i++){
                if(i==0){
                    sessionL1.setText(campaign3Sessions.get(0).getSessionName());
                    sCampaign1.setText(campaignsList.get(3).getCampaignName());
                    sDate1.setText(campaign3Sessions.get(0).getTimeStart());
                }if(i==1){
                    sessionL2.setText(campaign3Sessions.get(1).getSessionName());
                    sCampaign2.setText(campaignsList.get(3).getCampaignName());
                    sDate2.setText(campaign3Sessions.get(1).getTimeStart());
                }if(i==2){
                    sessionL3.setText(campaign3Sessions.get(2).getSessionName());
                    sCampaign3.setText(campaignsList.get(3).getCampaignName());
                    sDate3.setText(campaign3Sessions.get(2).getTimeStart());
                }if(i==3){
                    sessionL4.setText(campaign3Sessions.get(3).getSessionName());
                    sCampaign4.setText(campaignsList.get(3).getCampaignName());
                    sDate4.setText(campaign3Sessions.get(3).getTimeStart());
                }if(i==4){
                    sessionL5.setText(campaign3Sessions.get(4).getSessionName());
                    sCampaign5.setText(campaignsList.get(3).getCampaignName());
                    sDate5.setText(campaign3Sessions.get(4).getTimeStart());
                }if(i==5){
                    sessionL6.setText(campaign3Sessions.get(5).getSessionName());
                    sCampaign6.setText(campaignsList.get(3).getCampaignName());
                    sDate6.setText(campaign3Sessions.get(5).getTimeStart());
                }if(i==6){
                    sessionL7.setText(campaign3Sessions.get(6).getSessionName());
                    sCampaign7.setText(campaignsList.get(3).getCampaignName());
                    sDate7.setText(campaign3Sessions.get(6).getTimeStart());
                }if(i==7){
                    sessionL8.setText(campaign3Sessions.get(7).getSessionName());
                    sCampaign8.setText(campaignsList.get(3).getCampaignName());
                    sDate8.setText(campaign3Sessions.get(7).getTimeStart());
                }if(i==8){
                    sessionL9.setText(campaign3Sessions.get(8).getSessionName());
                    sCampaign9.setText(campaignsList.get(3).getCampaignName());
                    sDate9.setText(campaign3Sessions.get(8).getTimeStart());
                }if(i==9){
                    sessionL10.setText(campaign3Sessions.get(9).getSessionName());
                    sCampaign10.setText(campaignsList.get(3).getCampaignName());
                    sDate10.setText(campaign3Sessions.get(9).getTimeStart());
                }if(i==10){
                    sessionL11.setText(campaign3Sessions.get(10).getSessionName());
                    sCampaign11.setText(campaignsList.get(3).getCampaignName());
                    sDate11.setText(campaign3Sessions.get(10).getTimeStart());
                }if(i==11){
                    sessionL12.setText(campaign3Sessions.get(11).getSessionName());
                    sCampaign12.setText(campaignsList.get(3).getCampaignName());
                    sDate12.setText(campaign3Sessions.get(11).getTimeStart());
                }


            }
        }if(!campaign4Sessions.isEmpty()) {
            for (int i = 0; i < campaign4Sessions.size(); i++) {
                if (i == 0) {
                    sessionL1.setText(campaign4Sessions.get(0).getSessionName());
                    sCampaign1.setText(campaignsList.get(4).getCampaignName());
                    sDate1.setText(campaign4Sessions.get(0).getTimeStart());
                }
                if (i == 1) {
                    sessionL2.setText(campaign4Sessions.get(1).getSessionName());
                    sCampaign2.setText(campaignsList.get(4).getCampaignName());
                    sDate2.setText(campaign4Sessions.get(1).getTimeStart());
                }
                if (i == 2) {
                    sessionL3.setText(campaign4Sessions.get(2).getSessionName());
                    sCampaign3.setText(campaignsList.get(4).getCampaignName());
                    sDate3.setText(campaign4Sessions.get(2).getTimeStart());
                }
                if (i == 3) {
                    sessionL4.setText(campaign4Sessions.get(3).getSessionName());
                    sCampaign4.setText(campaignsList.get(4).getCampaignName());
                    sDate4.setText(campaign4Sessions.get(3).getTimeStart());
                }
                if (i == 4) {
                    sessionL5.setText(campaign4Sessions.get(4).getSessionName());
                    sCampaign5.setText(campaignsList.get(4).getCampaignName());
                    sDate5.setText(campaign4Sessions.get(4).getTimeStart());
                }
                if (i == 5) {
                    sessionL6.setText(campaign4Sessions.get(5).getSessionName());
                    sCampaign6.setText(campaignsList.get(4).getCampaignName());
                    sDate6.setText(campaign4Sessions.get(5).getTimeStart());
                }
                if (i == 6) {
                    sessionL7.setText(campaign4Sessions.get(6).getSessionName());
                    sCampaign7.setText(campaignsList.get(4).getCampaignName());
                    sDate7.setText(campaign4Sessions.get(6).getTimeStart());
                }
                if (i == 7) {
                    sessionL8.setText(campaign4Sessions.get(7).getSessionName());
                    sCampaign8.setText(campaignsList.get(4).getCampaignName());
                    sDate8.setText(campaign4Sessions.get(7).getTimeStart());
                }
                if (i == 8) {
                    sessionL9.setText(campaign4Sessions.get(8).getSessionName());
                    sCampaign9.setText(campaignsList.get(4).getCampaignName());
                    sDate9.setText(campaign4Sessions.get(8).getTimeStart());
                }
                if (i == 9) {
                    sessionL10.setText(campaign4Sessions.get(9).getSessionName());
                    sCampaign10.setText(campaignsList.get(4).getCampaignName());
                    sDate10.setText(campaign4Sessions.get(9).getTimeStart());
                }
                if (i == 10) {
                    sessionL11.setText(campaign4Sessions.get(10).getSessionName());
                    sCampaign11.setText(campaignsList.get(4).getCampaignName());
                    sDate11.setText(campaign4Sessions.get(10).getTimeStart());
                }
                if (i == 11) {
                    sessionL12.setText(campaign4Sessions.get(11).getSessionName());
                    sCampaign12.setText(campaignsList.get(4).getCampaignName());
                    sDate12.setText(campaign4Sessions.get(11).getTimeStart());
                }
            }
        }if(!campaign5Sessions.isEmpty()) {
            for (int i = 0; i < campaign5Sessions.size(); i++) {
                if (i == 0) {
                    sessionL1.setText(campaign5Sessions.get(0).getSessionName());
                    sCampaign1.setText(campaignsList.get(5).getCampaignName());
                    sDate1.setText(campaign5Sessions.get(0).getTimeStart());
                }
                if (i == 1) {
                    sessionL2.setText(campaign5Sessions.get(1).getSessionName());
                    sCampaign2.setText(campaignsList.get(5).getCampaignName());
                    sDate2.setText(campaign5Sessions.get(1).getTimeStart());
                }
                if (i == 2) {
                    sessionL3.setText(campaign5Sessions.get(2).getSessionName());
                    sCampaign3.setText(campaignsList.get(5).getCampaignName());
                    sDate3.setText(campaign5Sessions.get(2).getTimeStart());
                }
                if (i == 3) {
                    sessionL4.setText(campaign5Sessions.get(3).getSessionName());
                    sCampaign4.setText(campaignsList.get(5).getCampaignName());
                    sDate4.setText(campaign5Sessions.get(3).getTimeStart());
                }
                if (i == 4) {
                    sessionL5.setText(campaign5Sessions.get(4).getSessionName());
                    sCampaign5.setText(campaignsList.get(5).getCampaignName());
                    sDate5.setText(campaign5Sessions.get(4).getTimeStart());
                }
                if (i == 5) {
                    sessionL6.setText(campaign5Sessions.get(5).getSessionName());
                    sCampaign6.setText(campaignsList.get(5).getCampaignName());
                    sDate6.setText(campaign5Sessions.get(5).getTimeStart());
                }
                if (i == 6) {
                    sessionL7.setText(campaign5Sessions.get(6).getSessionName());
                    sCampaign7.setText(campaignsList.get(5).getCampaignName());
                    sDate7.setText(campaign5Sessions.get(6).getTimeStart());
                }
                if (i == 7) {
                    sessionL8.setText(campaign5Sessions.get(7).getSessionName());
                    sCampaign8.setText(campaignsList.get(5).getCampaignName());
                    sDate8.setText(campaign5Sessions.get(7).getTimeStart());
                }
                if (i == 8) {
                    sessionL9.setText(campaign5Sessions.get(8).getSessionName());
                    sCampaign9.setText(campaignsList.get(5).getCampaignName());
                    sDate9.setText(campaign5Sessions.get(8).getTimeStart());
                }
                if (i == 9) {
                    sessionL10.setText(campaign5Sessions.get(9).getSessionName());
                    sCampaign10.setText(campaignsList.get(5).getCampaignName());
                    sDate10.setText(campaign5Sessions.get(9).getTimeStart());
                }
                if (i == 10) {
                    sessionL11.setText(campaign5Sessions.get(10).getSessionName());
                    sCampaign11.setText(campaignsList.get(5).getCampaignName());
                    sDate11.setText(campaign5Sessions.get(10).getTimeStart());
                }
                if (i == 11) {
                    sessionL12.setText(campaign5Sessions.get(11).getSessionName());
                    sCampaign12.setText(campaignsList.get(5).getCampaignName());
                    sDate12.setText(campaign5Sessions.get(11).getTimeStart());
                }
            }
        }if(!campaign6Sessions.isEmpty()) {
            for (int i = 0; i < campaign6Sessions.size(); i++) {
                if (i == 0) {
                    sessionL1.setText(campaign6Sessions.get(0).getSessionName());
                    sCampaign1.setText(campaignsList.get(6).getCampaignName());
                    sDate1.setText(campaign6Sessions.get(0).getTimeStart());
                }
                if (i == 1) {
                    sessionL2.setText(campaign6Sessions.get(1).getSessionName());
                    sCampaign2.setText(campaignsList.get(6).getCampaignName());
                    sDate2.setText(campaign6Sessions.get(1).getTimeStart());
                }
                if (i == 2) {
                    sessionL3.setText(campaign6Sessions.get(2).getSessionName());
                    sCampaign3.setText(campaignsList.get(6).getCampaignName());
                    sDate3.setText(campaign6Sessions.get(2).getTimeStart());
                }
                if (i == 3) {
                    sessionL4.setText(campaign6Sessions.get(3).getSessionName());
                    sCampaign4.setText(campaignsList.get(6).getCampaignName());
                    sDate4.setText(campaign6Sessions.get(3).getTimeStart());
                }
                if (i == 4) {
                    sessionL5.setText(campaign6Sessions.get(4).getSessionName());
                    sCampaign5.setText(campaignsList.get(6).getCampaignName());
                    sDate5.setText(campaign6Sessions.get(4).getTimeStart());
                }
                if (i == 5) {
                    sessionL6.setText(campaign6Sessions.get(5).getSessionName());
                    sCampaign6.setText(campaignsList.get(6).getCampaignName());
                    sDate6.setText(campaign6Sessions.get(5).getTimeStart());
                }
                if (i == 6) {
                    sessionL7.setText(campaign6Sessions.get(6).getSessionName());
                    sCampaign7.setText(campaignsList.get(6).getCampaignName());
                    sDate7.setText(campaign6Sessions.get(6).getTimeStart());
                }
                if (i == 7) {
                    sessionL8.setText(campaign6Sessions.get(7).getSessionName());
                    sCampaign8.setText(campaignsList.get(6).getCampaignName());
                    sDate8.setText(campaign6Sessions.get(7).getTimeStart());
                }
                if (i == 8) {
                    sessionL9.setText(campaign6Sessions.get(8).getSessionName());
                    sCampaign9.setText(campaignsList.get(6).getCampaignName());
                    sDate9.setText(campaign6Sessions.get(8).getTimeStart());
                }
                if (i == 9) {
                    sessionL10.setText(campaign6Sessions.get(9).getSessionName());
                    sCampaign10.setText(campaignsList.get(6).getCampaignName());
                    sDate10.setText(campaign6Sessions.get(9).getTimeStart());
                }
                if (i == 10) {
                    sessionL11.setText(campaign6Sessions.get(10).getSessionName());
                    sCampaign11.setText(campaignsList.get(6).getCampaignName());
                    sDate11.setText(campaign6Sessions.get(10).getTimeStart());
                }
                if (i == 11) {
                    sessionL12.setText(campaign6Sessions.get(11).getSessionName());
                    sCampaign12.setText(campaignsList.get(6).getCampaignName());
                    sDate12.setText(campaign6Sessions.get(11).getTimeStart());
                }
            }
        }
    }
    public void loadSessions(){

    }

    public void actionPerformed(ActionEvent ae){

        String action = ae.getActionCommand();
        if(action.equals("CreateCampaign")) {
            String newCampaign = JOptionPane.showInputDialog("What is the name of your new Campaign?", null);
            if (!newCampaign.equals("")) {
                if (campaignL1.getText().equals("")) {
                    controller.createCampaign(newCampaign); //need to test campaign name valid
                    try {
                        System.out.println(controller.loggedInUser.getACreatedCampaign(newCampaign));
                    } catch (FileNotFoundException e){
                        e.printStackTrace();
                    }
                    campaignL1.setText(newCampaign);
                    campaignCount++;
                    campaignMax.setText("Active Campaigns: "+controller.loggedInUser.campaignCount);
                    hideContent();
                } else if (campaignL2.getText().equals("")) {
                    controller.createCampaign(newCampaign);
                    try {
                        System.out.println(controller.loggedInUser.getACreatedCampaign(newCampaign));
                    } catch (FileNotFoundException e){
                        e.printStackTrace();
                    }
                    campaignL2.setText(newCampaign);
                    campaignCount++;
                    campaignMax.setText("Active Campaigns: "+controller.loggedInUser.campaignCount);
                    hideContent();
                } else if (campaignL3.getText().equals("")) {
                    controller.createCampaign(newCampaign);
                    try {
                        System.out.println(controller.loggedInUser.getACreatedCampaign(newCampaign));
                    } catch (FileNotFoundException e){
                        e.printStackTrace();
                    }
                    campaignL3.setText(newCampaign);
                    campaignCount++;
                    campaignMax.setText("Active Campaigns: "+controller.loggedInUser.campaignCount);
                    hideContent();
                } else if (campaignL4.getText().equals("")) {
                    controller.createCampaign(newCampaign);
                    try {
                        System.out.println(controller.loggedInUser.getACreatedCampaign(newCampaign));
                    } catch (FileNotFoundException e){
                        e.printStackTrace();
                    }
                    campaignL4.setText(newCampaign);
                    campaignCount++;
                    campaignMax.setText("Active Campaigns: "+controller.loggedInUser.campaignCount);
                    hideContent();
                } else if (campaignL5.getText().equals("")) {
                    controller.createCampaign(newCampaign);
                    try {
                        System.out.println(controller.loggedInUser.getACreatedCampaign(newCampaign));
                    } catch (FileNotFoundException e){
                        e.printStackTrace();
                    }
                    campaignL5.setText(newCampaign);
                    campaignCount++;
                    campaignMax.setText("Active Campaigns: "+controller.loggedInUser.campaignCount);
                    hideContent();
                } else if (campaignL6.getText().equals("")) {
                    controller.createCampaign(newCampaign);
                    try {
                        System.out.println(controller.loggedInUser.getACreatedCampaign(newCampaign));
                    } catch (FileNotFoundException e){
                        e.printStackTrace();
                    }
                    campaignL6.setText(newCampaign);
                    campaignCount++;
                    campaignMax.setText("Active Campaigns: "+controller.loggedInUser.campaignCount);
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
                    controller.loggedInUser.deleteCampaign(confirm);
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
                    controller.loggedInUser.deleteCampaign(confirm);
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
                    controller.loggedInUser.deleteCampaign(confirm);
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
                    controller.loggedInUser.deleteCampaign(confirm);
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
                    controller.loggedInUser.deleteCampaign(confirm);
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
                    controller.loggedInUser.deleteCampaign(confirm);
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
                Session session = controller.loggedInUser.getACreatedCampaign(campName).createSession(sessName); //needs to check for valid session name and campaign name
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

        if(action.equals("ds1")){
            try {
                Campaign camp = controller.loggedInUser.getACreatedCampaign(sCampaign1.getText());
                camp.deleteSession(sessionL1.getText());
                sessionL1.setText("");
                sCampaign1.setText("");
                sDate1.setText("");
                hideSession();
            }catch(FileNotFoundException e){
                e.printStackTrace();
            }
        }else if(action.equals("ds2")){
            try {
                Campaign camp = controller.loggedInUser.getACreatedCampaign(sCampaign2.getText());
                camp.deleteSession(sessionL2.getText());
                sessionL2.setText("");
                sCampaign2.setText("");
                sDate2.setText("");
                hideSession();
            }catch(FileNotFoundException e){
                e.printStackTrace();
            }
        }else if(action.equals("ds3")){
            try {
                Campaign camp = controller.loggedInUser.getACreatedCampaign(sCampaign3.getText());
                camp.deleteSession(sessionL3.getText());
                sessionL3.setText("");
                sCampaign3.setText("");
                sDate3.setText("");
                hideSession();
            }catch(FileNotFoundException e){
                e.printStackTrace();
            }
        }else if(action.equals("ds4")){
            try {
                Campaign camp = controller.loggedInUser.getACreatedCampaign(sCampaign4.getText());
                camp.deleteSession(sessionL4.getText());
                sessionL4.setText("");
                sCampaign4.setText("");
                sDate4.setText("");
                hideSession();
            }catch(FileNotFoundException e){
                e.printStackTrace();
            }
        }else if(action.equals("ds5")){
            try {
                Campaign camp = controller.loggedInUser.getACreatedCampaign(sCampaign5.getText());
                camp.deleteSession(sessionL5.getText());
                sessionL5.setText("");
                sCampaign5.setText("");
                sDate5.setText("");
                hideSession();
            }catch(FileNotFoundException e){
                e.printStackTrace();
            }
        }else if(action.equals("ds6")){
            try {
                Campaign camp = controller.loggedInUser.getACreatedCampaign(sCampaign6.getText());
                camp.deleteSession(sessionL6.getText());
                sessionL6.setText("");
                sCampaign6.setText("");
                sDate6.setText("");
                hideSession();
            }catch(FileNotFoundException e){
                e.printStackTrace();
            }
        }else if(action.equals("ds7")){
            try {
                Campaign camp = controller.loggedInUser.getACreatedCampaign(sCampaign7.getText());
                camp.deleteSession(sessionL7.getText());
                sessionL7.setText("");
                sCampaign7.setText("");
                sDate7.setText("");
                hideSession();
            }catch(FileNotFoundException e){
                e.printStackTrace();
            }
        }else if(action.equals("ds8")){
            try {
                Campaign camp = controller.loggedInUser.getACreatedCampaign(sCampaign8.getText());
                camp.deleteSession(sessionL8.getText());
                sessionL8.setText("");
                sCampaign8.setText("");
                sDate8.setText("");
                hideSession();
            }catch(FileNotFoundException e){
                e.printStackTrace();
            }
        }else if(action.equals("ds9")){
            try {
                Campaign camp = controller.loggedInUser.getACreatedCampaign(sCampaign9.getText());
                camp.deleteSession(sessionL9.getText());
                sessionL9.setText("");
                sCampaign9.setText("");
                sDate9.setText("");
                hideSession();
            }catch(FileNotFoundException e){
                e.printStackTrace();
            }
        }else if(action.equals("ds10")){
            try {
                Campaign camp = controller.loggedInUser.getACreatedCampaign(sCampaign10.getText());
                camp.deleteSession(sessionL10.getText());
                sessionL10.setText("");
                sCampaign10.setText("");
                sDate10.setText("");
                hideSession();
            }catch(FileNotFoundException e){
                e.printStackTrace();
            }
        }else if(action.equals("ds11")){
            try {
                Campaign camp = controller.loggedInUser.getACreatedCampaign(sCampaign11.getText());
                camp.deleteSession(sessionL11.getText());
                sessionL11.setText("");
                sCampaign11.setText("");
                sDate11.setText("");
                hideSession();
            }catch(FileNotFoundException e){
                e.printStackTrace();
            }
        }else if(action.equals("ds12")){
            try {
                Campaign camp = controller.loggedInUser.getACreatedCampaign(sCampaign12.getText());
                camp.deleteSession(sessionL12.getText());
                sessionL12.setText("");
                sCampaign12.setText("");
                sDate12.setText("");
                hideSession();
            }catch(FileNotFoundException e){
                e.printStackTrace();
            }
        }

        if(action.equals("Logout")){
            //TODO
        }

        if(action.equals("CreateCharacter")){
            JOptionPaneCharacter charOpt = new JOptionPaneCharacter();
            String characterName = charOpt.characterName;
            String charUser = charOpt.username;
        }

    }
}



