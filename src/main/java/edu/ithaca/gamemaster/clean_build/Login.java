package edu.ithaca.gamemaster.clean_build;

import edu.ithaca.gamemaster.Account;

import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;
import java.util.HashMap;
import java.util.Map;

public class Login {
    private static Map<String, Account> accounts = new HashMap<>();
    private static Map<String, User> users = new HashMap<>();

    public static void createAccount(String username, String password) throws FileAlreadyExistsException {
        if(accounts.containsKey(username)){
            throw new FileAlreadyExistsException("Account already exists within the database");
        }
        else{
            Account newAccount = new Account(username,password);
            accounts.put(username, newAccount);
        }
    }

    public static Account login(String username, String password) throws FileNotFoundException{
        if(!accounts.containsKey(username)){
            throw new FileNotFoundException("Account doesn't exist");
        }
        else{
            return accounts.get(username);
        }
    }
    public static Map<String, Account> getAccounts() throws Exception{
        if(accounts.isEmpty()){
            throw new Exception("Login module currently holds no accounts");
        }
        else {
            return accounts;
        }
    }

    public static Account getAccount(String accountName) throws FileNotFoundException{
        if(!accounts.containsKey(accountName)){
            throw new FileNotFoundException("Account doesn't exist");
        }
        else{
            return accounts.get(accountName);
        }
    }

    public static void loggedIn(Account linkAccount){
        //TODO
    }

    public static void createUser(Account acct, boolean isAdmin){
        User createdUser = new User(acct.username,isAdmin,acct);
        users.put(createdUser.getName(),createdUser);
    }

}
