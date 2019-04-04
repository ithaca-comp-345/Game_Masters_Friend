package edu.ithaca.gamemaster;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class playerCharacterTest {
    @Test
    void createPlayerTest(){
        Player testPlayer = new Player("Frodo");
        testPlayer.setHP(1000);
        testPlayer.setRace("Hobbit");
        testPlayer.setLevel(2);
        testPlayer.setcharClass("Paladin");
        testPlayer.setAge("26");
        testPlayer.randomizeAbilityScores();
        assertEquals("Frodo",testPlayer.getName());
        assertEquals(1000,testPlayer.getHP());

        ArrayList<String> languages = new ArrayList<>();
        ArrayList<Action> actions = new ArrayList<>();
        languages.add("Orcish");
        languages.add("Elvish");
        languages.add("Binary");
        languages.add("Assembly");
        Action fireball = new Action("Fireball",5,1,8,"Fire", "testdesc");
        actions.add(fireball);

        Player example = new Player("Will Robinson",15,2,6,5,14,30,"Chaotic Neutral",languages,actions);

    }
}
