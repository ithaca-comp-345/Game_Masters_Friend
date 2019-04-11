package edu.ithaca.gamemaster;

import java.util.*;

public class CharacterUI {
    //TODO: Add flag so autogen doesn't run after creating a character manually
    Scanner input = new Scanner(System.in);
    Random r = new Random();
    String sampleLanguages[] = new String[]{"Common", "Dwarvish ", "Elvish", "Gnomish", "Goblin", "Halfing", "Orc"};
    String alignments[] = new String[]{"Lawful good", "Lawful neutral ", "Lawful evil", "Neutral good", "True neutral", "Neutral evil", "Chaotic good", "Chaotic neutral", "Chaotic evil"};
    String intStatNames[] = new String[]{"hit points","hit dice", "dice modifier", "armor", "speed", "strength", "dexterity", "constitution", "intelligence", "wisdom", "charisma"};

    //create character
    public void createNewCharacter() {
        System.out.print("Creating new character. Enter name: ");
        String newName = input.nextLine();

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
        //manual
        if (isValidYesNo(YN)) {
            System.out.print("Manual entry selected. Is this correct? ");
            YN = input.nextLine();

            if (isValidYesNo(YN)) { //double checking
                System.out.print("Manual confirmed. Begin: \n");
                System.out.println("Assigning stats for " + newC.getName() + ".");

                //int stats//
                int[] stats_holder = new int[intStatNames.length];
                int intHolder = 0;
                for (int i = 0; i < stats_holder.length; i++) {
                    System.out.print("Give " + newC.getName() + " some " + intStatNames[i] + " stat. > ");
                    intHolder = intsOnly();
                    while (intHolder <= 0 || intHolder >= 22) { // Wanted to use Character.checkvalid20, but couldn't.
                        System.out.print("Values must be more than 0, and less than 22. \n >");
                        intHolder = intsOnly();
                    }
                }//;int stats//

                //languages//
                System.out.println("Great - now add a few languages to your character. You can also skip: press \"0\".");
                ArrayList<String> langs = new ArrayList<>();
                String lang = input.nextLine();

                if (lang.equals("0")){ //skip adding languages
                    System.out.println(newC.getName() + " won't know any languages. Is this correct?");
                    lang = input.nextLine();
                    if (isValidYesNo(lang)) {
                        System.out.println("Wonderful; Moving on to Actions...");
                    }
                } //;skip//

                while (!lang.equals("0")){
                    System.out.println("Enter language: ");
                    lang = input.nextLine();
                    while (!isNotEmptyString(lang)) {
                        System.out.print("Please give input. \n Enter name: ");
                        lang = input.nextLine();
                    }
                    langs.add(lang);
                    System.out.println(newC.getName() + " knows " + lang + ".");
                }
                System.out.println("Seems like you're done. This character knows " + langs.toString() + "\n It's time for Action.");
                //;languages//
                //TODO: alignment and Actions, and CONSTRUCTOR CALL.
                System.out.println("Done! Printing...");
                printWithAPI(newC);
            }
        }
        //auto-gen
        if (!isValidYesNo(YN)){
            System.out.print("Auto-generation selected. Is this correct? ");
            YN = input.nextLine();

            if (isValidYesNo(YN)) { //double checking
                System.out.println("Auto-gen confirmed. Starting...");
                newC.randomizeAll();
                autogenCharAttributes(newC);
            }
        }
    }

    public void autogenCharAttributes(Character newC){
        ArrayList<String> languages = new ArrayList<>();
        ArrayList<Action> actions = new ArrayList<>();

        //Alignment
        newC.setAlignment(alignments[r.nextInt(8)]); // r.nextInt returns int from 0 to the given parameter

        //Langs
        System.out.print("How many languages? (no more than 7) \n > ");
        int quant = intsOnly();

        while (quant < 0 || quant > 7 ) { //nothing under 0 nor over 7
            System.out.print("Invalid. \n How many languages? \n > ");
            quant = intsOnly();
        }

        for (int i = 0; i < quant ; i++) {
            languages.add(sampleLanguages[(int) r.nextInt(6)]); // minus one because arrays
            languages = noRepeats(languages);
        }

        //Actions - NOT actually random yet. Everyone gets Fireball. Review?
        Action fireball = new Action("Fireball",5,1,8,"Fire", "testdesc");
        actions.add(fireball);

        //Setting lists to character
        newC.setLanguages(languages);
        newC.setActions(actions);

        //commented because of tests. uncomment when complete
        printWithAPI(newC);
    }

    public void printWithAPI(Character c){
        CharacterAPI api = new CharacterAPI(c);
        api.printCharacter();
    }

    public static <E> ArrayList<E> noRepeats(ArrayList<E> repeatedObjs){
        LinkedHashSet<E> uniqueObjs = new LinkedHashSet<>();

        for (int i = 0; i < repeatedObjs.size(); i++) {
            uniqueObjs.add(repeatedObjs.get(i));
        }
        ArrayList<E> prunedList = new ArrayList<E>(uniqueObjs);
        return prunedList;
    }

    public boolean isValidYesNo(String in) {
        boolean flag = true;
        while (flag)
            if (in.equals("y") || in.equals("yes")) {
                return true;
            } else if (in.equals("n") || in.equals("no")){
                return false;
            } else {
                System.out.print("I didn't understand that. \n Try again (y/n): ");
                in = input.nextLine();
            }
            return false;
    }

    public int intsOnly(){
        Boolean flag = false;
        String in;
        do {
            in = input.nextLine();
            if (!(in.matches("[0-9]+"))) {
                flag = true;
                System.out.print("\""+ in +"\" must be an integer. \n > ");
            } else {
                flag = false;
            }
        } while (flag == true);
        return Integer.parseInt(in.trim());
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