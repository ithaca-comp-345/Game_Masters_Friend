package edu.ithaca.gamemaster;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class usersTest {

    @Test
    void createAccount(){
        Users users=new Users();

        users.createAccount("teatea1","Password1");
        users.createAccount("teatea2","Password1");
        users.createAccount("teatea3","Password1");
        users.createAccount("teatea4","Password1");

        assertTrue(users.findUser("teatea1"));
        assertTrue(users.findUser("teatea2"));
        assertTrue(users.findUser("teatea3"));
        assertTrue(users.findUser("teatea4"));

        assertThrows(IllegalArgumentException.class,()->users.createAccount("tea","Password1"));//username length<3
        assertThrows(IllegalArgumentException.class, ()->users.createAccount("teatea1","Password1"));//username already exists
        assertThrows(IllegalArgumentException.class,()->users.createAccount("teatea6","Password"));//no digit in passwd
        assertThrows(IllegalArgumentException.class,()->users.createAccount("teatea6","PASSWORD2"));//no lowercase
        assertThrows(IllegalArgumentException.class,()->users.createAccount("teatea6","password2"));//no uppercase

    }

    @Test
    void logIn(){
        Users users = new Users();

        users.createAccount("teatea1","Password1");
        users.createAccount("teatea2","Password1");
        users.createAccount("teatea3","Password1");
        users.createAccount("teatea4","Password1");

        assertTrue(users.logIn("teatea1","Password1"));
        assertTrue(users.logIn("teatea2","Password1"));
        assertTrue(users.logIn("teatea3","Password1"));
        assertTrue(users.logIn("teatea4","Password1"));

        assertFalse(users.logIn("noneee","Password1"));//user is not registered
        assertFalse(users.logIn("teatea1","wrongPass2"));//wrong password
    }

    @Test
    void findUser(){
        Users users = new Users();

        users.createAccount("teatea1","Password1");
        users.createAccount("teatea2","Password1");
        users.createAccount("teatea3","Password1");
        users.createAccount("teatea4","Password1");

        assertTrue(users.findUser("teatea1"));

        assertFalse(users.findUser("teatea5"));

    }

}
