package edu.ithaca.gamemaster;

import edu.ithaca.gamemaster.Session;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class sessionTest {
    @Test
    void createSessionTest(){
        Account account = new Account("Milo Rue", "Comp345");
        GameMaster gameMaster = new GameMaster(account.getUsername(), account);
        Session newSession = new Session("Session 1", gameMaster,true);
        assertEquals("Session 1", newSession.getSessionName());
        assertEquals("Milo Rue", newSession.getGameMaster().getName());
    }
    @Test
    void startSessionTest(){
        Account account = new Account("Milo Rue", "Comp345");
        GameMaster gameMaster = new GameMaster(account.getUsername(), account);
        Session newSession = new Session("Session 1", gameMaster,true);
        assertTrue(newSession.start("Start our first session"));
        System.out.println(newSession.getTimeStart());
    }
    @Test
    void accomplishGoalTest(){
        Account account = new Account("Milo Rue", "Comp345");
        GameMaster gameMaster = new GameMaster(account.getUsername(), account);
        Session newSession = new Session("Session 1", gameMaster,true);
        assertTrue(newSession.completeGoal());
        assertTrue(newSession.isGoalAchieved());
    }
    @Test
    void addSinglePlayerTest(){
        Account account = new Account("Milo Rue", "Comp345");
        GameMaster gameMaster = new GameMaster(account.getUsername(), account);
        Session newSession = new Session("Session 1", gameMaster,true);
        assertTrue(newSession.addPlayertoSession("Billy Jones"));
        assertEquals("Billy Jones", newSession.getPlayers().get("Billy Jones").getName());
    }
    @Test
    void addPlayerListTest(){
        Account account = new Account("Milo Rue", "Comp345");
        GameMaster gameMaster = new GameMaster(account.getUsername(), account);
        Session newSession = new Session("Session 1", gameMaster,true);
        ArrayList<String> players = new ArrayList<>();
        players.add("Bob");
        players.add("Sam");
        players.add("James");
        assertTrue(newSession.addPlayerListtoSession(players));
        assertEquals("Sam", newSession.getPlayers().get("Sam").getName());
        assertEquals("Bob", newSession.getSpecificPlayer("Bob").getName());
    }
    @Test
    void getSpecificPlayerTest(){
        Account account = new Account("Milo Rue", "Comp345");
        GameMaster gameMaster = new GameMaster(account.getUsername(), account);
        Session newSession = new Session("Session 1", gameMaster,true);
        ArrayList<String> players = new ArrayList<>();
        players.add("Bob");
        players.add("Sam");
        players.add("James");
        assertTrue(newSession.addPlayerListtoSession(players));
        assertEquals("Bob", newSession.getSpecificPlayer("Bob").getName());
    }
    @Test
    void removePlayersTest(){
        Account account = new Account("Milo Rue", "Comp345");
        GameMaster gameMaster = new GameMaster(account.getUsername(), account);
        Session newSession = new Session("Session 1", gameMaster,true);
        ArrayList<String> players = new ArrayList<>();
        players.add("Bob");
        players.add("Sam");
        players.add("James");
        assertTrue(newSession.addPlayerListtoSession(players));
        assertTrue(newSession.removePlayerfromSession("Bob"));
        //checks for false flag up for an already deleted player
        assertFalse(newSession.removePlayerfromSession("Bob"));
        players.remove("Bob");
        assertTrue(newSession.removeMultiPlayers(players));
        //checks for false flag
        assertFalse(newSession.removeMultiPlayers(players));
    }


}
