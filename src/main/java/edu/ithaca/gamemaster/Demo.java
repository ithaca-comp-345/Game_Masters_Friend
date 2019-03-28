package edu.ithaca.gamemaster;

import java.util.ArrayList;

public class Demo {

    public Demo() {
        //Initialize
    }

    public void runDemo() {
        Campaign campaign = new Campaign();

        ArrayList<String> languages = new ArrayList<String>();
        languages.add("English");

        Action action1 = new Action("Infinity Gauntlet");
        Action action2 = new Action("Killer Dance Moves");

        ArrayList<Action> actions = new ArrayList<Action>();
        actions.add(action1);
        actions.add(action2);


        Character character = new Character("Thanos", 80, 1, 6, 30, 30, 30, "Lawful Evil", languages, actions);
        CharacterAPI API = new CharacterAPI(character);
    }
}

//public static void main(String[] args) {
//
//}
