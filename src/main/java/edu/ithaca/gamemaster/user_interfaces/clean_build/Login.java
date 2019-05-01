package edu.ithaca.gamemaster.user_interfaces.clean_build;

import edu.ithaca.gamemaster.Account;

import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;
import java.util.HashMap;
import java.util.Map;

public class Login {
    private static Map<String, Account> accounts = new HashMap<>();
    private static Map<String, User> users = new HashMap<>();

    public Login(){

    }

    public void createAccount(String username, String password) throws FileAlreadyExistsException {
        if(accounts.containsKey(username)){
            throw new FileAlreadyExistsException("Account already exists within the database");
        }
        else{
            try{
                Account newAccount = new Account(username,password);
                accounts.put(username, newAccount);
                createUser(newAccount); //true by default
            } catch(IllegalArgumentException e){
                throw new FileAlreadyExistsException("Username must contain 6 characters");
            }

        }
    }

    public Account login(String username, String password) throws FileNotFoundException{
        if(!accounts.containsKey(username)){
            throw new FileNotFoundException("Account doesn't exist");
        }
        else{
            if(accounts.get(username).getPassword().equals(password)){
                return accounts.get(username);
            }
            throw new FileNotFoundException("Password is incorrect");
        }
    }
    public Map<String, Account> getAccounts() throws Exception{
        if(accounts.isEmpty()){
            throw new Exception("Login module currently holds no accounts");
        }
        else {
            return accounts;
        }
    }

    public Account getAccount(String accountName) throws FileNotFoundException{
        if(!accounts.containsKey(accountName)){
            throw new FileNotFoundException("Account doesn't exist");
        }
        else{
            return accounts.get(accountName);
        }
    }

    public Map<String, User> getUsers() throws Exception{
        if(users.isEmpty()){
            throw new Exception("Users module currently holds no users");
        }
        else{
            return users;
        }
    }

    public User getUser(String userName) throws FileNotFoundException{
        if(!users.containsKey(userName)){
            throw new FileNotFoundException("User doesn't exist");
        }
        else{
            return users.get(userName);
        }
    }

    private User createUser(Account acct){
        String username = acct.getUsername();
        User createdUser = new User(username,acct);
        users.put(createdUser.getName(),createdUser);
        return createdUser;
    }

}
