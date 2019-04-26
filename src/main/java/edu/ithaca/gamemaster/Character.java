package edu.ithaca.gamemaster;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Character {
    //HP stuff
    private int hitPts;
    private int hitDiceAmt;
    private int hitDiceSided;
    private int hitDiceModifier;
    private int armor;
    private int speed;

    //Ability Scores
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

    //Other stuff
    private String name;
    private String alignment;
    private ArrayList<String> languages;
    private ArrayList<Action> actions;

    //Constructor

    public Character(String name){
        this.name = name;
        randomizeAll();
    }

    public Character(String name,int hitPts, int hitDice, int hitSide, int hitMod,
                     int armor, int speed, int strength, int dexterity,
                     int constitution, int intelligence, int wisdom, int charisma,
                     String alignment, ArrayList<String> languages, ArrayList<Action> actions){
        this.name=name;
        this.hitPts=hitPts;
        this.hitDiceAmt=hitDice;
        this.hitDiceSided=hitSide;
        this.hitDiceModifier=hitMod;
        this.armor=armor;
        this.speed=speed;
        this.strength=strength;
        this.dexterity=dexterity;
        this.constitution=constitution;
        this.intelligence=intelligence;
        this.wisdom=wisdom;
        this.charisma=charisma;
        this.alignment=alignment;
        this.languages=languages;
        this.actions=actions;
    }

    //randomized character abilities
    public Character(String name, int hitPts, int hitDice, int hitSide, int hitMod,
                     int armor, int speed, String alignment, ArrayList<String> languages, ArrayList<Action> actions){
        randomizeAbilityScores();
        this.name=name;
        this.hitPts=hitPts;
        this.hitDiceAmt=hitDice;
        this.hitDiceSided=hitSide;
        this.hitDiceModifier=hitMod;
        this.armor=armor;
        this.speed=speed;
        this.alignment=alignment;
        this.languages=languages;
        this.actions=actions;
    }

    //default for json usage
    public Character() {
        this.name=null;
        this.hitPts=1;
        this.hitDiceAmt=1;
        this.hitDiceSided=1;
        this.hitDiceModifier=1;
        this.armor=1;
        this.speed=1;
        this.alignment=null;
        this.languages=null;
        this.actions=null;
    }

    //Validation Methods

    public static void checkValid20(int input){
        if(input > 22){
            throw new IllegalArgumentException("Modifiers can only be less than 20");
        }
    }

    public static void checkValid0(int input){
        if(input < 0){
            throw new IllegalArgumentException("Modifiers cannot be less than 0");
        }
    }

    private static boolean checkListAdd(ArrayList list,Object item ){
        if(list.contains(item)){
            return true; }
        else{
            return false; }
    }

    //Randomize Methods

    //TODO more randomization of other stat fields

    public void randomizeAll(){
        randomizeAbilityScores();
        this.armor = randomizeValue();
        this.speed = randomizeValue();
        this.hitPts = randomizeValue();
        this.hitDiceAmt = randomizeDice();
        this.hitDiceModifier = randomizeValue();
        this.hitDiceSided = randomizeDiceSides();

    }

    private int randomizeValue(){
        //mutator method
        int value = ((int) (Math.random() * 50)) + 1;
        return value;
    }

    private int randomizeDiceSides(){
        int value = ((int) (Math.random() * 4)) + 1;
        return value;
    }

    private int randomizeDice(){
        int value = ((int) (Math.random() * ((20 - 4)+1)) + 4);
        return value;
    }

    public void randomizeAbilityScores(){
        int statRolls = 6;
        ArrayList<Integer> rolls = new ArrayList<Integer>();
        DiceRoll randomizer = new DiceRoll(4,6);

        //Randomized ability rolls
        setStrength(randomizer.abilityRoll());
        setDexterity(randomizer.abilityRoll());
        setConstitution(randomizer.abilityRoll());
        setIntelligence(randomizer.abilityRoll());
        setWisdom(randomizer.abilityRoll());
        setCharisma(randomizer.abilityRoll());

    }

    //Set Methods

    public void setHP(int startingHP){
        checkValid0(startingHP);
        this.hitPts=startingHP;
    }
    public void setHitDice(int numDice, int diceSides, int hitModifier){
        this.hitDiceAmt=numDice;
        this.hitDiceSided=diceSides;
        this.hitDiceModifier=hitModifier;
    }
    public void setName(String newName){this.name=newName;}

    public void setStrength(int newStrength){
        checkValid20(newStrength);
        checkValid0(newStrength);
        this.strength=newStrength;}
    public void setDexterity(int newDexterity){this.dexterity=newDexterity;}
    public void setConstitution(int newConstitution){this.constitution=newConstitution;}
    public void setIntelligence(int newIntelligence){this.intelligence=newIntelligence;}
    public void setWisdom(int newWisdom){this.wisdom=newWisdom;}
    public void setCharisma(int newCharisma){this.charisma=newCharisma;}
    public void setSpeed(int newSpeed){this.speed=newSpeed;}
    public void setArmor(int newArmor){this.armor=newArmor;}
    public void setAlignment(String newAlignment){this.alignment=newAlignment;}
    public void setLanguages(ArrayList<String> languages){ this.languages=languages;}
    public void setActions(ArrayList<Action> actions){ this.actions=actions;}

    //List add stuff

    public void addLanguage(String newLanguage){
        languages.add(newLanguage);
        boolean checked = checkListAdd(languages,newLanguage);
        if(checked){
            //do nothing
        }
        else{
            throw new IndexOutOfBoundsException("Language wasn't added to list");
        }
    }

    public void addAction(Action newAction){
        actions.add(newAction);
        boolean checked = checkListAdd(actions,newAction);
        if(checked){
            //do nothing
        }
        else{
            throw new IndexOutOfBoundsException("Action wasn't added to list");
        }

    }

    //Get Methods

    public String getName(){ return name;}
    public int getHP(){ return hitPts;}
    public int getStrength(){ return strength;}
    public int getDexterity(){ return dexterity;}
    public int getConstitution(){ return constitution;}
    public int getIntelligence(){ return intelligence;}
    public int getWisdom(){ return wisdom;}
    public int getCharisma(){ return charisma;}
    public int getSpeed(){ return speed;}
    public int getArmor(){ return armor;}
    public String getAlignment(){ return alignment;}

    public String getHitDice(){
        StringBuilder hitD = new StringBuilder();
        hitD.append(hitDiceAmt + "d" + hitDiceSided + "+" + hitDiceModifier);
        String hitDice = hitD.toString();
        return hitDice;
    }
    public int getHitDiceSided(){
        return hitDiceSided;
    }
    public int getHitDiceAmt(){
        return hitDiceAmt;
    }
    public int getHitDiceModifier(){
        return hitDiceModifier;
    }

    //List stuff

    public String getLanguages(){
        if(languages.isEmpty()){
            return "Character knows no languages";
        }
        return languages.toString();
    }
    public String getActions(){
        StringBuilder actOut = new StringBuilder();
        for(int i = 0; i<actions.size(); i++){
            actOut.append(actions.get(i).getName() + ", ");
        }
        String actionString = actOut.toString();
        return actionString;
    }
    public ArrayList<String> getLanguageList(){
        return languages;
    }
    public ArrayList<Action> getActionsList(){
        return actions;
    }
}
