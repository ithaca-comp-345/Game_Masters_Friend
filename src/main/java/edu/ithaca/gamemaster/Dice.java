package edu.ithaca.gamemaster;

public class Dice {
    private int sides, value;

    public Dice(){
        //default 6-sided die
        this.sides=6;
    }
    public Dice(int sides){
        //more custom sided die
        this.sides=sides;
    }
    public int roll(){
        this.value = ((int) (Math.random() * sides)) + 1;
        return value;
    }
}
