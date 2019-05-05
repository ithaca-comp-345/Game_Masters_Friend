package edu.ithaca.gamemaster.user_interfaces.clean_build;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GMController {
    public Login loginModule;
    public User loggedInUser;
    public int campaignCount;

    public GMController(){
        this.loginModule=new Login();

    }

    public static void main(String[] args) throws FileAlreadyExistsException{
        GMController controller = new GMController();


        JFrame frame = new JFrame();

        //test accounts
        controller.createAccount("testuser", "Password1");
        controller.createAccount("milorue","Password1");
        controller.createAccount("teamdevadze", "Password1");
        controller.createAccount("cristiancantoral", "Password1");
        controller.createAccount("leejackson","Password1");
        controller.createAccount("mailyramirez", "Password1");

        //size setup
        frame.setSize(500,450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GameMasterUI uiView = new GameMasterUI(controller);
        JPanel loginPanel = uiView.applet;

        frame.setContentPane(loginPanel);
        frame.setVisible(true);



    }

    public User login(String username, String password)throws FileNotFoundException{
        loginModule.login(username, password);
        User loggedIn = loginModule.getUser(username);
        this.loggedInUser=loggedIn;
        return loggedIn;

    }

    public void createAccount(String username, String password) throws FileAlreadyExistsException{
        loginModule.createAccount(username, password);
    }

    public void createCampaign(String campaignName){
        loggedInUser.createCampaign(campaignName);
        campaignCount++;
    }

    public ArrayList<Campaign> getCampaigns(){
        return loggedInUser.getCampaignListClean();
    }

    public int getCampaignCount(){
        return campaignCount;
    }
}
