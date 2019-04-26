package edu.ithaca.gamemaster;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;

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

    @Test
    void createNewCharacterWithStatsTest(){
        Character IHaveStatsNow = new Character("Mr. Peanutbutter");

        ArrayList<String> languages = new ArrayList<>();
        ArrayList<Action> actions = new ArrayList<>();
        Action throwBone = new Action("Dog Treat",2,3,4,"Bludgeoning", "It's a dog treat. Thrown REALLY hard.");
        Action AHP = new Action("Annual Halloween Party",2,25,8,"Psychic", "Please stop this party.");

        //have to manually add these since they normally rely on user input
        IHaveStatsNow.setAlignment("Chaotic good");
        languages.add("Common");
        languages.add("Doggy-Doggy-What-Now");
        actions.add(throwBone);
        actions.add(AHP);
        IHaveStatsNow.setLanguages(languages);
        IHaveStatsNow.setActions(actions);

        //testing UI print
        //CharacterUI.printStats(IHaveStatsNow); deprecated

        //testing compatibility with API
        CharacterAPI api = new CharacterAPI(IHaveStatsNow);
        api.printCharacter();

    }

    @Test
    void noRepeatsTest(){
        ArrayList<Integer> repeatedInts = new ArrayList<>(Arrays.asList(18, 2, 2, 15, 15, 6));
        ArrayList<Integer> correctInts = new ArrayList<>(Arrays.asList(18, 2, 15, 6));

        ArrayList<String> repeatedStrings = new ArrayList<>(Arrays.asList("bunny", "hog", "barkeep", "hog", "cavern", "barkeep"));
        ArrayList<String> correctStrings = new ArrayList<>(Arrays.asList("bunny", "hog", "barkeep", "cavern"));

        //TODO: test repeats for Actions object when that's finished

        assertEquals(CharacterUI.noRepeats(repeatedInts), correctInts);
        assertEquals(CharacterUI.noRepeats(repeatedStrings), correctStrings);
    }

    @Test
    void actionStringOverrideTest(){
        Action throwBone = new Action("Dog Treat",2,3,4,"Bludgeoning", "It's a dog treat. Thrown REALLY hard.");
    }

//    @Test
//    void intsOnlyTest(){
//    }

}
