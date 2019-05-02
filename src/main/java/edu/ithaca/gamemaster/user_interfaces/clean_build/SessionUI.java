package edu.ithaca.gamemaster.user_interfaces.clean_build;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SessionUI extends JFrame implements ActionListener {
    private JLabel sessionName;
    private JButton editPlayers;
    private JButton button2;
    private JButton viewEditButton;
    private JButton end;
    private JLabel gameMaster;
    private JLabel campaign;
    private JLabel goal;
    private JLabel players;
    private JLabel timeStart;
    private JLabel timeEnd;
    private JLabel characters;
    private JPanel panel;

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
    public SessionUI(Campaign campaign){
        gameMaster.setText("GM:");
        this.campaign.setText("Campaign: ");
        sessionName.setText( "Session Name: ");
        add(panel);

        button2.setActionCommand("btn2");

        button2.addActionListener(this);
    }

    public SessionUI(Session session){
        gameMaster.setText("GM:");
        this.campaign.setText("Campaign: "+ session.getParentCampaign().getCampaignName());
        this.timeStart.setText("Start At: "+ session.getTimeStart());
        this.players.setText("Players:"+ session.getPlayers());
        this.sessionName.setText( "Session Name: "+session.getSessionName());
        this.goal.setText("Goal: "+session.getGoal());
        //this.end.setText(""+session.);
        add(panel);

        button2.setActionCommand("btn2");

        button2.addActionListener(this);
    }

    public SessionUI(String campaign){
        gameMaster.setText("GM:");
        this.campaign.setText("Campaign: "+ campaign);
        //this.players.setText();
        sessionName.setText( "Session Name: ");
        add(panel);

        button2.setActionCommand("btn2");

        button2.addActionListener(this);
    }

    public SessionUI(){
        gameMaster.setText("GM:");
        this.campaign.setText("Campaign: ");
        sessionName.setText( "Session Name: ");
        add(panel);
    }


    public void actionPerformed(ActionEvent ae){
        String action = ae.getActionCommand();

        if(action.equals("btn2")){

        }else if(action.equals("btn2")){

        }else if(action.equals("")){

        }
    }
}
