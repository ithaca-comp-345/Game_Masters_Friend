package edu.ithaca.gamemaster.user_interfaces.clean_build;

import edu.ithaca.gamemaster.Account;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;


public class GameMasterUI extends JFrame implements ActionListener {
    private JButton loginButton;
    private JTextField usernameLogin;
    private JButton createAccountButton;
    public JPanel applet;
    private JPanel Logins;
    private JLabel loginSuccessful;
    private JTextField passwordLogin;

    public static JFrame frame = new JFrame("Game Masters Companion");

    private Login loginModule;
    public static boolean loggedIn = false;

    public GMController controller;




    private void createUIComponents() {

        loginButton.setActionCommand("Login");
        createAccountButton.setActionCommand("CreateAccount");
        loginButton.addActionListener(this);
        createAccountButton.addActionListener(this);

        usernameLogin.setActionCommand("Enter");
        passwordLogin.setActionCommand("Enter");

        usernameLogin.addActionListener(this);
        passwordLogin.addActionListener(this);


    }

    public GameMasterUI(GMController controller){
        createUIComponents();

        this.loginModule = controller.loginModule;
        this.controller=controller;


    }

    public void actionPerformed(ActionEvent ae){

        String action = ae.getActionCommand();
        if(action.equals("Login")){
            System.out.println(usernameLogin.getText());
            String username = usernameLogin.getText();
            System.out.println(passwordLogin.getText());
            String passwordStr = passwordLogin.getText();
            passwordLogin.setText("");
            usernameLogin.setText("");

            //try catch for login failure
            //login module
            try {
                controller.login(username,passwordStr);
                System.out.println(controller.loggedInUser.campaignCount);
                if(controller.loggedInUser.campaignCount>0) {
                    System.out.println(controller.loggedInUser.getCampaignListClean().get(0).getCampaignName());
                }
                loginSuccessful.setText("Login completed");
                loggedIn=true;
                if(loggedIn){
                    frame.setSize(1200,750);
                    frame.setContentPane(new GameMasterLandingPage(controller, controller.loggedInUser.getCampaignListClean()).LandingPage);
                    frame.setVisible(true);
                    loggedIn=false;
                }

                try {
                    System.out.println(loginModule.getUsers().toString());
                } catch(Exception e){

                }
            } catch (FileNotFoundException e) {
                loginSuccessful.setText("Login failure, exception thrown");
                e.printStackTrace();
            }
        }

        //create account module
        else if(action.equals("CreateAccount")){
            System.out.println(usernameLogin.getText());
            String username = usernameLogin.getText();
            System.out.println(passwordLogin.getText());

            String passwordStr = passwordLogin.getText();

            passwordLogin.setText("");
            usernameLogin.setText("");
            try{
                controller.createAccount(username,passwordStr);
                loginSuccessful.setText("Created account successfully");
                try {
                    System.out.println(loginModule.getAccounts().toString());
                    System.out.println(loginModule.getAccount(username).getPassword());
                } catch (Exception e){

                }


            } catch (FileAlreadyExistsException e) {
                loginSuccessful.setText("Either account already exists or there was another error");
            }

        }
    }

//    public static void main(String[] args) throws IOException {
//        Login loginModule = new Login();
//
//        try {
//            loginModule.createAccount("testuser", "Asdf1234");
//        } catch (FileAlreadyExistsException e){
//            e.printStackTrace();
//        }
//        frame.setSize(500,450);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setContentPane(new GameMasterUI(loginModule).applet);
//        frame.setVisible(true);
//
//
//    }
}
