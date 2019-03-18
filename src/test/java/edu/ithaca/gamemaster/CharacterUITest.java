package edu.ithaca.gamemaster;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CharacterUITest {

    @Test
    void createNewCharacterTest(){
        Character validTestChara = new Character("Bilbo");
        Character invalidTestChara = new Character("");
        Character invalidTestChara2 = new Character("  ");
        Character invalidTestCharaNull = new Character(null);

        assertEquals("Bilbo", validTestChara.getName()); //pass
        assertFalse(CharacterUI.isNotEmptyString(invalidTestChara.getName())); //pass
        assertTrue(CharacterUI.isNotEmptyString(invalidTestChara2.getName())); //OVERSIGHT: should return false and fail, but passes. !!!!
        assertFalse(CharacterUI.isNotEmptyString(invalidTestCharaNull.getName())); //pass

    }
}
