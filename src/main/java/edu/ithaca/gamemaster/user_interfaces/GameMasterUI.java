package edu.ithaca.gamemaster.user_interfaces;


import edu.ithaca.gamemaster.Account;
import edu.ithaca.gamemaster.GameMaster;
import edu.ithaca.gamemaster.GameMasterAPI;

import java.util.*;

public class GameMasterUI {
    private GameMasterAPI api;
    private Map<String, Account> accounts;
    private Account loggedIn;
    private boolean logStatus = false;

    Scanner input = new Scanner(System.in);

    public GameMasterUI(GameMasterAPI api){
        this.api=api;
    }

    public void logIn(String username, String password){
        if(accounts.containsKey(username)){
            if(password == accounts.get(username).getPsswd()) {
                loggedIn = accounts.get(username);
                this.logStatus=true;
            }
        }
        else{
            throw new IllegalArgumentException("Invalid login attempt");
        }
    }

    public void logOut(){
        logStatus=false;
        loggedIn=null;
    }

    public void createAccount(String username, String password){
        if(accounts.containsKey(username)){
            throw new IllegalArgumentException("Account already exists");
        }
        else{
            Account newAccount = new Account(username,password);
            accounts.put(username,newAccount);
            System.out.println("New account created");
        }
    }

    public void runUI() {
        boolean run = true;
        while (run) {
            System.out.println("This is your GameMasters Best Friend");
            System.out.println("Would you like to (1) log in or (2) create a new account");
            String inputStr = input.nextLine();
            if (inputStr == "1") {
                System.out.println("What is your username?");
                String usr = input.nextLine();
                System.out.println("Password?");
                String pass = input.nextLine();
                logIn(usr, pass);
                if (logStatus) {
                    System.out.println("Welcome " + loggedIn.getUsername());
                } else {
                    System.out.println("Invalid attempt");
                }
            } else if (inputStr == "2") {
                System.out.println("What is your username?");
                String usr = input.nextLine();
                System.out.println("Password?");
                String pass = input.nextLine();
                createAccount(usr, pass);
                System.out.println("Please login to your account now");
            }
            if(logStatus){
                //TODO
            }
        }
    }

}
