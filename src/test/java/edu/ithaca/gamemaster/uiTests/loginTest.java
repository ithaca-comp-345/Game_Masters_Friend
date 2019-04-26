package edu.ithaca.gamemaster.uiTests;

import edu.ithaca.gamemaster.CharacterAPI;
import edu.ithaca.gamemaster.GameMasterAPI;
import edu.ithaca.gamemaster.user_interfaces.GameMasterUI;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class loginTest {
    @Test
    public void createAccountTest(){
        GameMasterAPI api = new GameMasterAPI();
        GameMasterUI ui = new GameMasterUI(api);
        assertEquals(true, ui.createAccount("milorue", "Milorue1"));
        assertThrows(IllegalArgumentException.class, ()->ui.createAccount("milorue", "Milorue1"));
    }
}
