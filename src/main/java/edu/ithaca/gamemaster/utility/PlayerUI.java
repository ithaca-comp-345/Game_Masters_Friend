package edu.ithaca.gamemaster.utility;

import edu.ithaca.gamemaster.CharacterUI;
import edu.ithaca.gamemaster.Player;

class PlayerUI extends CharacterUI{
    Player newP = new Player();

    public void createNewPlayer(){
        createNewCharacter();
        newC = getNewC();
    }

    public boolean choices(){
        String yn = input.nextLine();
        System.out.println("Welcome to Player character creation. First, you must create a barebones character before getting to get good stuff. " +
                "Would you like to automate that process, or go manual?");

        if (isValidYesNo(yn)){
            return false;
        } else {
            return false;
        }
    }

    public void autoGenPlayer(){
        String n = input.nextLine();
        while (!isNotEmptyString(n)) {
            System.out.print("Please give input. \n Enter name: ");
            n = input.nextLine();
        }

        newC.setName(n);
        newC.randomizeAll();
        autogenCharAttributes(newC);
        newP.generateThrows();

    }

    public static void main(String[] args) {
        PlayerUI pui = new PlayerUI();
        pui.createNewPlayer();
        System.out.println("Done in playerUI.");
    }
}

