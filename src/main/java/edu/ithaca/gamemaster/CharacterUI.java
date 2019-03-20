package edu.ithaca.gamemaster;

import java.util.Scanner;

public class CharacterUI {
    Scanner input = new Scanner(System.in);

    //create character
    public void createNewCharacter() {
        System.out.println("Creating new character. Enter name: ");
        String newName = "";
        newName = input.nextLine();

        //set name
        while (!isNotEmptyString(newName)) { //DOES allow for a name of just spaces, ie "    " passes.
            System.out.println("Please give input. \n Enter name: ");
            newName = input.nextLine();
        }
        Character testCharacter = new Character(newName);
    }

    //Random stats or Manual?
    //if manual, time for hell aka call all setters individually
    //get stat input value (or dice roll "DiceRoll")
    //check for valid input
    //call setter
    //if random, call randomizeAbilityScores()

    public static boolean isNotEmptyString(String str) {
        if (str != null && !str.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}