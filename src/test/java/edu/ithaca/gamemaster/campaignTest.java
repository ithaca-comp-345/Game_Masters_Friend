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
    void findUserPlayer(){
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

}
