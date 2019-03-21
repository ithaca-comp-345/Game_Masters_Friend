package edu.ithaca.gamemaster;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class diceTest {
    @Test
    void diceTest(){
        Dice testDie = new Dice();
        int val = testDie.roll();
        int val1 = testDie.roll();
        Dice biggerDie = new Dice(10);
        int val2 = biggerDie.roll();
        int val3 = biggerDie.roll();
        System.out.println("First: " + val + " Second: " + val1 + " Third: " +
                 val2 + " Fourth: " + val3);
    }
    @Test
    void diceRollsTest(){
        DiceRoll test = new DiceRoll(4,6);
        int val = test.abilityRoll();
        System.out.println("Ability Roll: " + val);
    }
}
