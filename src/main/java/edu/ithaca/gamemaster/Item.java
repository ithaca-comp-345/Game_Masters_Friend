package edu.ithaca.gamemaster;

import edu.ithaca.gamemaster.containers.KeyPair;

public class Item {
    private String name;
    private int hitDiceAmt;
    private int hitDiceSide;
    private int weight;
    private int cost; //gold pieces etc.
    private String notes;
    private String attributes;
    private KeyPair range;
    private String properties;

    public Item(String name){
        this.name=name;
        this.hitDiceAmt=randomize();
        this.hitDiceSide=randomize();
        this.cost=randomizeCost();
        this.weight=randomizeCost(); // uses this cause it's bigger
    }

    public Item(String name, int hitDiceAmt, int hitDiceSide, int weight,
                int cost, String notes, String attributes, String lowerRange, String upperRange,
                String properties){
        this.name=name;
        this.hitDiceAmt=hitDiceAmt;
        this.hitDiceSide=hitDiceSide;
        this.weight=weight;
        this.cost=cost;
        this.notes=notes;
        this.attributes=attributes;
        //TODO continue later
    }

    private int randomize(){
        int val = ((int) (Math.random() * 10)) + 1;
        return val;
    }

    private int randomizeCost(){
        int val = ((int) (Math.random() * 500)) + 1;
        return val;
    }

    public int rollDamage(){
        DiceRoll roll = new DiceRoll(hitDiceAmt,hitDiceSide);
        return roll.roll();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHitDiceAmt(int hitDiceAmt) {
        this.hitDiceAmt = hitDiceAmt;
    }

    public void setHitDiceSide(int hitDiceSide) {
        this.hitDiceSide = hitDiceSide;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    public void setRange(KeyPair range) {
        this.range = range;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    // Getter Methods

    public String getName() {
        return name;
    }

    public int getHitDiceAmt() {
        return hitDiceAmt;
    }

    public int getHitDiceSide() {
        return hitDiceSide;
    }

    public int getWeight() {
        return weight;
    }

    public int getCost() {
        return cost;
    }

    public String getNotes() {
        return notes;
    }

    public String getAttributes() {
        return attributes;
    }

    public String getRange() {
        String s = range.getFirst() + "/" + range.getSecond();
        return s;
    }

    public String getProperties() {
        return properties;
    }
}
