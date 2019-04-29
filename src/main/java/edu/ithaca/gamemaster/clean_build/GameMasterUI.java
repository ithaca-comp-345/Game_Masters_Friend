package edu.ithaca.gamemaster.clean_build;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;


public class GameMasterUI extends JFrame implements ActionListener {
    private JButton loginButton;
    private JPasswordField passwordLogin;
    private JTextField usernameLogin;
    private JTextField usernameCreate;
    private JPasswordField passwordCreate;
    private JButton createAccountButton;
    private JPanel applet;
    private JPanel Logins;
    private JPanel createAccount;
    private JLabel createAccountNotify;
    private JLabel loginSuccessful;

    public static JFrame frame = new JFrame("Game Masters Companion");

    private Login loginModule;
    public static boolean loggedIn = false;




    private void createUIComponents() {

        loginButton.setActionCommand("Login");
        createAccountButton.setActionCommand("CreateAccount");
        loginButton.addActionListener(this);
        createAccountButton.addActionListener(this);

        usernameLogin.setActionCommand("Enter");
        usernameCreate.setActionCommand("EnterCreate");
        passwordLogin.setActionCommand("Enter");
        passwordCreate.setActionCommand("EnterCreate");

        usernameLogin.addActionListener(this);
        usernameCreate.addActionListener(this);
        passwordLogin.addActionListener(this);
        passwordCreate.addActionListener(this);


    }

    public GameMasterUI(){
        createUIComponents();

        this.loginModule = new Login();



    }

    public void actionPerformed(ActionEvent ae){

        String action = ae.getActionCommand();
        if(action.equals("Login")){
            System.out.println(usernameLogin.getText());
            String username = usernameLogin.getText();
            System.out.println(passwordLogin.getPassword());
            char[] password = passwordLogin.getPassword();

            String passwordStr = password.toString();
            passwordLogin.setText("");
            usernameLogin.setText("");

            //try catch for login failure
            //login module
            try {
                loginModule.login(username, passwordStr);
                loginSuccessful.setText("Login completed");
                loggedIn=true;
                if(loggedIn){
                    frame.setSize(800,750);
                    frame.setContentPane(new GameMasterLandingPage().LandingPage);
                    frame.setVisible(true);
                }

                try {
                    System.out.println(loginModule.getUsers().toString());
                } catch(Exception e){

                }
            } catch (FileNotFoundException e) {
                loginSuccessful.setText("Account doesn't exist or is incorrect");
            } {

            }
        }

        //create account module
        else if(action.equals("CreateAccount")){
            System.out.println(usernameCreate.getText());
            String username = usernameCreate.getText();
            System.out.println(passwordCreate.getPassword());
            char[] password = passwordCreate.getPassword();

            String passwordStr = password.toString();

            passwordCreate.setText("");
            usernameCreate.setText("");
            try{
                loginModule.createAccount(username,passwordStr);
                createAccountNotify.setText("Created account successfully");


            } catch (FileAlreadyExistsException e) {
                createAccountNotify.setText("Either account already exists or there was another error");
            }

        }
    }

    public static void main(String[] args) throws IOException {



        frame.setSize(500,450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new GameMasterUI().applet);
        frame.setVisible(true);


    }
}
