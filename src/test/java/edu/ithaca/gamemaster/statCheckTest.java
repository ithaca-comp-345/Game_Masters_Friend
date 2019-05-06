package edu.ithaca.gamemaster;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class statCheckTest {



    @Test
    void skillCheckTest(){
        Character testChar = new Character("Fauxcus");
        testChar.setDexterity(1);
        testChar.setIntelligence(30);

        int[] rolls = {20,20,20,20,20};
        Character[] charArray = new Character[5];
        for (int i = 0; i <5 ; i++) {
            charArray[i] = testChar;
        }



        StatCheck checker = new StatCheck();

        //automatic check tests
        assertFalse(checker.autoSkillCheck(testChar,"DEX",10,50,35));
        assertTrue(checker.autoGroupSkillCheck(charArray,"INT",1,5,5));

        //manual stat check
        assertFalse(checker.manualSkillCheck(testChar,"DEX",10,10,50,35));
        assertTrue(checker.manualGroupSkillCheck(charArray,"INT",rolls,1,5,5));

    }
}
