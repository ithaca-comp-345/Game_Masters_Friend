package edu.ithaca.gamemaster;

import org.junit.jupiter.api.Test;

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
//    @Test
//    void addSinglePlayerTest(){
//        Account account = new Account("Milo Rue", "Comp345");
//        GameMaster gameMaster = new GameMaster(account.getUsername(), account);
//        Session newSession = new Session("Session 1", gameMaster,true);
//        assertTrue(newSession.addPlayertoSession("Billy Jones"));
//    }


}
