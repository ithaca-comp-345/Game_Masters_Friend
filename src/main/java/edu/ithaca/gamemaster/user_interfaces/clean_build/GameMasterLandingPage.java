package edu.ithaca.gamemaster.user_interfaces.clean_build;



import edu.ithaca.gamemaster.Character;
import edu.ithaca.gamemaster.Player;

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
    private JButton cButton1;
    private JPanel CharacterList;
    private JPanel NPCList;
    private JButton charButton1;
    private JPanel PastSessions;
    private JPanel CompletedCampaigns;
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
    public JLabel character1;
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
    private JLabel npc1;
    private JLabel npc2;
    private JButton npcButton1;
    private JButton npcButton2;
    private JLabel npc3;
    private JLabel npc4;
    private JLabel npc5;
    private JLabel npc6;
    private JLabel npc7;
    private JLabel npc8;
    private JLabel npc9;
    private JLabel npc10;
    private JLabel npc11;
    private JLabel npc12;
    private JLabel npc13;
    private JLabel npc14;
    private JLabel npc15;
    private JLabel npc16;
    private JButton npcDelete1;
    private JButton npcDelete2;
    private JButton npcDelete3;
    private JButton npcDelete4;
    private JButton npcDelete5;
    private JButton npcDelete6;
    private JButton npcDelete7;
    private JButton npcDelete8;
    private JButton npcDelete9;
    private JButton npcDelete10;
    private JButton npcDelete11;
    private JButton npcDelete12;
    private JButton npcDelete13;
    private JButton npcDelete14;
    private JButton npcDelete15;
    private JButton npcDelete16;
    private JButton npcButton3;
    private JButton npcButton4;
    private JButton npcButton5;
    private JButton npcButton6;
    private JButton npcButton7;
    private JButton npcButton8;
    private JButton npcButton9;
    private JButton npcButton10;
    private JButton npcButton11;
    private JButton npcButton12;
    private JButton npcButton13;
    private JButton npcButton14;
    private JButton npcButton15;
    private JButton npcButton16;
    private JLabel user;
    private JLabel pastCampaignL1;
    private JLabel pastCampaignL2;
    private JLabel pastCampaignL3;
    private JLabel pastCampaignL4;
    private JLabel pastCampaignL5;
    private JLabel pastCampaignL6;
    private JButton pastCDelete1;
    private JButton pastCDelete2;
    private JButton pastCDelete3;
    private JButton pastCDelete4;
    private JButton pastCDelete5;
    private JButton pastCDelete6;
    private JButton pastCButton1;
    private JButton pastCButton2;
    private JButton pastCButton3;
    private JButton pastCButton4;
    private JButton pastCButton5;
    private JButton pastCButton6;
    private JLabel pastSessionL1;
    private JLabel pastSessionL2;
    private JLabel pastSessionL3;
    private JLabel pastSessionL4;
    private JLabel pastSessionL5;
    private JLabel pastSessionL6;
    private JLabel pastSessionL7;
    private JLabel pastSessionL8;
    private JLabel pastSCampL1;
    private JLabel pastSCampL2;
    private JLabel pastSCampL3;
    private JLabel pastSCampL4;
    private JLabel pastSCampL5;
    private JLabel pastSCampL6;
    private JLabel pastSCampL7;
    private JLabel pastSCampL8;
    private JButton reviewSButton1;
    private JButton reviewSButton2;
    private JButton reviewSButton3;
    private JButton reviewSButton4;
    private JButton reviewSButton5;
    private JButton reviewSButton6;
    private JButton reviewSButton7;
    private JButton reviewSButton8;
    private JButton pastSDelete1;
    private JButton pastSDelete2;
    private JButton pastSDelete3;
    private JButton pastSDelete4;
    private JButton pastSDelete5;
    private JButton pastSDelete6;
    private JButton pastSDelete7;
    private JButton pastSDelete8;
    private JTable PastSessionsTable;

    //frame for edit character
    public static JFrame frame = new JFrame("Edit");
    public static JFrame campaignFrame = new JFrame("Campaign");

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

    private void hideNPC(){
        ButtonHidden.twoButtonHide(npc1,npcButton1,npcDelete1);
        ButtonHidden.twoButtonHide(npc2,npcButton2,npcDelete2);
        ButtonHidden.twoButtonHide(npc3,npcButton3,npcDelete3);
        ButtonHidden.twoButtonHide(npc4,npcButton4,npcDelete4);
        ButtonHidden.twoButtonHide(npc5,npcButton5,npcDelete5);
        ButtonHidden.twoButtonHide(npc6,npcButton6,npcDelete6);
        ButtonHidden.twoButtonHide(npc7,npcButton7,npcDelete7);
        ButtonHidden.twoButtonHide(npc8,npcButton8,npcDelete8);
        ButtonHidden.twoButtonHide(npc9,npcButton9,npcDelete9);
        ButtonHidden.twoButtonHide(npc10,npcButton10,npcDelete10);
        ButtonHidden.twoButtonHide(npc11,npcButton11,npcDelete11);
        ButtonHidden.twoButtonHide(npc12,npcButton12,npcDelete12);
        ButtonHidden.twoButtonHide(npc13,npcButton13,npcDelete13);
        ButtonHidden.twoButtonHide(npc14,npcButton14,npcDelete14);
        ButtonHidden.twoButtonHide(npc15,npcButton15,npcDelete15);
        ButtonHidden.twoButtonHide(npc16,npcButton16,npcDelete16);

    }

    private void hidePast(){
        ButtonHidden.twoButtonHide(pastCampaignL1,pastCButton1,pastCDelete1);
        ButtonHidden.twoButtonHide(pastCampaignL2,pastCButton2,pastCDelete2);
        ButtonHidden.twoButtonHide(pastCampaignL3,pastCButton3,pastCDelete3);
        ButtonHidden.twoButtonHide(pastCampaignL4,pastCButton4,pastCDelete4);
        ButtonHidden.twoButtonHide(pastCampaignL5,pastCButton5,pastCDelete5);
        ButtonHidden.twoButtonHide(pastCampaignL6,pastCButton6,pastCDelete6);

        ButtonHidden.twoButtonLabelHide(pastSessionL1,pastSCampL1,reviewSButton1,pastSDelete1);
        ButtonHidden.twoButtonLabelHide(pastSessionL2,pastSCampL2,reviewSButton2,pastSDelete2);
        ButtonHidden.twoButtonLabelHide(pastSessionL3,pastSCampL3,reviewSButton3,pastSDelete3);
        ButtonHidden.twoButtonLabelHide(pastSessionL4,pastSCampL4,reviewSButton4,pastSDelete4);
        ButtonHidden.twoButtonLabelHide(pastSessionL5,pastSCampL5,reviewSButton5,pastSDelete5);
        ButtonHidden.twoButtonLabelHide(pastSessionL6,pastSCampL6,reviewSButton6,pastSDelete6);
        ButtonHidden.twoButtonLabelHide(pastSessionL7,pastSCampL7,reviewSButton7,pastSDelete7);
        ButtonHidden.twoButtonLabelHide(pastSessionL8,pastSCampL8,reviewSButton8,pastSDelete8);
    }

    public GameMasterLandingPage(GMController controller, ArrayList<Campaign> campaigns){
        campaignCount = 0;
        this.controller=controller;
        this.campaignsList = campaigns;

        createUIComponents();

        //loads existing sessions
        loadSessions();
        //loads existing campaigns
        loadCampaigns();

        hideContent();
        hideSession();
        hideCharacter();
        hideNPC();
        hidePast();




        user.setText("User: "+controller.loggedInUser.getName());
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

        //create npc button
        createANewNPCButton.setActionCommand("CreateNPC");
        createANewNPCButton.addActionListener(this);


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

        //character delete actions
        charDelete1.setActionCommand("c1");
        charDelete2.setActionCommand("c2");
        charDelete3.setActionCommand("c3");
        charDelete4.setActionCommand("c4");
        charDelete5.setActionCommand("c5");
        charDelete6.setActionCommand("c6");
        charDelete7.setActionCommand("c7");
        charDelete8.setActionCommand("c8");
        charDelete9.setActionCommand("c9");
        charDelete10.setActionCommand("c10");
        charDelete11.setActionCommand("c11");
        charDelete12.setActionCommand("c12");

        charDelete1.addActionListener(this);
        charDelete2.addActionListener(this);
        charDelete3.addActionListener(this);
        charDelete4.addActionListener(this);
        charDelete5.addActionListener(this);
        charDelete6.addActionListener(this);
        charDelete7.addActionListener(this);
        charDelete8.addActionListener(this);
        charDelete9.addActionListener(this);
        charDelete10.addActionListener(this);
        charDelete11.addActionListener(this);
        charDelete12.addActionListener(this);

        npcDelete1.setActionCommand("nd1");
        npcDelete2.setActionCommand("nd2");
        npcDelete3.setActionCommand("nd3");
        npcDelete4.setActionCommand("nd4");
        npcDelete5.setActionCommand("nd5");
        npcDelete6.setActionCommand("nd6");
        npcDelete7.setActionCommand("nd7");
        npcDelete8.setActionCommand("nd8");
        npcDelete9.setActionCommand("nd9");
        npcDelete10.setActionCommand("nd10");
        npcDelete11.setActionCommand("nd11");
        npcDelete12.setActionCommand("nd12");
        npcDelete13.setActionCommand("nd13");
        npcDelete14.setActionCommand("nd14");
        npcDelete15.setActionCommand("nd15");
        npcDelete16.setActionCommand("nd16");

        npcDelete1.addActionListener(this);
        npcDelete2.addActionListener(this);
        npcDelete3.addActionListener(this);
        npcDelete4.addActionListener(this);
        npcDelete5.addActionListener(this);
        npcDelete6.addActionListener(this);
        npcDelete7.addActionListener(this);
        npcDelete8.addActionListener(this);
        npcDelete9.addActionListener(this);
        npcDelete10.addActionListener(this);
        npcDelete11.addActionListener(this);
        npcDelete12.addActionListener(this);
        npcDelete13.addActionListener(this);
        npcDelete14.addActionListener(this);
        npcDelete15.addActionListener(this);
        npcDelete16.addActionListener(this);

        //view character
        charButton1.setActionCommand("edit1");
        charButton2.setActionCommand("edit2");
        charButton3.setActionCommand("edit3");
        charButton4.setActionCommand("edit4");
        charButton5.setActionCommand("edit5");
        charButton6.setActionCommand("edit6");
        charButton7.setActionCommand("edit7");
        charButton8.setActionCommand("edit8");
        charButton9.setActionCommand("edit9");
        charButton10.setActionCommand("edit10");
        charButton11.setActionCommand("edit11");
        charButton12.setActionCommand("edit12");

        charButton1.addActionListener(this);
        charButton2.addActionListener(this);
        charButton3.addActionListener(this);
        charButton4.addActionListener(this);
        charButton5.addActionListener(this);
        charButton6.addActionListener(this);
        charButton7.addActionListener(this);
        charButton8.addActionListener(this);
        charButton9.addActionListener(this);
        charButton10.addActionListener(this);
        charButton11.addActionListener(this);
        charButton12.addActionListener(this);

        cButton1.setActionCommand("viewC1");
        cButton2.setActionCommand("viewC2");
        cButton3.setActionCommand("viewC3");
        cButton4.setActionCommand("viewC4");
        cButton5.setActionCommand("viewC5");
        cButton6.setActionCommand("viewC6");

        cButton1.addActionListener(this);
        cButton2.addActionListener(this);
        cButton3.addActionListener(this);
        cButton4.addActionListener(this);
        cButton5.addActionListener(this);
        cButton6.addActionListener(this);


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


    public void loadSessions(){
        //instantiates the lists of sessions for the ui to handle
        campaign1Sessions = new ArrayList<>();
        campaign2Sessions = new ArrayList<>();
        campaign3Sessions = new ArrayList<>();
        campaign4Sessions = new ArrayList<>();
        campaign5Sessions = new ArrayList<>();
        campaign6Sessions = new ArrayList<>();

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
        //I realize now this could be turned into a class in and of itself but this is being hacked together to make the deadline (needs to be fixed later prob)
        if(!campaign1Sessions.isEmpty()){
            for(int i = 0; i< campaign1Sessions.size(); i++){
                if(i==0){
                    sessionL1.setText(campaign1Sessions.get(0).getSessionName());
                    sCampaign1.setText(campaignsList.get(0).getCampaignName());
                    sDate1.setText(campaign1Sessions.get(0).getTimeStart());
                }if(i==1){
                    sessionL2.setText(campaign1Sessions.get(1).getSessionName());
                    sCampaign2.setText(campaignsList.get(0).getCampaignName());
                    sDate2.setText(campaign1Sessions.get(1).getTimeStart());
                }if(i==2){
                    sessionL3.setText(campaign1Sessions.get(2).getSessionName());
                    sCampaign3.setText(campaignsList.get(0).getCampaignName());
                    sDate3.setText(campaign1Sessions.get(2).getTimeStart());
                }if(i==3){
                    sessionL4.setText(campaign1Sessions.get(3).getSessionName());
                    sCampaign4.setText(campaignsList.get(0).getCampaignName());
                    sDate4.setText(campaign1Sessions.get(3).getTimeStart());
                }if(i==4){
                    sessionL5.setText(campaign1Sessions.get(4).getSessionName());
                    sCampaign5.setText(campaignsList.get(0).getCampaignName());
                    sDate5.setText(campaign1Sessions.get(4).getTimeStart());
                }if(i==5){
                    sessionL6.setText(campaign1Sessions.get(5).getSessionName());
                    sCampaign6.setText(campaignsList.get(0).getCampaignName());
                    sDate6.setText(campaign1Sessions.get(5).getTimeStart());
                }if(i==6){
                    sessionL7.setText(campaign1Sessions.get(6).getSessionName());
                    sCampaign7.setText(campaignsList.get(0).getCampaignName());
                    sDate7.setText(campaign1Sessions.get(6).getTimeStart());
                }if(i==7){
                    sessionL8.setText(campaign1Sessions.get(7).getSessionName());
                    sCampaign8.setText(campaignsList.get(0).getCampaignName());
                    sDate8.setText(campaign1Sessions.get(7).getTimeStart());
                }if(i==8){
                    sessionL9.setText(campaign1Sessions.get(8).getSessionName());
                    sCampaign9.setText(campaignsList.get(0).getCampaignName());
                    sDate9.setText(campaign1Sessions.get(8).getTimeStart());
                }if(i==9){
                    sessionL10.setText(campaign1Sessions.get(9).getSessionName());
                    sCampaign10.setText(campaignsList.get(0).getCampaignName());
                    sDate10.setText(campaign1Sessions.get(9).getTimeStart());
                }if(i==10){
                    sessionL11.setText(campaign1Sessions.get(10).getSessionName());
                    sCampaign11.setText(campaignsList.get(0).getCampaignName());
                    sDate11.setText(campaign1Sessions.get(10).getTimeStart());
                }if(i==11){
                    sessionL12.setText(campaign1Sessions.get(11).getSessionName());
                    sCampaign12.setText(campaignsList.get(0).getCampaignName());
                    sDate12.setText(campaign1Sessions.get(11).getTimeStart());
                }


            }
        }if(!campaign2Sessions.isEmpty()){
            for(int i = 0; i< campaign2Sessions.size(); i++){
                if(i==0){
                    sessionL1.setText(campaign2Sessions.get(0).getSessionName());
                    sCampaign1.setText(campaignsList.get(1).getCampaignName());
                    sDate1.setText(campaign2Sessions.get(0).getTimeStart());
                }if(i==1){
                    sessionL2.setText(campaign2Sessions.get(1).getSessionName());
                    sCampaign2.setText(campaignsList.get(1).getCampaignName());
                    sDate2.setText(campaign2Sessions.get(1).getTimeStart());
                }if(i==2){
                    sessionL3.setText(campaign2Sessions.get(2).getSessionName());
                    sCampaign3.setText(campaignsList.get(1).getCampaignName());
                    sDate3.setText(campaign2Sessions.get(2).getTimeStart());
                }if(i==3){
                    sessionL4.setText(campaign2Sessions.get(3).getSessionName());
                    sCampaign4.setText(campaignsList.get(1).getCampaignName());
                    sDate4.setText(campaign2Sessions.get(3).getTimeStart());
                }if(i==4){
                    sessionL5.setText(campaign2Sessions.get(4).getSessionName());
                    sCampaign5.setText(campaignsList.get(1).getCampaignName());
                    sDate5.setText(campaign2Sessions.get(4).getTimeStart());
                }if(i==5){
                    sessionL6.setText(campaign2Sessions.get(5).getSessionName());
                    sCampaign6.setText(campaignsList.get(1).getCampaignName());
                    sDate6.setText(campaign2Sessions.get(5).getTimeStart());
                }if(i==6){
                    sessionL7.setText(campaign2Sessions.get(6).getSessionName());
                    sCampaign7.setText(campaignsList.get(1).getCampaignName());
                    sDate7.setText(campaign2Sessions.get(6).getTimeStart());
                }if(i==7){
                    sessionL8.setText(campaign2Sessions.get(7).getSessionName());
                    sCampaign8.setText(campaignsList.get(1).getCampaignName());
                    sDate8.setText(campaign2Sessions.get(7).getTimeStart());
                }if(i==8){
                    sessionL9.setText(campaign2Sessions.get(8).getSessionName());
                    sCampaign9.setText(campaignsList.get(1).getCampaignName());
                    sDate9.setText(campaign2Sessions.get(8).getTimeStart());
                }if(i==9){
                    sessionL10.setText(campaign2Sessions.get(9).getSessionName());
                    sCampaign10.setText(campaignsList.get(1).getCampaignName());
                    sDate10.setText(campaign2Sessions.get(9).getTimeStart());
                }if(i==10){
                    sessionL11.setText(campaign2Sessions.get(10).getSessionName());
                    sCampaign11.setText(campaignsList.get(1).getCampaignName());
                    sDate11.setText(campaign2Sessions.get(10).getTimeStart());
                }if(i==11){
                    sessionL12.setText(campaign2Sessions.get(11).getSessionName());
                    sCampaign12.setText(campaignsList.get(1).getCampaignName());
                    sDate12.setText(campaign2Sessions.get(11).getTimeStart());
                }


            }
        }if(!campaign3Sessions.isEmpty()){
            for(int i = 0; i< campaign3Sessions.size(); i++){
                if(i==0){
                    sessionL1.setText(campaign3Sessions.get(0).getSessionName());
                    sCampaign1.setText(campaignsList.get(2).getCampaignName());
                    sDate1.setText(campaign3Sessions.get(0).getTimeStart());
                }if(i==1){
                    sessionL2.setText(campaign3Sessions.get(1).getSessionName());
                    sCampaign2.setText(campaignsList.get(2).getCampaignName());
                    sDate2.setText(campaign3Sessions.get(1).getTimeStart());
                }if(i==2){
                    sessionL3.setText(campaign3Sessions.get(2).getSessionName());
                    sCampaign3.setText(campaignsList.get(2).getCampaignName());
                    sDate3.setText(campaign3Sessions.get(2).getTimeStart());
                }if(i==3){
                    sessionL4.setText(campaign3Sessions.get(3).getSessionName());
                    sCampaign4.setText(campaignsList.get(2).getCampaignName());
                    sDate4.setText(campaign3Sessions.get(3).getTimeStart());
                }if(i==4){
                    sessionL5.setText(campaign3Sessions.get(4).getSessionName());
                    sCampaign5.setText(campaignsList.get(2).getCampaignName());
                    sDate5.setText(campaign3Sessions.get(4).getTimeStart());
                }if(i==5){
                    sessionL6.setText(campaign3Sessions.get(5).getSessionName());
                    sCampaign6.setText(campaignsList.get(2).getCampaignName());
                    sDate6.setText(campaign3Sessions.get(5).getTimeStart());
                }if(i==6){
                    sessionL7.setText(campaign3Sessions.get(6).getSessionName());
                    sCampaign7.setText(campaignsList.get(2).getCampaignName());
                    sDate7.setText(campaign3Sessions.get(6).getTimeStart());
                }if(i==7){
                    sessionL8.setText(campaign3Sessions.get(7).getSessionName());
                    sCampaign8.setText(campaignsList.get(2).getCampaignName());
                    sDate8.setText(campaign3Sessions.get(7).getTimeStart());
                }if(i==8){
                    sessionL9.setText(campaign3Sessions.get(8).getSessionName());
                    sCampaign9.setText(campaignsList.get(2).getCampaignName());
                    sDate9.setText(campaign3Sessions.get(8).getTimeStart());
                }if(i==9){
                    sessionL10.setText(campaign3Sessions.get(9).getSessionName());
                    sCampaign10.setText(campaignsList.get(2).getCampaignName());
                    sDate10.setText(campaign3Sessions.get(9).getTimeStart());
                }if(i==10){
                    sessionL11.setText(campaign3Sessions.get(10).getSessionName());
                    sCampaign11.setText(campaignsList.get(2).getCampaignName());
                    sDate11.setText(campaign3Sessions.get(10).getTimeStart());
                }if(i==11){
                    sessionL12.setText(campaign3Sessions.get(11).getSessionName());
                    sCampaign12.setText(campaignsList.get(2).getCampaignName());
                    sDate12.setText(campaign3Sessions.get(11).getTimeStart());
                }


            }
        }if(!campaign4Sessions.isEmpty()) {
            for (int i = 0; i < campaign4Sessions.size(); i++) {
                if (i == 0) {
                    sessionL1.setText(campaign4Sessions.get(0).getSessionName());
                    sCampaign1.setText(campaignsList.get(3).getCampaignName());
                    sDate1.setText(campaign4Sessions.get(0).getTimeStart());
                }
                if (i == 1) {
                    sessionL2.setText(campaign4Sessions.get(1).getSessionName());
                    sCampaign2.setText(campaignsList.get(3).getCampaignName());
                    sDate2.setText(campaign4Sessions.get(1).getTimeStart());
                }
                if (i == 2) {
                    sessionL3.setText(campaign4Sessions.get(2).getSessionName());
                    sCampaign3.setText(campaignsList.get(3).getCampaignName());
                    sDate3.setText(campaign4Sessions.get(2).getTimeStart());
                }
                if (i == 3) {
                    sessionL4.setText(campaign4Sessions.get(3).getSessionName());
                    sCampaign4.setText(campaignsList.get(3).getCampaignName());
                    sDate4.setText(campaign4Sessions.get(3).getTimeStart());
                }
                if (i == 4) {
                    sessionL5.setText(campaign4Sessions.get(4).getSessionName());
                    sCampaign5.setText(campaignsList.get(3).getCampaignName());
                    sDate5.setText(campaign4Sessions.get(4).getTimeStart());
                }
                if (i == 5) {
                    sessionL6.setText(campaign4Sessions.get(5).getSessionName());
                    sCampaign6.setText(campaignsList.get(3).getCampaignName());
                    sDate6.setText(campaign4Sessions.get(5).getTimeStart());
                }
                if (i == 6) {
                    sessionL7.setText(campaign4Sessions.get(6).getSessionName());
                    sCampaign7.setText(campaignsList.get(3).getCampaignName());
                    sDate7.setText(campaign4Sessions.get(6).getTimeStart());
                }
                if (i == 7) {
                    sessionL8.setText(campaign4Sessions.get(7).getSessionName());
                    sCampaign8.setText(campaignsList.get(3).getCampaignName());
                    sDate8.setText(campaign4Sessions.get(7).getTimeStart());
                }
                if (i == 8) {
                    sessionL9.setText(campaign4Sessions.get(8).getSessionName());
                    sCampaign9.setText(campaignsList.get(3).getCampaignName());
                    sDate9.setText(campaign4Sessions.get(8).getTimeStart());
                }
                if (i == 9) {
                    sessionL10.setText(campaign4Sessions.get(9).getSessionName());
                    sCampaign10.setText(campaignsList.get(3).getCampaignName());
                    sDate10.setText(campaign4Sessions.get(9).getTimeStart());
                }
                if (i == 10) {
                    sessionL11.setText(campaign4Sessions.get(10).getSessionName());
                    sCampaign11.setText(campaignsList.get(3).getCampaignName());
                    sDate11.setText(campaign4Sessions.get(10).getTimeStart());
                }
                if (i == 11) {
                    sessionL12.setText(campaign4Sessions.get(11).getSessionName());
                    sCampaign12.setText(campaignsList.get(3).getCampaignName());
                    sDate12.setText(campaign4Sessions.get(11).getTimeStart());
                }
            }
        }if(!campaign5Sessions.isEmpty()) {
            for (int i = 0; i < campaign5Sessions.size(); i++) {
                if (i == 0) {
                    sessionL1.setText(campaign5Sessions.get(0).getSessionName());
                    sCampaign1.setText(campaignsList.get(4).getCampaignName());
                    sDate1.setText(campaign5Sessions.get(0).getTimeStart());
                }
                if (i == 1) {
                    sessionL2.setText(campaign5Sessions.get(1).getSessionName());
                    sCampaign2.setText(campaignsList.get(4).getCampaignName());
                    sDate2.setText(campaign5Sessions.get(1).getTimeStart());
                }
                if (i == 2) {
                    sessionL3.setText(campaign5Sessions.get(2).getSessionName());
                    sCampaign3.setText(campaignsList.get(4).getCampaignName());
                    sDate3.setText(campaign5Sessions.get(2).getTimeStart());
                }
                if (i == 3) {
                    sessionL4.setText(campaign5Sessions.get(3).getSessionName());
                    sCampaign4.setText(campaignsList.get(4).getCampaignName());
                    sDate4.setText(campaign5Sessions.get(3).getTimeStart());
                }
                if (i == 4) {
                    sessionL5.setText(campaign5Sessions.get(4).getSessionName());
                    sCampaign5.setText(campaignsList.get(4).getCampaignName());
                    sDate5.setText(campaign5Sessions.get(4).getTimeStart());
                }
                if (i == 5) {
                    sessionL6.setText(campaign5Sessions.get(5).getSessionName());
                    sCampaign6.setText(campaignsList.get(4).getCampaignName());
                    sDate6.setText(campaign5Sessions.get(5).getTimeStart());
                }
                if (i == 6) {
                    sessionL7.setText(campaign5Sessions.get(6).getSessionName());
                    sCampaign7.setText(campaignsList.get(4).getCampaignName());
                    sDate7.setText(campaign5Sessions.get(6).getTimeStart());
                }
                if (i == 7) {
                    sessionL8.setText(campaign5Sessions.get(7).getSessionName());
                    sCampaign8.setText(campaignsList.get(4).getCampaignName());
                    sDate8.setText(campaign5Sessions.get(7).getTimeStart());
                }
                if (i == 8) {
                    sessionL9.setText(campaign5Sessions.get(8).getSessionName());
                    sCampaign9.setText(campaignsList.get(4).getCampaignName());
                    sDate9.setText(campaign5Sessions.get(8).getTimeStart());
                }
                if (i == 9) {
                    sessionL10.setText(campaign5Sessions.get(9).getSessionName());
                    sCampaign10.setText(campaignsList.get(4).getCampaignName());
                    sDate10.setText(campaign5Sessions.get(9).getTimeStart());
                }
                if (i == 10) {
                    sessionL11.setText(campaign5Sessions.get(10).getSessionName());
                    sCampaign11.setText(campaignsList.get(4).getCampaignName());
                    sDate11.setText(campaign5Sessions.get(10).getTimeStart());
                }
                if (i == 11) {
                    sessionL12.setText(campaign5Sessions.get(11).getSessionName());
                    sCampaign12.setText(campaignsList.get(4).getCampaignName());
                    sDate12.setText(campaign5Sessions.get(11).getTimeStart());
                }
            }
        }if(!campaign6Sessions.isEmpty()) {
            for (int i = 0; i < campaign6Sessions.size(); i++) {
                if (i == 0) {
                    sessionL1.setText(campaign6Sessions.get(0).getSessionName());
                    sCampaign1.setText(campaignsList.get(5).getCampaignName());
                    sDate1.setText(campaign6Sessions.get(0).getTimeStart());
                }
                if (i == 1) {
                    sessionL2.setText(campaign6Sessions.get(1).getSessionName());
                    sCampaign2.setText(campaignsList.get(5).getCampaignName());
                    sDate2.setText(campaign6Sessions.get(1).getTimeStart());
                }
                if (i == 2) {
                    sessionL3.setText(campaign6Sessions.get(2).getSessionName());
                    sCampaign3.setText(campaignsList.get(5).getCampaignName());
                    sDate3.setText(campaign6Sessions.get(2).getTimeStart());
                }
                if (i == 3) {
                    sessionL4.setText(campaign6Sessions.get(3).getSessionName());
                    sCampaign4.setText(campaignsList.get(5).getCampaignName());
                    sDate4.setText(campaign6Sessions.get(3).getTimeStart());
                }
                if (i == 4) {
                    sessionL5.setText(campaign6Sessions.get(4).getSessionName());
                    sCampaign5.setText(campaignsList.get(5).getCampaignName());
                    sDate5.setText(campaign6Sessions.get(4).getTimeStart());
                }
                if (i == 5) {
                    sessionL6.setText(campaign6Sessions.get(5).getSessionName());
                    sCampaign6.setText(campaignsList.get(5).getCampaignName());
                    sDate6.setText(campaign6Sessions.get(5).getTimeStart());
                }
                if (i == 6) {
                    sessionL7.setText(campaign6Sessions.get(6).getSessionName());
                    sCampaign7.setText(campaignsList.get(5).getCampaignName());
                    sDate7.setText(campaign6Sessions.get(6).getTimeStart());
                }
                if (i == 7) {
                    sessionL8.setText(campaign6Sessions.get(7).getSessionName());
                    sCampaign8.setText(campaignsList.get(5).getCampaignName());
                    sDate8.setText(campaign6Sessions.get(7).getTimeStart());
                }
                if (i == 8) {
                    sessionL9.setText(campaign6Sessions.get(8).getSessionName());
                    sCampaign9.setText(campaignsList.get(5).getCampaignName());
                    sDate9.setText(campaign6Sessions.get(8).getTimeStart());
                }
                if (i == 9) {
                    sessionL10.setText(campaign6Sessions.get(9).getSessionName());
                    sCampaign10.setText(campaignsList.get(5).getCampaignName());
                    sDate10.setText(campaign6Sessions.get(9).getTimeStart());
                }
                if (i == 10) {
                    sessionL11.setText(campaign6Sessions.get(10).getSessionName());
                    sCampaign11.setText(campaignsList.get(5).getCampaignName());
                    sDate11.setText(campaign6Sessions.get(10).getTimeStart());
                }
                if (i == 11) {
                    sessionL12.setText(campaign6Sessions.get(11).getSessionName());
                    sCampaign12.setText(campaignsList.get(5).getCampaignName());
                    sDate12.setText(campaign6Sessions.get(11).getTimeStart());
                }
            }
        }
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
        if(action.equals("viewC1")){
            openCampaign(controller, campaignFrame, campaignL1);
        }
        if(action.equals("viewC2")){
            openCampaign(controller, campaignFrame, campaignL2);
        }
        if(action.equals("viewC3")){
            openCampaign(controller, campaignFrame, campaignL3);
        }
        if(action.equals("viewC4")){
            openCampaign(controller, campaignFrame, campaignL4);
        }
        if(action.equals("viewC5")){
            openCampaign(controller, campaignFrame, campaignL5);
        }
        if(action.equals("viewC6")){
            openCampaign(controller, campaignFrame, campaignL6);
        }
        if(action.equals("dc1")){
            //needs to remove campaign from user
            String confirm = JOptionPane.showInputDialog("Deleting this campaign will delete all campaign-owned artifacts... Are you sure, type the name of the campaign to continue");
            if(confirm.equals(campaignL1.getText())) {
                pastCampaignL1.setText(campaignL1.getText());
                campaignL1.setText("");
                campaignCount--;
                campaignMax.setText("Active Campaigns: " + campaignCount);
                hideContent();
                hidePast();
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
                pastCampaignL2.setText(campaignL2.getText());
                campaignL2.setText("");
                campaignCount--;
                campaignMax.setText("Active Campaigns: " + campaignCount);
                hideContent();
                hidePast();
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
                pastCampaignL3.setText(campaignL3.getText());
                campaignL3.setText("");
                campaignCount--;
                campaignMax.setText("Active Campaigns: " + campaignCount);
                hideContent();
                hidePast();
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
                pastCampaignL4.setText(campaignL4.getText());
                campaignL4.setText("");
                campaignCount--;
                campaignMax.setText("Active Campaigns: " + campaignCount);
                hideContent();
                hidePast();
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
                pastCampaignL5.setText(campaignL5.getText());
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
            hidePast();

        }if(action.equals("dc6")){
            //needs to remove campaign from user
            String confirm = JOptionPane.showInputDialog("Deleting this campaign will delete all campaign-owned artifacts... Are you sure, type the name of the campaign to continue");
            if(confirm.equals(campaignL6.getText())) {
                pastCampaignL6.setText(campaignL6.getText());
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
            hidePast();

        }

        if(action.equals("CreateSession")){
            JOptionPaneMultiInput twoOpt = new JOptionPaneMultiInput();
            String sessName = twoOpt.sessionName;
            String campName = twoOpt.campaignName;
            try {
                Session session = controller.loggedInUser.getACreatedCampaign(campName).createSession(sessName); //creates and checks for valid session and campaign name
                session.start("Default Goal"); //goal is always default to start
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

                //updates past
                pastSessionL1.setText(sessionL1.getText());
                pastSCampL1.setText(sCampaign1.getText());

                //updates active
                sessionL1.setText("");
                sCampaign1.setText("");
                sDate1.setText("");

                //updates view format
                hideSession();
                hidePast();
            }catch(FileNotFoundException e){
                e.printStackTrace();
            }
        }else if(action.equals("ds2")){
            try {
                Campaign camp = controller.loggedInUser.getACreatedCampaign(sCampaign2.getText());
                camp.deleteSession(sessionL2.getText());

                pastSessionL2.setText(sessionL2.getText());
                pastSCampL2.setText(sCampaign2.getText());

                sessionL2.setText("");
                sCampaign2.setText("");
                sDate2.setText("");
                hideSession();
                hidePast();
            }catch(FileNotFoundException e){
                e.printStackTrace();
            }
        }else if(action.equals("ds3")){
            try {
                Campaign camp = controller.loggedInUser.getACreatedCampaign(sCampaign3.getText());
                camp.deleteSession(sessionL3.getText());

                pastSessionL3.setText(sessionL3.getText());
                pastSCampL3.setText(sCampaign3.getText());

                sessionL3.setText("");
                sCampaign3.setText("");
                sDate3.setText("");
                hideSession();
                hidePast();
            }catch(FileNotFoundException e){
                e.printStackTrace();
            }
        }else if(action.equals("ds4")){
            try {
                Campaign camp = controller.loggedInUser.getACreatedCampaign(sCampaign4.getText());
                camp.deleteSession(sessionL4.getText());

                pastSessionL4.setText(sessionL4.getText());
                pastSCampL4.setText(sCampaign4.getText());

                sessionL4.setText("");
                sCampaign4.setText("");
                sDate4.setText("");
                hideSession();
                hidePast();
            }catch(FileNotFoundException e){
                e.printStackTrace();
            }
        }else if(action.equals("ds5")){
            try {
                Campaign camp = controller.loggedInUser.getACreatedCampaign(sCampaign5.getText());
                camp.deleteSession(sessionL5.getText());

                pastSessionL5.setText(sessionL5.getText());
                pastSCampL5.setText(sCampaign5.getText());

                sessionL5.setText("");
                sCampaign5.setText("");
                sDate5.setText("");
                hideSession();
                hidePast();
            }catch(FileNotFoundException e){
                e.printStackTrace();
            }
        }else if(action.equals("ds6")){
            try {
                Campaign camp = controller.loggedInUser.getACreatedCampaign(sCampaign6.getText());
                camp.deleteSession(sessionL6.getText());

                pastSessionL6.setText(sessionL6.getText());
                pastSCampL6.setText(sCampaign6.getText());

                sessionL6.setText("");
                sCampaign6.setText("");
                sDate6.setText("");
                hideSession();
                hidePast();
            }catch(FileNotFoundException e){
                e.printStackTrace();
            }
        }else if(action.equals("ds7")){
            try {
                Campaign camp = controller.loggedInUser.getACreatedCampaign(sCampaign7.getText());
                camp.deleteSession(sessionL7.getText());

                pastSessionL7.setText(sessionL7.getText());
                pastSCampL7.setText(sCampaign7.getText());

                sessionL7.setText("");
                sCampaign7.setText("");
                sDate7.setText("");
                hideSession();
                hidePast();
            }catch(FileNotFoundException e){
                e.printStackTrace();
            }
        }else if(action.equals("ds8")){
            try {
                Campaign camp = controller.loggedInUser.getACreatedCampaign(sCampaign8.getText());
                camp.deleteSession(sessionL8.getText());

                pastSessionL8.setText(sessionL8.getText());
                pastSCampL8.setText(sCampaign8.getText());

                sessionL8.setText("");
                sCampaign8.setText("");
                sDate8.setText("");
                hideSession();
                hidePast();
            }catch(FileNotFoundException e){
                e.printStackTrace();
            }
        }else if(action.equals("ds9")){
            try {
                Campaign camp = controller.loggedInUser.getACreatedCampaign(sCampaign9.getText());
                camp.deleteSession(sessionL9.getText());

                pastSessionL8.setText(sessionL8.getText());
                pastSCampL8.setText(sCampaign8.getText());

                sessionL9.setText("");
                sCampaign9.setText("");
                sDate9.setText("");
                hideSession();
                hidePast();
            }catch(FileNotFoundException e){
                e.printStackTrace();
            }
        }else if(action.equals("ds10")){
            try {
                Campaign camp = controller.loggedInUser.getACreatedCampaign(sCampaign10.getText());
                camp.deleteSession(sessionL10.getText());

                pastSessionL8.setText(sessionL8.getText());
                pastSCampL8.setText(sCampaign8.getText());

                sessionL10.setText("");
                sCampaign10.setText("");
                sDate10.setText("");
                hideSession();
                hidePast();
            }catch(FileNotFoundException e){
                e.printStackTrace();
            }
        }else if(action.equals("ds11")){
            try {
                Campaign camp = controller.loggedInUser.getACreatedCampaign(sCampaign11.getText());
                camp.deleteSession(sessionL11.getText());

                pastSessionL8.setText(sessionL8.getText());
                pastSCampL8.setText(sCampaign8.getText());

                sessionL11.setText("");
                sCampaign11.setText("");
                sDate11.setText("");
                hideSession();
                hidePast();
            }catch(FileNotFoundException e){
                e.printStackTrace();
            }
        }else if(action.equals("ds12")){
            try {
                Campaign camp = controller.loggedInUser.getACreatedCampaign(sCampaign12.getText());
                camp.deleteSession(sessionL12.getText());

                pastSessionL8.setText(sessionL8.getText());
                pastSCampL8.setText(sCampaign8.getText());

                sessionL12.setText("");
                sCampaign12.setText("");
                sDate12.setText("");
                hideSession();
                hidePast();
            }catch(FileNotFoundException e){
                e.printStackTrace();
            }
        }

        if(action.equals("CreateCharacter")){
            JOptionPaneCharacter charOpt = new JOptionPaneCharacter();
            String characterName = charOpt.characterName;
            String charUser = charOpt.username;
            if(character1.getText().equals("")){
                controller.loggedInUser.createCharacter(characterName);
                character1.setText(characterName);
                hideCharacter();
            }else if(character2.getText().equals("")){
                controller.loggedInUser.createCharacter(characterName);
                character2.setText(characterName);
                hideCharacter();
            }else if(character3.getText().equals("")){
                controller.loggedInUser.createCharacter(characterName);
                character3.setText(characterName);
                hideCharacter();
            }else if(character4.getText().equals("")){
                controller.loggedInUser.createCharacter(characterName);
                character4.setText(characterName);
                hideCharacter();
            }else if(character5.getText().equals("")){
                controller.loggedInUser.createCharacter(characterName);
                character5.setText(characterName);
                hideCharacter();
            }else if(character6.getText().equals("")){
                controller.loggedInUser.createCharacter(characterName);
                character6.setText(characterName);
                hideCharacter();
            }else if(character7.getText().equals("")){
                controller.loggedInUser.createCharacter(characterName);
                character7.setText(characterName);
                hideCharacter();
            }else if(character8.getText().equals("")){
                controller.loggedInUser.createCharacter(characterName);
                character8.setText(characterName);
                hideCharacter();
            }else if(character9.getText().equals("")){
                controller.loggedInUser.createCharacter(characterName);
                character9.setText(characterName);
                hideCharacter();
            }else if(character10.getText().equals("")){
                controller.loggedInUser.createCharacter(characterName);
                character10.setText(characterName);
                hideCharacter();
            }else if(character11.getText().equals("")){
                controller.loggedInUser.createCharacter(characterName);
                character11.setText(characterName);
                hideCharacter();
            }else if(character12.getText().equals("")){
                controller.loggedInUser.createCharacter(characterName);
                character12.setText(characterName);
                hideCharacter();
            }

        }
        if(action.equals("c1")){
            //need to remove character
            character1.setText("");
            hideCharacter();
        }if(action.equals("c2")){
            //need to remove character
            character2.setText("");
            hideCharacter();
        }if(action.equals("c3")){
            //need to remove character
            character3.setText("");
            hideCharacter();
        }if(action.equals("c4")){
            //need to remove character
            character4.setText("");
            hideCharacter();
        }if(action.equals("c5")){
            //need to remove character
            character5.setText("");
            hideCharacter();
        }if(action.equals("c6")){
            //need to remove character
            character6.setText("");
            hideCharacter();
        }if(action.equals("c7")){
            //need to remove character
            character7.setText("");
            hideCharacter();
        }if(action.equals("c8")){
            //need to remove character
            character8.setText("");
            hideCharacter();
        }if(action.equals("c9")){
            //need to remove character
            character9.setText("");
            hideCharacter();
        }if(action.equals("c10")){
            //need to remove character
            character10.setText("");
            hideCharacter();
        }if(action.equals("c11")){
            //need to remove character
            character11.setText("");
            hideCharacter();
        }if(action.equals("c12")){
            //need to remove character
            character12.setText("");
            hideCharacter();
        }

        if(action.equals("CreateNPC")){
            String npcName = JOptionPane.showInputDialog("What is the name of your new NPC?");
            if(npc1.getText().equals("")){
                controller.loggedInUser.createNPC(npcName);
                npc1.setText(npcName);
                hideNPC();
            }else if(npc2.getText().equals("")){
                controller.loggedInUser.createNPC(npcName);
                npc2.setText(npcName);
                hideNPC();
            }else if(npc3.getText().equals("")){
                controller.loggedInUser.createNPC(npcName);
                npc3.setText(npcName);
                hideNPC();
            }else if(npc4.getText().equals("")){
                controller.loggedInUser.createNPC(npcName);
                npc4.setText(npcName);
                hideNPC();
            }else if(npc5.getText().equals("")){
                controller.loggedInUser.createNPC(npcName);
                npc5.setText(npcName);
                hideNPC();
            }else if(npc6.getText().equals("")){
                controller.loggedInUser.createNPC(npcName);
                npc6.setText(npcName);
                hideNPC();
            }else if(npc7.getText().equals("")){
                controller.loggedInUser.createNPC(npcName);
                npc7.setText(npcName);
                hideNPC();
            }else if(npc8.getText().equals("")){
                controller.loggedInUser.createNPC(npcName);
                npc8.setText(npcName);
                hideNPC();
            }else if(npc9.getText().equals("")){
                controller.loggedInUser.createNPC(npcName);
                npc9.setText(npcName);
                hideNPC();
            }else if(npc10.getText().equals("")){
                controller.loggedInUser.createNPC(npcName);
                npc10.setText(npcName);
                hideNPC();
            }else if(npc11.getText().equals("")){
                controller.loggedInUser.createNPC(npcName);
                npc11.setText(npcName);
                hideNPC();
            }else if(npc12.getText().equals("")){
                controller.loggedInUser.createNPC(npcName);
                npc12.setText(npcName);
                hideNPC();
            }else if(npc13.getText().equals("")){
                controller.loggedInUser.createNPC(npcName);
                npc13.setText(npcName);
                hideNPC();
            }else if(npc14.getText().equals("")){
                controller.loggedInUser.createNPC(npcName);
                npc14.setText(npcName);
                hideNPC();
            }else if(npc15.getText().equals("")){
                controller.loggedInUser.createNPC(npcName);
                npc15.setText(npcName);
                hideNPC();
            }else if(npc16.getText().equals("")){
                controller.loggedInUser.createNPC(npcName);
                npc16.setText(npcName);
                hideNPC();
            }
        }if(action.equals("nd1")){
            //needs to delete npc
            npc1.setText("");
            hideNPC();
        }else if(action.equals("nd2")){
            //needs to delete npc
            npc2.setText("");
            hideNPC();
        }else if(action.equals("nd3")){
            //needs to delete npc
            npc3.setText("");
            hideNPC();
        }else if(action.equals("nd4")){
            //needs to delete npc
            npc4.setText("");
            hideNPC();
        }else if(action.equals("nd5")){
            //needs to delete npc
            npc5.setText("");
            hideNPC();
        }else if(action.equals("nd6")){
            //needs to delete npc
            npc6.setText("");
            hideNPC();
        }else if(action.equals("nd7")){
            //needs to delete npc
            npc7.setText("");
            hideNPC();
        }else if(action.equals("nd8")){
            //needs to delete npc
            npc8.setText("");
            hideNPC();
        }else if(action.equals("nd9")){
            //needs to delete npc
            npc9.setText("");
            hideNPC();
        }else if(action.equals("nd10")){
            //needs to delete npc
            npc10.setText("");
            hideNPC();
        }else if(action.equals("nd11")){
            //needs to delete npc
            npc11.setText("");
            hideNPC();
        }else if(action.equals("nd12")){
            //needs to delete npc
            npc12.setText("");
            hideNPC();
        }else if(action.equals("nd13")){
            //needs to delete npc
            npc13.setText("");
            hideNPC();
        }else if(action.equals("nd14")){
            //needs to delete npc
            npc14.setText("");
            hideNPC();
        }else if(action.equals("nd15")){
            //needs to delete npc
            npc15.setText("");
            hideNPC();
        }else if(action.equals("nd16")){
            //needs to delete npc
            npc16.setText("");
            hideNPC();
        }


        //added action listener for testing purposes

        if(action.equals("edit1")){
            Editor(controller, frame, character1);
        }else if(action.equals("edit2")){
            Editor(controller, frame, character2);
        }else if(action.equals("edit3")){
            Editor(controller, frame, character3);
        }else if(action.equals("edit4")){
            Editor(controller, frame, character4);
        }else if(action.equals("edit5")){
            Editor(controller, frame, character5);
        }else if(action.equals("edit6")){
            Editor(controller, frame, character6);
        }else if(action.equals("edit7")){
            Editor(controller, frame, character7);
        }else if(action.equals("edit8")){
            Editor(controller, frame, character8);
        }else if(action.equals("edit9")){
            Editor(controller, frame, character9);
        }else if(action.equals("edit10")){
            Editor(controller, frame, character10);
        }else if(action.equals("edit11")){
            Editor(controller, frame, character11);
        }else if(action.equals("edit12")){
            Editor(controller, frame, character12);
        }

    }

    public void openCampaign(GMController controller, JFrame frame, JLabel campaignName){
        try{
            Campaign campaign = controller.loggedInUser.getACreatedCampaign(campaignName.getText());
            frame.setSize(1150, 650);
            frame.setContentPane(new CampaignUI(campaign, controller, frame, controller.loggedInUser).panel);
            frame.setVisible(true);

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public void Editor(GMController controller, JFrame frame, JLabel characterLabel){
        Player characterToEdit = controller.loggedInUser.getCharacter(characterLabel.getText());
        frame.setSize(1150, 650);
        frame.setContentPane(new CharacterEditor(characterToEdit, characterLabel, controller,frame).CharacterEditor);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}



