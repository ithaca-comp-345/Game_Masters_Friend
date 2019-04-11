package edu.ithaca.gamemaster;

import java.util.ArrayList;

public class DiceRoll {
    private ArrayList<Integer> diceRolls;
    private int numDice;
    private int sides;
    public DiceRoll(int numOfDice, int sides){ //ex: 4D-6Side (4 - 6 sided dice)
        this.numDice=numOfDice;
        this.sides=sides;
    }
    public DiceRoll(){
        //default 2 dice each are 6 sided
        this.numDice=2;
        this.sides=6;
    }

    public int abilityRoll() {
        Dice die = new Dice();
        ArrayList<Integer> results = new ArrayList<Integer>();
        for (int i = 0; i < 4; i++) {
            results.add(die.roll());
        }

        int i, first, second, third;
        third = first = second = Integer.MIN_VALUE;
        for (i = 0; i < results.size(); i++) {
            if (results.get(i) > first) {
                third = second;
                second = first;
                first = results.get(i);
            } else if (results.get(i) > second) {
                third = second;
                second = results.get(i);
            } else if (results.get(i) > third)
                third = results.get(i);
        }

        //System.out.println("Three values are: " +
                //first + " " + second + " " + third);
        return first+second+third;
    }

    public int roll(){
        int total=0;
        Dice die = new Dice(sides);
        for(int i =0; i<numDice; i++){
            total += die.roll();
        }
        return total;
    }


}
