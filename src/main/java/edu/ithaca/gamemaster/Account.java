package edu.ithaca.gamemaster;

import java.lang.Character;

public class Account {
    public String username;
    public PlayerUser userPlayer;
//    public GMUser gm;
    public String psswd;



    public Account(String nameIn,String psswdIn){
        if(!isPsswdValid(psswdIn) ){
            throw new IllegalArgumentException("password must contain 6 characters, at least one uppercase letter, at least one lowercase letter, at least one digit");

        }
        else if(nameIn.length()<6){ //checks for username length
            throw new IllegalArgumentException("username must contain 6 characters");
        }
        else{
            this.username=nameIn;
            this.psswd=psswdIn;
            userPlayer=new PlayerUser();
//            gm=new GMUser();
        }

    }

    public String getUsername() {
        return username;
    }

    public String getPsswd(){ return psswd;}

    /**
     * check wether password is valid or not
     * 1. whether it has more than 6 characters
     * 2. whether it has at least one uppercase character
     * 3. whether it has at least one lowercase character
     * 4. whethet it has at least one digit
     * @param password
     * @return boolean
     */
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

