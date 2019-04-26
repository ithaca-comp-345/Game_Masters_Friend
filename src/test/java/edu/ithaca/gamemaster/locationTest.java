package edu.ithaca.gamemaster;

import edu.ithaca.gamemaster.map.Location;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class locationTest {
    @Test
    void isPathValidTest(){
        assertFalse(Location.isPathValid("none"));
        assertFalse(Location.isPathValid(""));
        //assertTrue(Location.isPathValid("/Users/teamdevadze/IdeaProjects/Game_Masters_Friend/src/main/java/edu/ithaca/gamemaster/map/image.jpg"));
    }
    @Test
    void constructorTest(){
        assertThrows(IllegalArgumentException.class, ()-> new Location("none","name1"));
        assertThrows(IllegalArgumentException.class, ()-> new Location("none","name1"));
    }
}
