package edu.ithaca.gamemaster;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class encounterTest {
    @Test
    void addNPCTest(){
        Encounter encounter = new Encounter();

        Character character1 = new Character("Cristian");
        NPC npc1 = new NPC(character1);
        encounter.addNPC(npc1);

        Character character2 = new Character("Milo");
        NPC npc2 = new NPC(character2);
        encounter.addNPC(npc2);

        Character character3 = new Character("Maily");
        NPC npc3 = new NPC(character3);

        Character character4 = new Character("Lee");
        NPC npc4 = new NPC(character4);


        assertTrue(encounter.isNPCinList(npc1));
        assertTrue(encounter.isNPCinList(npc2));
        assertFalse(encounter.isNPCinList(npc3));
        assertFalse(encounter.isNPCinList(npc4));



        assertThrows(IllegalArgumentException.class, ()->encounter.addNPC(npc1));
        assertThrows(IllegalArgumentException.class, ()->encounter.addNPC(npc2));
    }

    @Test
    void addPlayerTest(){
        Encounter encounter = new Encounter();

        Player player1 =  new Player("Cristian");
        Player player2 =  new Player("Milo");
        Player player3 =  new Player("Maily");
        Player player4 =  new Player("Lee");

        encounter.addPlayer(player1);
        encounter.addPlayer(player2);

        assertTrue(encounter.isPlayerinList(player1));
        assertTrue(encounter.isPlayerinList(player2));
        assertFalse(encounter.isPlayerinList(player3));
        assertFalse(encounter.isPlayerinList(player4));

        assertThrows(IllegalArgumentException.class, ()->encounter.addPlayer(player1));
        assertThrows(IllegalArgumentException.class, ()->encounter.addPlayer(player2));

    }

    @Test
    void orderOfAttack(){
        Encounter encounter = new Encounter();

        Player player1 =  new Player("Cristian");
        Player player2 =  new Player("Milo");
        Player player3 =  new Player("Maily");
        Player player4 =  new Player("Lee");

        encounter.addPlayer(player1);
        encounter.addPlayer(player2);
        encounter.addPlayer(player3);
        encounter.addPlayer(player4);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(16);
        list.add(18);
        list.add(4);

        encounter.orderOfAttack(list);
        assertEquals("Maily Milo Lee Cristian ", encounter.orderOfAttackString());


    }

}
