package edu.ithaca.gamemaster;

import java.lang.Character;

public class Account {
    public String username;
    public PlayerUser player;
    public GMUser gm;
    private String psswd;

    public Account(String nameIn,String psswdIn){
        if(!isPsswdValid(psswdIn) ){
            throw new IllegalArgumentException("password must contain 6 characters, at least one uppercase letter, at least one lowercase letter, at least one digit");

        }
        else if(nameIn.length()<6){
            throw new IllegalArgumentException("username must contain 6 characters");
        }
        this.username=nameIn;
        this.psswd=psswdIn;
        player=new PlayerUser();
        gm=new GMUser();
    }

    public String getUsername() {
        return username;
    }

    public String getPsswd(){ return psswd;}


    public static boolean isPsswdValid(String password) {
        Boolean lower = false;
        Boolean upper = false;
        Boolean number = false;

        if (password.length() < 6) { // if its less then 6 characters not valid
            return false;
        }

        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                lower = true;
            }
            else if (Character.isUpperCase(password.charAt(i))) {
                upper = true;
            }
            else if (Character.isDigit(password.charAt(i))) {
                number = true;
            }
        }

        return (upper && lower && number  ); // only true if all 3 are true
    }
}

