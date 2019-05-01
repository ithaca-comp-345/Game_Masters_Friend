package edu.ithaca.gamemaster;
import java.util.HashMap;
import java.util.Map;

public class Users {
    public Map<String, Account> users;

    public Users(){
        this.users=new HashMap<>();
    }

    /**
     * creates account for user
     * @param username
     * @param psswd
     */

    public void createAccount(String username, String psswd){
        if(users.containsKey(username)){
            throw new IllegalArgumentException("username already exists");
        }
        else{
            Account user= new Account(username,psswd);
            users.put(username, user);
        }
    }

    /**
     * user login
     * @param username
     * @param psswd
     * @return
     */
    public boolean logIn(String username, String psswd){
        if(users.containsKey(username)){
            Account user=users.get(username);
            if((user.getPassword()).equals(psswd)){
                return true;
            }
            else {
                return false;
            }
        }
        else{
            return false;
        }
    }

    public boolean findUser(String username){
        if(users.containsKey(username)){
            return true;
        }
        else{
            return false;
        }
    }
}
