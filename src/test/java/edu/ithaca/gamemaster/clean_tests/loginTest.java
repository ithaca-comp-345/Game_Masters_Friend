package edu.ithaca.gamemaster.clean_tests;

import edu.ithaca.gamemaster.Account;
import edu.ithaca.gamemaster.user_interfaces.clean_build.Login;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;

public class loginTest {

    @Test
    void createAccTest() throws FileAlreadyExistsException, FileNotFoundException {
        Login login = new Login();
        login.createAccount("milorue", "password123");
        assertEquals("milorue", login.getAccount("milorue").getUsername());
        assertEquals("password123", login.getAccount("milorue").getPassword());
    }

    @Test
    void loginAccTest() throws FileAlreadyExistsException, FileNotFoundException{
        Login login = new Login();
        login.createAccount("mrue", "asdf");
        Account test =login.login("mrue", "asdf");
        assertEquals("mrue", test.getUsername());
        assertEquals("asdf", test.getPassword());

    }


}
