package edu.ithaca.gamemaster;

import java.util.ArrayList;

public class CharacterAPI {

    public CharacterAPI(){

    }

    public Character createCharacter(String charName){
        Character character = new Character(charName);
        return character;
    }
    public void characterParams(Character character, int hitPts, int hitDice, int hitSide, int hitMod,
                                int armor, int speed, int strength, int dexterity,
                                int constitution, int intelligence, int wisdom, int charisma,
                                String alignment, ArrayList<String> languages, ArrayList<Action> actions
                                ){
        character.setHP(hitPts);
        character.setHitDice(hitDice,hitSide,hitMod);
        character.setArmor(armor);
        character.setSpeed(speed);
        character.setStrength(strength);
        character.setDexterity(dexterity);
        character.setConstitution(constitution);
        character.setIntelligence(intelligence);
        character.setWisdom(wisdom);
        character.setCharisma(charisma);
        character.setAlignment(alignment);
        character.setLanguages(languages);
        character.setActions(actions);
    }

}
