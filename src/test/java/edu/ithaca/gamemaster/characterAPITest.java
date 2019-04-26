package edu.ithaca.gamemaster;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class characterAPITest {
    @Test
    public void charApiTest(){
        ArrayList<String> languages = new ArrayList<>();
        ArrayList<Action> actions = new ArrayList<>();
        languages.add("Orcish");
        languages.add("Elvish");
        languages.add("Binary");
        languages.add("Assembly");
        Action fireball = new Action("Fireball",5,1,8,"Fire", "testdesc");
        actions.add(fireball);

        Character example = new Character("Will Robinson",15,2,6,5,14,30,"Chaotic Neutral",languages,actions);
        CharacterAPI api = new CharacterAPI(example);
        api.printCharacter();

        Player example1 = new Player(example);
        ArrayList<String> savingThrows = new ArrayList<>();
        savingThrows.add("Strength");
        savingThrows.add("Dexterity");
        ArrayList<String> skills = new ArrayList<>();
        skills.add("Arcana");
        skills.add("Animal Handling");
        example1.setSavingThrows(savingThrows);
        example1.setSkills(skills);
        example1.generateSkills();
        example1.generateThrows();
        CharacterAPI apiNew = new CharacterAPI(example1);
        System.out.println("");
        apiNew.printPlayerCharacter();

    }
}
