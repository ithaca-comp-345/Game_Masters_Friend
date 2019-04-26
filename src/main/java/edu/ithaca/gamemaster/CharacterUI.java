package edu.ithaca.gamemaster;

import java.lang.reflect.Array;
import java.util.*;

public class CharacterUI {
    boolean isManual = false;
    Scanner input = new Scanner(System.in);
    Random r = new Random();
    String sampleLanguages[] = new String[]{"Common", "Dwarvish ", "Elvish", "Gnomish", "Goblin", "Halfing", "Orc"};
    String alignments[] = new String[]{"Lawful good", "Lawful neutral ", "Lawful evil", "Neutral good", "True neutral", "Neutral evil", "Chaotic good", "Chaotic neutral", "Chaotic evil"};
    String intStatNames[] = new String[]{"hit points","hit dice", "dice amount", "dice modifier", "armor", "speed", "strength", "dexterity", "constitution", "intelligence", "wisdom", "charisma"};
    String actionStatNames[] = new String[]{"damage", "die amount", "die sides"};

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
                isManual = true;
                System.out.print("Manual confirmed. Begin: \n");
                System.out.println("Assigning stats for " + newC.getName() + ".");

                //int stats//
                int[] stats_holder = new int[intStatNames.length];
                int intHolder = 0;
                for (int i = 0; i < stats_holder.length; i++) {
                    System.out.print("Give " + newC.getName() + " some " + intStatNames[i] + " stat. > ");
                    intHolder = intsOnly();
                    stats_holder[i] = intHolder;
                    while (intHolder <= 0 || intHolder >= 22) { // Wanted to use Character.checkvalid20, but couldn't.
                        System.out.print("Values must be more than 0, and less than 22. \n >");
                        intHolder = intsOnly();
                    }
                }
                //;int stats//

                //languages//
                System.out.println("Great - now add a few languages to your character. You can also skip this step with \"0\". Otherwise, press Enter to begin.");
                ArrayList<String> langs = new ArrayList<>();
                String lang = input.nextLine();

                if (lang.equals("0")){ //skip adding languages
                    System.out.println(newC.getName() + " won't know any languages. Is this correct?");
                    lang = input.nextLine();
                    if (isValidYesNo(lang)) {
                        lang = "0"; //bypass the next while loop
                        System.out.println("Wonderful; Moving on to Actions...");
                    }
                    lang = "1"; // "I made a mistake, put me into the while loop please"
                } //;skip//

                while (!lang.equals("0")){ //BUG: character will always know "0". in the demo, it wont let the user skip. use key press listener instead of String?
                    System.out.println("Enter language (or 0 to stop): ");
                    lang = input.nextLine();
                    while (!isNotEmptyString(lang)) {
                        System.out.print("Please give input. \n Enter name: ");
                        lang = input.nextLine();
                    }
                    langs.add(lang);
                    System.out.println(newC.getName() + " knows " + lang + ".");
                }
                //this line always prints, regardless if user chooses to skip. find a way to integrate into loop
                System.out.println("Seems like you're done. This character knows " + langs.toString() + "\n It's time for Action.");
                //;languages//

                //actions// - this might be able to be in its own function. regardless, this class is getting pretty procedural//
                boolean isActionRunning = true;
                ArrayList<Action> acts = new ArrayList<>();

                while (isActionRunning) {
                    System.out.println("Your Action needs a name.");
                    String actionName = input.nextLine();

                    while (!isNotEmptyString(actionName)) {
                        System.out.print("It needs a name. \n Enter name: ");
                        actionName = input.nextLine();
                    }

                    int[] ash = new int[actionStatNames.length]; //ash: action stat holder
                    int intASH;
                    for (int i = 0; i < (ash.length); i++) {
                        System.out.print(actionName + " needs a " + actionStatNames[i] + " value. > ");
                        intASH = intsOnly();
                        while (intASH <= 0 || intASH >= 22) { // Wanted to use Character.checkvalid20, but couldn't.
                            System.out.print("Values must be more than 0, and less than 22. \n >");
                            intASH = intsOnly();
                        }
                    }
                    System.out.println("What's your damage [type]? > ");
                    String dmgType = input.nextLine();
                    while (!isNotEmptyString(dmgType)) {
                        System.out.print("You've got to put something down. Maybe \"Sarcasm\"? \n Enter damage type: ");
                        dmgType = input.nextLine();
                    }
                    System.out.println("Tell us about this action. What's it do?(description) > ");
                    String actDesc = input.nextLine();
                    while (!isNotEmptyString(actDesc)) {
                        System.out.print("You have to put something here. Garble, even. \n Try again: ");
                        actDesc = input.nextLine();
                    }
                    acts.add(actionStitcher(actionName, ash, dmgType, actDesc));

                    System.out.println("Would you like to add another action?");
                    String repeat = input.nextLine();
                    if (!isValidYesNo(repeat)){
                        isActionRunning = false;
                    }
                }
                //alignment//
                System.out.println("Finally, the character needs an alignment. Choose from 0-8, then press enter twice.");
                for (int i = 0; i < alignments.length; i++) {
                    System.out.print(i + ") " + alignments[i] + "\n");
                }
                String ncAlign = alignments[r.nextInt(8)]; //defaults to some rand value in case of error
                boolean areYouDone = false;
                while (!areYouDone) {
                    int alignInx = intsOnly();
                    String ayd = input.nextLine();

                    while (alignInx < 0 || alignInx > 8) {
                        System.out.print("You have to choose the number that corresponds with the options above. \n >");
                        alignInx = intsOnly();
                    }
                    ncAlign = alignments[alignInx];
                    System.out.println("You've chosen  \"" + alignments[alignInx] + "\". Is this correct? y/n ");
                    ayd = input.nextLine(); //ayd: are you done
                    areYouDone = isValidYesNo(ayd);
                }
                //;alignment//

                //FINAL STEP: constructor call//
                newC = characterStitcher(newC.getName(), stats_holder, langs, acts, ncAlign);

                System.out.println("Done! Printing...");
                printWithAPI(newC);
            }
        }
        //auto-gen
        if (!isValidYesNo(YN) && !isManual){
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

    private Character characterStitcher(String name, int[] stats, ArrayList<String> langs, ArrayList<Action> acts, String a){
        Character completedC = new Character(name,
                stats[0], stats[1], stats[2], stats[3], stats[4], stats[5], stats[6], stats[7],stats[8], stats[9], stats[10], stats[11],
                a, langs, acts); //oof this is long
        return completedC;
    }

    private Action actionStitcher(String name, int[] stats, String dmgt, String desc){
        Action stiched = new Action (name, stats[0], stats[1], stats[2], dmgt, desc); //this is funky
        return stiched;
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