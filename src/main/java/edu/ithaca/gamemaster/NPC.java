package edu.ithaca.gamemaster;

import java.util.ArrayList;

public class NPC extends Character {

    //TODO unfinished but can be initialized through get/set methods

    private ArrayList<String> skills;
    private ArrayList<String> specialTraits;
    private ArrayList<String> senses;
    private ArrayList<String> dmgResist;
    private ArrayList<String> dmgImmune;
    private ArrayList<String> condImmune; //condition immunity
    private int challenge;
    private int strenSave;
    private int dexteSave;
    private int constSave;
    private int intelSave;
    private int wisdoSave;
    private int chariSave;
    private String size;
    private String type; //beast, aberration, celestial, construct, dragon, elemental,
    // fey, fiend, giant, humanoid, monstrosity, ooze, plant, undead

    public NPC(){
        super();
    }

    public NPC(Character character){
        super(character.getName(),character.getHP(),character.getHitDiceAmt(),
                character.getHitDiceSided(),character.getHitDiceModifier(),character.getArmor(),
                character.getSpeed(),character.getStrength(),character.getDexterity(),
                character.getConstitution(),character.getIntelligence(),
                character.getWisdom(),character.getCharisma(),character.getAlignment(),character.getLanguageList(),
                character.getActionsList());
    }

    public NPC(String name, int hitPts, int hitDice, int hitSide, int hitMod,
               int armor, int speed, int strength, int dexterity, int constitution,
               int intelligence, int wisdom, int charisma, String alignment,
               ArrayList<String> languages, ArrayList<Action> actions){
        super(name,hitPts,hitDice,hitSide,hitMod,armor,speed,strength,dexterity,
                constitution,intelligence,wisdom,charisma,alignment,languages,
                actions);
    }

    public NPC(String name, int hitPts, int hitDice, int hitSide, int hitMod,
               int armor, int speed, int strength, int dexterity, int constitution,
               int intelligence, int wisdom, int charisma, String alignment,
               ArrayList<String> languages, ArrayList<Action> actions, int challenge,
               int strenSave, int dexteSave, int constSave, int intelSave, int wisdoSave, int chariSave,
               String size, String type, ArrayList<String> skills,
               ArrayList<String> specialTraits, ArrayList<String> senses, ArrayList<String> dmgResist,
               ArrayList<String> dmgImmune, ArrayList<String> condImmune){
        super(name,hitPts,hitDice,hitSide,hitMod,armor,speed,strength,dexterity,
                constitution,intelligence,wisdom,charisma,alignment,languages,
                actions);
        this.challenge=challenge;
        this.strenSave=strenSave;
        this.dexteSave=dexteSave;
        this.constSave=constSave;
        this.intelSave=intelSave;
        this.wisdoSave=wisdoSave;
        this.chariSave=chariSave;
        this.size=size;
        this.type=type;
        this.skills=skills;
        this.specialTraits=specialTraits;
        this.senses=senses;
        this.dmgResist=dmgResist;
        this.dmgImmune=dmgImmune;
        this.condImmune=condImmune;
    }

    @Override
    public String toString(){
        return super.getName();
    }

    //Generators
    public void generateNPC(){
        //TODO
    }

    public void generateNPCType(String type){
        //TODO
    }

    //Set Methods

    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }

    public void setSpecialTraits(ArrayList<String> specialTraits) {
        this.specialTraits = specialTraits;
    }

    public void setSenses(ArrayList<String> senses) {
        this.senses = senses;
    }

    public void setDmgResist(ArrayList<String> dmgResist) {
        this.dmgResist = dmgResist;
    }

    public void setDmgImmune(ArrayList<String> dmgImmune) {
        this.dmgImmune = dmgImmune;
    }

    public void setCondImmune(ArrayList<String> condImmune) {
        this.condImmune = condImmune;
    }

    public void setChallenge(int challenge) {
        this.challenge = challenge;
    }

    public void setStrenSave(int strenSave) {
        this.strenSave = strenSave;
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

    public void setSize(String size) {
        this.size = size;
    }

    public void setType(String type) {
        this.type = type;
    }

    //Get Methods

    public ArrayList<String> getSkills() {
        return skills;
    }

    public ArrayList<String> getSpecialTraits() {
        return specialTraits;
    }

    public ArrayList<String> getSenses() {
        return senses;
    }

    public ArrayList<String> getDmgResist() {
        return dmgResist;
    }

    public ArrayList<String> getDmgImmune() {
        return dmgImmune;
    }

    public ArrayList<String> getCondImmune() {
        return condImmune;
    }

    public int getChallenge() {
        return challenge;
    }

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

    public String getSize() {
        return size;
    }

    public String getType() {
        return type;
    }
}
