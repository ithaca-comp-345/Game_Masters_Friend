package edu.ithaca.gamemaster;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CharacterUI {
    Scanner input = new Scanner(System.in);
    DiceRoll rand = new DiceRoll(4,6);
    Random r = new Random();
    String sampleLanguages[] = new String[]{"Common", "Dwarvish ", "Elvish", "Gnomish", "Goblin", "Halfing", "Orc"};
    String alignments[] = new String[]{"Lawful good", "Lawful neutral ", "Lawful evil", "Neutral good", "True neutral", "Neutral evil", "Chaotic good", "Chaotic neutral", "Chaotic evil"};

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
                //TODO: call all the setters manually
                    //get stat input value (or dice roll "DiceRoll")
                    //check for valid input
                    //call setter
                System.out.println("Actually, you can't do this yet. Try auto-gen instead!");
            }
        }
        if (!isValidYesNo(YN)){
            System.out.print("Auto-generation selected. Is this correct? ");
            YN = input.nextLine();

            if (isValidYesNo(YN)) { //double checking
                System.out.println("Auto-gen confirmed. Starting...");
                newC.randomizeAll();
                randCharacterHitAndHPStuff(newC);
            }
        }
    }

    //this seems iffy. pull?
    public void randCharacterHitAndHPStuff(Character newC){
        newC.setHitDice(rand.abilityRoll(), rand.abilityRoll(), rand.abilityRoll());
        newC.setHP(rand.abilityRoll());
        newC.setStrength(rand.abilityRoll());
        newC.setArmor(rand.abilityRoll());
        newC.setSpeed(rand.abilityRoll());

        randCharacterActsLangsAlign(newC);
    }

    public void randCharacterActsLangsAlign(Character newC){
        ArrayList<String> languages = new ArrayList<>();
        ArrayList<Action> actions = new ArrayList<>();

        //Alignment
        newC.setAlignment(alignments[r.nextInt(8)]); // r.nextInt returns int from 0 to the given parameter

        //Langs
        System.out.print("How many languages? (no more than 7) \n > ");
        int quant = input.nextInt();
        while (quant < 0 || quant > 7) { //nothing under 0 nor over 7
            System.out.print("Invalid. \n How many languages? \n > ");
            quant = input.nextInt();
        }
        for (int i = 0; i < quant ; i++) {
            //Review! This line allows repeat numbers, therefore repeat languages.
            languages.add(sampleLanguages[(int) r.nextInt(6)]); // minus one because arrays
        }

        //Actions - NOT actually random yet. Everyone gets Fireball. Review?
        Action fireball = new Action("Fireball",5,1,8,"Fire");
        actions.add(fireball);

        //Setting lists to character
        newC.setLanguages(languages);
        newC.setActions(actions); //Review; maybe Actions can have its own toString definition?

        //commented because of tests.
        //printStats(newC);
    }

    //pull?
    //prints stats. you can call this anywhere, really, as long as you've made the character fully and completely.
    //Actions print out like "[edu.ithaca.gamemaster.Action@1753acfe]". review?
    public static void printStats(Character newC) { //will throw a nullpointerexception if called before all stats are set.
        Field newCdata[] = newC.getClass().getDeclaredFields();
        Field forDisplay; //its a temp var

        for (int i = 0; i < newCdata.length; i++) {
            forDisplay = newCdata[i];
            forDisplay.setAccessible(true);

            try {
                System.out.println(forDisplay.getName() + ": " + forDisplay.get(newC).toString());
            } catch (IllegalAccessException | NullPointerException ne){ System.out.println( ne.toString() + " caught in CharacterUI.printStats() "); }
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