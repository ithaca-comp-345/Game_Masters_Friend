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

        campaign.addNotes("1");
       assertThrows(IllegalArgumentException.class, ()->campaign.addNotes("1"));
        assertTrue(campaign.isNotes("1"));
        assertEquals(null, campaign.getNotes("1"));
        campaign.addNotes("2");
        assertThrows(IllegalArgumentException.class, ()->campaign.addNotes("2"));
        assertTrue(campaign.isNotes("2"));
        assertEquals(null, campaign.getNotes("2"));
        campaign.addNotes("3");
        assertThrows(IllegalArgumentException.class, ()->campaign.addNotes("3"));
        assertTrue(campaign.isNotes("3"));
        assertEquals(null, campaign.getNotes("3"));
        campaign.addNotes("4");
        assertThrows(IllegalArgumentException.class, ()->campaign.addNotes("4"));
        assertTrue(campaign.isNotes("4"));
        assertEquals(null, campaign.getNotes("4"));

        assertFalse(campaign.isNotes("5"));
    }
//
//   @Test
//    void addToCurrNotesTest(){
//        Campaign campaign = new Campaign();
//
//        campaign.addNotes("1");
//        campaign.addToCurrNotes("1");
//        System.out.println(campaign.getNotes("1"));
//
//       campaign.addNotes("2");
//       campaign.addToCurrNotes("2");
//       System.out.println(campaign.getNotes("2"));
//    }

    @Test
    void deleteCurrNoteTest(){
        Campaign campaign = new Campaign();

        campaign.addNotes("1");
        assertTrue(campaign.isNotes("1"));
        campaign.addNotes("2");
        assertTrue(campaign.isNotes("2"));
        campaign.addNotes("3");
        assertTrue(campaign.isNotes("3"));
        campaign.addNotes("4");
        assertTrue(campaign.isNotes("4"));

        campaign.deleteCurrNotes("4");
        assertFalse(campaign.isNotes("4"));
        campaign.deleteCurrNotes("3");
        assertFalse(campaign.isNotes("3"));
        campaign.deleteCurrNotes("2");
        assertFalse(campaign.isNotes("2"));
        campaign.deleteCurrNotes("1");
        assertFalse(campaign.isNotes("1"));

        assertThrows(IllegalArgumentException.class, ()->campaign.deleteCurrNotes("1"));
    }

//    @Test
//    void shareInformationTest(){
//        Campaign campaign =  new Campaign();
//
//        campaign.addNotes("1");
//        campaign.addNotes("2");
//        campaign.addNotes("3");
//        campaign.addNotes("4");
//
//        campaign.addToCurrNotes("1");
//        campaign.addToCurrNotes("2");
//        campaign.addToCurrNotes("3");
//    }

    @Test
    void searchLocationsTest(){
        Campaign campaign = new Campaign();





    }

}
