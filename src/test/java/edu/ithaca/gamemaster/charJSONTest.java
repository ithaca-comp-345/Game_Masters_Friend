package edu.ithaca.gamemaster;

import edu.ithaca.gamemaster.utility.JSONUtility;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class charJSONTest {
    private Object IOException;

    @Test
    void NPCtoJSONTest() throws IOException{
        ArrayList<String> languages = new ArrayList<>();
        ArrayList<Action> actions = new ArrayList<>();
        languages.add("Orcish");
        languages.add("Elvish");
        languages.add("Binary");
        languages.add("Assembly");
        Action fireball = new Action("Fireball",5,1,8,"Fire","Stupid move");
        actions.add(fireball);

        Character example = new Character("Will Robinson",15,2,6,5,14,30,"Chaotic Neutral",languages,actions);
        NPC npc = new NPC(example);
        CharacterJSON.npcToJSON(npc);

    }
    @Test
    void CharactertoJSONTest() throws IOException{
        ArrayList<String> languages = new ArrayList<>();
        ArrayList<Action> actions = new ArrayList<>();
        languages.add("Orcish");
        languages.add("Elvish");
        languages.add("Binary");
        languages.add("Assembly");

        Character example = new Character("Will Robinson",15,2,6,5,14,30,"Chaotic Neutral",languages,actions);

        CharacterJSON.characterToJSON(example);

    }

    @Test
    void PlayertoJSONTest() throws IOException{
        ArrayList<String> languages = new ArrayList<String>();
        languages.add("English");
        languages.add("Elvish");
        languages.add("Common Tongue");

        ArrayList<Action> actions = new ArrayList<Action>();
        Action action1 = new Action("One Ring",5,1,6,"Magical","Stupid move");
        Action action2 = new Action("Sword Thrust",3,1,8,"Piercing", "Stupid move");

        ArrayList<String> traits = new ArrayList<String>();

        ArrayList<String> expertise = new ArrayList<String>();

        ArrayList<String> weapons = new ArrayList<String>();

        ArrayList<String> tools = new ArrayList<String>();

        ArrayList<String> savingThrows = new ArrayList<String>();

        ArrayList<String> skills = new ArrayList<String>();

        Player testPlayer = new Player("Frodo",100,2,6,20,30,30,15,15,15,15,15,15,"Lawful Good",
                languages,actions,32000,4,"Townfolk","Hobbit",15,5,"Small", traits,"Messenger", 3,expertise,"Backback",
                100,300,150,2,20,43,1,"Light Armor",weapons,
                tools,savingThrows,skills);

        testPlayer.generateThrows();
        testPlayer.generateSkills();


        CharacterJSON.playerToJSON(testPlayer);

    }


//    @Test
//    void PlayerfromJSONTest() throws IOException{
//        Player player = CharacterJSON.JSONtoPlayer("player.json");
//        assertEquals("Frodo",player.getName());
//        assertEquals(100,player.getHP());
//        assertEquals("Townfolk",player.getBackground());
//    }
//
//
//
//    @Test
//    void NPCfromJSONTest() throws IOException{
//        NPC npc = CharacterJSON.JSONtoNpc("npc.json");
//        assertEquals("Will Robinson", npc.getName());
//    }

}
