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

        Character[] charArray = new Character[5];
        for (int i = 0; i <5 ; i++) {
            charArray[i] = testChar;
        }


        StatCheck checker = new StatCheck();

        assertFalse(checker.skillCheck(testChar,"DEX",10,50,35));
        assertTrue(checker.groupSkillCheck(charArray,"INT",1,1,5));

    }
}
