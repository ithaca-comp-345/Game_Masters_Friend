package edu.ithaca.gamemaster;

import java.util.ArrayList;

public class Player extends Character{
    //Saving Throws
    private int strenSave;
    private int dexteSave;
    private int constSave;
    private int intelSave;
    private int wisdoSave;
    private int chariSave;
    private int proficiencyBonus;

    //Skills
    private int acrobatics;
    private int animalHandling;
    private int arcana;
    private int athletics;
    private int deception;
    private int history;
    private int insight;
    private int intimidation;
    private int investigation;
    private int medicine;
    private int nature;
    private int perception;
    private int performance;
    private int persuasion;
    private int religion;
    private int slightOfHand;
    private int stealth;
    private int survival;

    //Misc
    private int passiveWisdom;
    private int initiative;


    //Traits
    private String age;
    private String size;
    private ArrayList<String> traits;

    //Class
    private String charClass;
    private int level;
    private String race;

    private ArrayList<String> expertise;

    //Life
    private int deathSaveSuccess = 3;
    private int deathSaveFail = 3;

    //Carried Stuff
    private String carriedGear;
    private int maxCarry;
    private int maxPushPull;
    private int maxLift;

    //Currency
    private int gp; //gold pieces
    private int sp; //silver pieces
    private int cp; //copper pieces
    private int gems;
    private String misc; //anything else

    //Proficiencies
    private String armorType;
    private ArrayList<String> weapons;
    private ArrayList<String> tools;
    private ArrayList<String> savingThrows;
    private ArrayList<String> skills;



    public Player(String name){
        super(name);


    }

    public Player(Character character){
        super(character.getName());

    }

    //Set Methods

    public void setStrenSave(int save){
        this.strenSave=save;
    }

    public void setDexteSave(int dexteSave) {
        this.dexteSave = dexteSave;
    }

    public void setConstSave(int constSave) {
        this.constSave = constSave;
    }

    public void setIntelSave(int intelSave) {
        this.intelSave = intelSave;
    }

    public void setWisdoSave(int wisdoSave) {
        this.wisdoSave = wisdoSave;
    }

    public void setChariSave(int chariSave) {
        this.chariSave = chariSave;
    }

    public void setProficiencyBonus(int proficiencyBonus) {
        this.proficiencyBonus = proficiencyBonus;
    }

    public void setAcrobatics(int acrobatics) {
        this.acrobatics = acrobatics;
    }

    public void setAnimalHandling(int animalHandling) {
        this.animalHandling = animalHandling;
    }

    public void setArcana(int arcana) {
        this.arcana = arcana;
    }

    public void setAthletics(int athletics) {
        this.athletics = athletics;
    }

    public void setDeception(int deception) {
        this.deception = deception;
    }

    public void setHistory(int history) {
        this.history = history;
    }

    public void setInsight(int insight) {
        this.insight = insight;
    }

    public void setIntimidation(int intimidation) {
        this.intimidation = intimidation;
    }

    public void setInvestigation(int investigation) {
        this.investigation = investigation;
    }

    public void setMedicine(int medicine) {
        this.medicine = medicine;
    }

    public void setNature(int nature) {
        this.nature = nature;
    }

    public void setPerception(int perception) {
        this.perception = perception;
    }

    public void setPerformance(int performance) {
        this.performance = performance;
    }

    public void setPersuasion(int persuasion) {
        this.persuasion = persuasion;
    }

    public void setReligion(int religion) {
        this.religion = religion;
    }

    public void setSlightOfHand(int slightOfHand) {
        this.slightOfHand = slightOfHand;
    }

    public void setStealth(int stealth) {
        this.stealth = stealth;
    }

    public void setSurvival(int survival) {
        this.survival = survival;
    }

    public void setPassiveWisdom(int passiveWisdom) {
        this.passiveWisdom = passiveWisdom;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setTraits(ArrayList<String> traits) {
        this.traits = traits;
    }

    public void setcharClass(String aClass) {
        charClass = aClass;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setExpertise(ArrayList<String> expertise) {
        this.expertise = expertise;
    }

    public void setDeathSaveSuccess(int deathSaveSuccess) {
        this.deathSaveSuccess = deathSaveSuccess;
    }

    public void setDeathSaveFail(int deathSaveFail) {
        this.deathSaveFail = deathSaveFail;
    }

    public void setCarriedGear(String carriedGear) {
        this.carriedGear = carriedGear;
    }

    public void setMaxCarry(int maxCarry) {
        this.maxCarry = maxCarry;
    }

    public void setMaxPushPull(int maxPushPull) {
        this.maxPushPull = maxPushPull;
    }

    public void setMaxLift(int maxLift) {
        this.maxLift = maxLift;
    }

    public void setGp(int gp) {
        this.gp = gp;
    }

    public void setSp(int sp) {
        this.sp = sp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public void setGems(int gems) {
        this.gems = gems;
    }

    public void setMisc(String misc) {
        this.misc = misc;
    }

    public void setArmorType(String armorType) {
        this.armorType = armorType;
    }

    public void setWeapons(ArrayList<String> weapons) {
        this.weapons = weapons;
    }

    public void setTools(ArrayList<String> tools) {
        this.tools = tools;
    }

    public void setSavingThrows(ArrayList<String> savingThrows) {
        this.savingThrows = savingThrows;
    }

    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }

    public void setRace(String aRace){ this.race=aRace;}

    //Get Methods

    public int getStrenSave() {
        return strenSave;
    }

    public int getDexteSave() {
        return dexteSave;
    }

    public int getConstSave() {
        return constSave;
    }

    public int getIntelSave() {
        return intelSave;
    }

    public int getWisdoSave() {
        return wisdoSave;
    }

    public int getChariSave() {
        return chariSave;
    }

    public int getProficiencyBonus() {
        return proficiencyBonus;
    }

    public int getAcrobatics() {
        return acrobatics;
    }

    public int getAnimalHandling() {
        return animalHandling;
    }

    public int getArcana() {
        return arcana;
    }

    public int getAthletics() {
        return athletics;
    }

    public int getDeception() {
        return deception;
    }

    public int getHistory() {
        return history;
    }

    public int getInsight() {
        return insight;
    }

    public int getIntimidation() {
        return intimidation;
    }

    public int getInvestigation() {
        return investigation;
    }

    public int getMedicine() {
        return medicine;
    }

    public int getNature() {
        return nature;
    }

    public int getPerception() {
        return perception;
    }

    public int getPerformance() {
        return performance;
    }

    public int getPersuasion() {
        return persuasion;
    }

    public int getReligion() {
        return religion;
    }

    public int getSlightOfHand() {
        return slightOfHand;
    }

    public int getStealth() {
        return stealth;
    }

    public int getSurvival() {
        return survival;
    }

    public int getPassiveWisdom() {
        return passiveWisdom;
    }

    public int getInitiative() {
        return initiative;
    }

    public String getAge() {
        return age;
    }

    public String getSize() {
        return size;
    }

    public ArrayList<String> getTraits() {
        return traits;
    }

    public String getCharClass() {
        return charClass;
    }

    public int getLevel() {
        return level;
    }

    public ArrayList<String> getExpertise() {
        return expertise;
    }

    public int getDeathSaveSuccess() {
        return deathSaveSuccess;
    }

    public int getDeathSaveFail() {
        return deathSaveFail;
    }

    public String getCarriedGear() {
        return carriedGear;
    }

    public int getMaxCarry() {
        return maxCarry;
    }

    public int getMaxPushPull() {
        return maxPushPull;
    }

    public int getMaxLift() {
        return maxLift;
    }

    public int getGp() {
        return gp;
    }

    public int getSp() {
        return sp;
    }

    public int getCp() {
        return cp;
    }

    public int getGems() {
        return gems;
    }

    public String getMisc() {
        return misc;
    }

    public String getArmorType() {
        return armorType;
    }

    public ArrayList<String> getWeapons() {
        return weapons;
    }

    public ArrayList<String> getTools() {
        return tools;
    }

    public ArrayList<String> getSavingThrows() {
        return savingThrows;
    }

    public ArrayList<String> getSkills() {
        return skills;
    }
}
