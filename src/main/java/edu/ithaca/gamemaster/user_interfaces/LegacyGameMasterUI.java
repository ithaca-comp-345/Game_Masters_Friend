package edu.ithaca.gamemaster.user_interfaces;


import edu.ithaca.gamemaster.Account;
import edu.ithaca.gamemaster.GameMasterAPI;

import java.util.*;

public class LegacyGameMasterUI {
    private GameMasterAPI api;
    private Map<String, Account> accounts;
    private Account loggedIn;
    private boolean logStatus = false;

    Scanner input = new Scanner(System.in);

    public LegacyGameMasterUI(GameMasterAPI api){
        this.api=api;
        this.accounts = new HashMap<>();
    }

    public boolean logIn(String username, String password){
        if(accounts.containsKey(username)){
            if(password.equals(accounts.get(username).getPassword())) {
                loggedIn = accounts.get(username);
                this.logStatus=true;
            }
            return true;
        }
        else{
            return false;
        }
    }

    public void logOut(){
        logStatus=false;
        loggedIn=null;
    }

    public boolean createAccount(String username, String password){
        if(accounts.containsKey(username)){
            throw new IllegalArgumentException("Account already exists");
        }
        else {
            Account newAccount = new Account(username, password);
            accounts.put(username, newAccount);
            System.out.println("New account created");
            return true;
        }
    }

    public void runUI() {
        boolean run = true;
        while (run) {
            System.out.println("This is your GameMasters Best Friend");
            System.out.println("Would you like to (1) log in or (2) create a new account");
            String inputStr = input.nextLine();
            System.out.println(inputStr);
            if (inputStr.equals("1")) {
                System.out.println("What is your username?");
                String usr = input.nextLine();
                System.out.println("Password?");
                String pass = input.nextLine();
                boolean login = logIn(usr, pass);
                if (login) {
                    System.out.println("Welcome " + loggedIn.getUsername());
                } else {
                    System.out.println("Invalid attempt");
                }
            } else if (inputStr.equals("2")) {
                System.out.println("What is your username?");
                String usr = input.nextLine();
                System.out.println("Password?");
                String pass = input.nextLine();
                createAccount(usr, pass);
                System.out.println("Please login to your account now");
            }
        }
    }

    public static void main(String[] args){
        GameMasterAPI api = new GameMasterAPI();
        LegacyGameMasterUI ui = new LegacyGameMasterUI(api);
        ui.runUI();
    }

}
