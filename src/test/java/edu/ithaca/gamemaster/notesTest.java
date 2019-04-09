package edu.ithaca.gamemaster;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class notesTest {


    @Test
    void createNoteTest(){
        Notes testNote1 = new Notes("Foo", "Bar");
        Notes testNote2 = new Notes("one", "");
        Notes testNote3 = new Notes("two", " ");
        Notes testNote4 = new Notes("three", "\n");

        assertEquals("Foo",testNote1.getNoteName());
        assertEquals("Bar",testNote1.getNotes());

        assertEquals("one",testNote2.getNoteName());
        assertEquals("",testNote2.getNotes());
        assertEquals("two",testNote3.getNoteName());
        assertEquals(" ",testNote3.getNotes());
        assertEquals("three",testNote4.getNoteName());
        assertEquals("\n",testNote4.getNotes());

        assertThrows(IllegalArgumentException.class, ()-> new Notes("Foo", "lol"));
    }

    @Test
    void editNotesTest(){
        Notes testNote1 = new Notes("Foo", "Bar");

        testNote1.editNotes("");
        assertEquals("", testNote1); //everything is deleted
        testNote1.editNotes("Foo"); //"Foo" is entered
        assertEquals("Foo",testNote1);

        testNote1.editNotes("Foo Foo"); //"Foo" is entered
        assertEquals("Foo Foo",testNote1);


    }
}
