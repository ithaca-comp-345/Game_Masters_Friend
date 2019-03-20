package edu.ithaca.gamemaster;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class notesTest {

    void createNoteTest(){

        Notes testNote = new Notes("Foo", "Bar");
        assertEquals("Foo",testNote.getNoteName());
        assertEquals("Bar",testNote.getNotes());
    }

}
