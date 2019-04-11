package edu.ithaca.gamemaster;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class playerCharacterTest {
    @Test
    void createPlayerTest(){
        ArrayList<String> languages = new ArrayList<String>();
        languages.add("English");
        languages.add("Elvish");
        languages.add("Common Tongue");

        ArrayList<Action> actions = new ArrayList<Action>();
        Action action1 = new Action("One Ring",5,1,6,"Magical", "");
        Action action2 = new Action("Sword Thrust",3,1,8,"Piercing", "");

        ArrayList<String> traits = new ArrayList<String>();

        ArrayList<String> expertise = new ArrayList<String>();

        ArrayList<String> weapons = new ArrayList<String>();

        ArrayList<String> tools = new ArrayList<String>();

        ArrayList<String> savingThrows = new ArrayList<String>();

        ArrayList<String> skills = new ArrayList<String>();

        Player testPlayer = new Player("Frodo",1000,2,6,20,30,30,15,15,15,15,15,15,"Lawful Good",
                languages,actions,32000,4,"Townfolk","Hobbit",15,5,"Small", traits,"Messenger", 3,expertise,"Backback",
                100,300,150,2,20,43,1,"Light Armor",weapons,
                tools,savingThrows,skills);
        assertEquals("Frodo",testPlayer.getName());
        assertEquals(1000,testPlayer.getHP());

        languages.add("Orcish");
        languages.add("Elvish");
        languages.add("Binary");
        languages.add("Assembly");
        Action fireball = new Action("Fireball",5,1,8,"Fire", "testdesc");
        actions.add(fireball);

        Player example = new Player("Will Robinson",15,2,6,5,14,30,"Chaotic Neutral",languages,actions);

    }
}
