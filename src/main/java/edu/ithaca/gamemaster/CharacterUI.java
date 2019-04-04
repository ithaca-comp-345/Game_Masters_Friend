package edu.ithaca.gamemaster;

import java.util.*;

public class CharacterUI {
    Scanner input = new Scanner(System.in);
    Random r = new Random();
    String sampleLanguages[] = new String[]{"Common", "Dwarvish ", "Elvish", "Gnomish", "Goblin", "Halfing", "Orc"};
    String alignments[] = new String[]{"Lawful good", "Lawful neutral ", "Lawful evil", "Neutral good", "True neutral", "Neutral evil", "Chaotic good", "Chaotic neutral", "Chaotic evil"};

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
        //manually
        if (isValidYesNo(YN)) {
            System.out.print("Manual entry selected. Is this correct? ");
            YN = input.nextLine();

            if (isValidYesNo(YN)) { //double checking
                System.out.print("Manual confirmed. Begin: \n");
                //TODO: collect data and call API setter method
                //get stat input value (or dice roll "DiceRoll")
                //check for valid input
                //call setter
                System.out.println("Actually, you can't do this yet. Try auto-gen instead!");
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
        CharacterAPI api = new CharacterAPI(newC);
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