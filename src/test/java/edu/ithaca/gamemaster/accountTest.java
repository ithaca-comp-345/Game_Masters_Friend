package edu.ithaca.gamemaster;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class accountTest {

    @Test
    void constructorTest(){
        Account acc1= new Account("teatea", "Aaaaa1");


        assertEquals("teatea",acc1.getUsername());
        assertEquals("Aaaaa1",acc1.getPassword());


        assertThrows(IllegalArgumentException.class, ()-> new Account("teat", "Password1"));//username length<6
        assertThrows(IllegalArgumentException.class, ()-> new Account("teatea", "12345"));//for password length<6
        assertThrows(IllegalArgumentException.class, ()-> new Account("teatea", "AAAAAA11"));//no lower case
        assertThrows(IllegalArgumentException.class, ()-> new Account("teatea", "aaaaaa11"));//no uppercase
        assertThrows(IllegalArgumentException.class, ()-> new Account("teatea", "Password"));//no digit
    }

    @Test
    void isPsswdValid(){
        assertTrue(Account.isPsswdValid("Password1"));
        assertTrue(Account.isPsswdValid("Password123"));
        assertTrue(Account.isPsswdValid("paSSword1"));

        assertFalse(Account.isPsswdValid("12345"));
        assertFalse(Account.isPsswdValid("AAAAAA11"));
        assertFalse(Account.isPsswdValid("aaaaaa11"));
        assertFalse(Account.isPsswdValid("Password"));
    }


}