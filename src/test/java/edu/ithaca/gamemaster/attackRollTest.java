package edu.ithaca.gamemaster;
import org.junit.jupiter.api.Test;

public class attackRollTest {


    @Test
    void attackRollTest(){

        //character for test
        Character testCharacter  = new Character("Demon");
        Character testCharacter2  = new Character("Flare");

        testCharacter2.randomizeAbilityScores();
        testCharacter.randomizeAbilityScores();

        System.out.println(testCharacter.getStrength());
        System.out.println(testCharacter2.getStrength());

    }



}
