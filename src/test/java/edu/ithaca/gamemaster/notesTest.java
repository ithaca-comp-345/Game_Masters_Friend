package edu.ithaca.gamemaster;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class notesTest {
    @Test
    void createNoteTest(){
        Notes testNote1 = new Notes("Foo");
        Notes testNote2 = new Notes("one");
        Notes testNote3 = new Notes("two");
        Notes testNote4 = new Notes("three");

        assertEquals("Foo",testNote1.getNoteName());
        assertEquals("one",testNote2.getNoteName());
        assertEquals("two",testNote3.getNoteName());
        assertEquals("three",testNote4.getNoteName());
    }


}
