package edu.ithaca.gamemaster;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class notesTest {

    Notes testNote = new Notes("Foo", "Bar");

    void createNoteTest(){

        assertEquals("Foo",testNote.getNoteName());
        assertEquals("Bar",testNote.getNotes());
    }
    void addToNotesTest(){
        testNote.addToNotes("raB");

    }
}
