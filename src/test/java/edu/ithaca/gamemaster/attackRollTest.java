package edu.ithaca.gamemaster;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class attackRollTest {


    @Test
    void attackRollPvP(){

        //character for test
        Character testCharacter  = new Character("Demon");
        Character testCharacter2  = new Character("Flare");
        Character npc = new Character("NPC");
        npc.setHP(25);
        NPC tescNpc = new NPC(npc);
        testCharacter2.randomizeAbilityScores();
        testCharacter.randomizeAbilityScores();
        testCharacter2.setHP(25);
        //setting strength
        testCharacter.setStrength(10);
        testCharacter2.setArmor(10);

        //Creates an AttackRoll
        AttackRoll attackRoll = new AttackRoll();
        attackRoll.attackPvP(testCharacter, testCharacter2);

        //after attack PvP
        assertNotEquals(testCharacter2.getHP(),25);

        //after attack PvNPC
        attackRoll.attackPvNPV(testCharacter,tescNpc);
        assertNotEquals(testCharacter2.getHP(), 25);

    }



}
