package edu.ithaca.gamemaster;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class campaignTest {

    @Test
    void addUserPlayersTest(){
        Campaign campaign=new Campaign();
        Account account1=new Account("playerUser1","Password1");
        Account account2=new Account("playerUser2","Password1");
        Account account3=new Account("playerUser3","Password1");
        Account account4=new Account("playerUser4","Password1");



        campaign.addUserPlayers("playerUser1", account1.userPlayer);
        campaign.addUserPlayers("playerUser2", account2.userPlayer);
        campaign.addUserPlayers("playerUser3", account3.userPlayer);
        campaign.addUserPlayers("playerUser4", account4.userPlayer);

        assertTrue(campaign.findUserPlayer("playerUser1"));
        assertTrue(campaign.findUserPlayer("playerUser2"));
        assertTrue(campaign.findUserPlayer("playerUser3"));
        assertTrue(campaign.findUserPlayer("playerUser4"));

        assertFalse(campaign.findUserPlayer("playerUser6"));//if player hasnt been added

        assertThrows(IllegalArgumentException.class, ()->campaign.addUserPlayers("playerUser1", account1.userPlayer));
    }
    @Test
    void findUserPlayerTest(){
        Campaign campaign=new Campaign();

        Account account1=new Account("playerUser1","Password1");
        Account account2=new Account("playerUser2","Password1");
        Account account3=new Account("playerUser3","Password1");
        Account account4=new Account("playerUser4","Password1");

        campaign.addUserPlayers("playerUser1", account1.userPlayer);
        campaign.addUserPlayers("playerUser2", account2.userPlayer);
        campaign.addUserPlayers("playerUser3", account3.userPlayer);
        campaign.addUserPlayers("playerUser4", account4.userPlayer);

        assertTrue(campaign.findUserPlayer("playerUser1"));
        assertTrue(campaign.findUserPlayer("playerUser2"));
        assertTrue(campaign.findUserPlayer("playerUser3"));
        assertTrue(campaign.findUserPlayer("playerUser4"));

        assertFalse(campaign.findUserPlayer("playerUser6"));
        assertFalse(campaign.findUserPlayer("playerUser7"));
    }

    @Test
    void addNotesTest(){
        Campaign campaign = new Campaign();

        campaign.addNotes("1", "abcd");
        assertThrows(IllegalArgumentException.class, ()->campaign.addNotes("1","no"));
        assertEquals("abcd\n", campaign.getNotes("1"));
        campaign.addNotes("2"," efgh");
        assertEquals(" efgh\n",campaign.getNotes("2"));
        campaign.addNotes("4","1234");
        assertEquals("1234\n", campaign.getNotes("4"));

        assertThrows(IllegalArgumentException.class, ()->campaign.getNotes("5"));
    }

    @Test
    void addToCurrNotesTest(){
        Campaign campaign = new Campaign();

        campaign.addNotes("1", "abcd");
        campaign.addToCurrNotes("1", "abcd");
        assertEquals("abcd\nabcd\n",campaign.getNotes("1"));
        assertThrows(IllegalArgumentException.class, ()->campaign.addToCurrNotes("2","no"));
        campaign.addNotes("2", "abcd");
        campaign.addToCurrNotes("2", "abcd");
        assertEquals("abcd\nabcd\n",campaign.getNotes("2"));


    }

}
