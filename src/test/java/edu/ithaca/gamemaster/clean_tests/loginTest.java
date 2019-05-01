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
        login.createAccount("miloruee", "Password123");
        assertEquals("miloruee", login.getAccount("miloruee").getUsername());
        assertEquals("Password123", login.getAccount("miloruee").getPassword());
    }

    @Test
    void loginAccTest() throws FileAlreadyExistsException, FileNotFoundException{
        Login login = new Login();
        login.createAccount("milorue", "asdfA1");
        Account test =login.login("milorue", "asdfA1");
        assertEquals("milorue", test.getUsername());
        assertEquals("asdfA1", test.getPassword());

    }


}
