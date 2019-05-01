package edu.ithaca.gamemaster.uiTests;

import edu.ithaca.gamemaster.GameMasterAPI;
import edu.ithaca.gamemaster.user_interfaces.LegacyGameMasterUI;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class loginTest {
    @Test
    public void createAccountTest(){
        GameMasterAPI api = new GameMasterAPI();
        LegacyGameMasterUI ui = new LegacyGameMasterUI(api);
        assertEquals(true, ui.createAccount("milorue", "Milorue1"));
        assertThrows(IllegalArgumentException.class, ()->ui.createAccount("milorue", "Milorue1"));
    }
}
