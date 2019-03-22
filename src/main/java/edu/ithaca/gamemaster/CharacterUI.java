package edu.ithaca.gamemaster;

import java.lang.reflect.Field;
import java.util.Scanner;

public class CharacterUI {
    Scanner input = new Scanner(System.in);
    DiceRoll rand = new DiceRoll(4,6);

    //create character
    public void createNewCharacter() {
        System.out.print("Creating new character. Enter name: ");
        String newName = "";
        newName = input.nextLine();

        //set name
        while (!isNotEmptyString(newName)) { //DOES allow for a name of just spaces, ie "    " passes.
            System.out.print("Please give input. \n Enter name: ");
            newName = input.nextLine();
        }
        Character newC = new Character(newName);
        newCharacterStats(newC);
    }

    public void newCharacterStats(Character newC) {
        System.out.print("Setting stats for " + newC.getName() + ". Generate manually? y/n ");
        String YN = input.nextLine();

        if (isValidYesNo(YN)) {
            System.out.print("Manual entry selected. Is this correct? ");
            YN = input.nextLine();

            if (isValidYesNo(YN)) { //double checking
                System.out.print("Manual confirmed. Begin: ");
                //TODO: call all the setters
            }
        }
        if (!isValidYesNo(YN)){
            System.out.print("Auto-generation selected. Is this correct? ");
            YN = input.nextLine();

            if (isValidYesNo(YN)) { //double checking
                System.out.println("Auto-gen confirmed. Starting...");
                newC.randomizeAll();
                newCharacterHitAndHPStuff(newC);
                printStats(newC);
            }
        }
    }

    //this seems iffy. pull?
    public void newCharacterHitAndHPStuff(Character newC){
        newC.setHitDice(rand.abilityRoll(), rand.abilityRoll(), rand.abilityRoll());
        newC.setHP(rand.abilityRoll());
        newC.setStrength(rand.abilityRoll());
        newC.setArmor(rand.abilityRoll());
        newC.setSpeed(rand.abilityRoll());
    }

    //if manual, time for hell aka call all setters individually
    //get stat input value (or dice roll "DiceRoll")
    //check for valid input
    //call setter

    public void printStats (Character newC)  { //will throw a nullpointerexception if called before all stats are set.
        Field newCdata[] = newC.getClass().getDeclaredFields();
        Field forDisplay; //its a temp var

        for (int i = 0; i < newCdata.length; i++) {
            forDisplay = newCdata[i];
            forDisplay.setAccessible(true);

            try {
                System.out.println(forDisplay.getName() + ": " + forDisplay.get(newC).toString());
            } catch (IllegalAccessException | NullPointerException ne){ System.out.println( ne.toString() + " caught in CharacterUI.printStats() =("); }
        }
    }

    public static boolean isValidYesNo(String YN) { //this method is about as effective as
        if (YN.equals("y") || YN.equals("yes")) {     //a deadbolt fashioned out of a cheeto
            return true;
        } else {
            return false;
        }
    }

    public static boolean isNotEmptyString(String str) {
        if (str != null && !str.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        CharacterUI CUI = new CharacterUI();
        CUI.createNewCharacter();
        System.out.println("main done.");
    }
}