package edu.ithaca.gamemaster;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class charJSONTest {
    @Test
    void NPCtoJSONTest(){
        ArrayList<String> languages = new ArrayList<>();
        ArrayList<Action> actions = new ArrayList<>();
        languages.add("Orcish");
        languages.add("Elvish");
        languages.add("Binary");
        languages.add("Assembly");
        Action fireball = new Action("Fireball",5,1,8,"Fire");
        actions.add(fireball);

        Character example = new Character("Will Robinson",15,2,6,5,14,30,"Chaotic Neutral",languages,actions);
        NPC npc = new NPC(example);
        CharClasses test = new CharClasses(npc);
        test.npcToJSON(npc);
    }
}
