package edu.ithaca.gamemaster;

import java.util.ArrayList;

public class NPC extends Character {

    //TODO unfinished but can be initialized through get/set methods

    private ArrayList<String> skills;
    private ArrayList<String> specialTraits;
    private ArrayList<String> senses;
    private ArrayList<String> dmgResist;
    private ArrayList<String> dmgImmune;
    private ArrayList<String> condImmune;
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

    public NPC(Character character){
        super(character.getName());
    }

    public NPC(String name){
        super(name);
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
