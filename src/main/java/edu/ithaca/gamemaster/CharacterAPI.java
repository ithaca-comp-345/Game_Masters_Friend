package edu.ithaca.gamemaster;

import java.util.ArrayList;

public class CharacterAPI {
    private Character character;
    private Player player;

    public CharacterAPI(Character character){
        this.character=character;
    }
    public CharacterAPI(Player player){
        this.player=player;
    }

    public Character createCharacter(String charName){
        Character character = new Character(charName);
        return character;
    }
    public void characterParams(int hitPts, int hitDice, int hitSide, int hitMod,
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

    public void printCharacter(){
        System.out.println("== Character Info ==");
        System.out.println("Name: " + character.getName());
        System.out.println("Alignment: " + character.getAlignment());
        System.out.println("Armor Class: " + character.getArmor());
        System.out.println("Speed: " + character.getSpeed());
        System.out.println("HP: " + character.getHP() + "(" + character.getHitDice() + ")");

        System.out.println("STR: " + character.getStrength() + "\t" + "DEX: " + character.getDexterity() + "\t" + "CON: " + character.getConstitution() +
                "\t" + "INT: " + character.getIntelligence() +"\t" + "WIS: " + character.getWisdom() + "\t" + "CHA: " + character.getCharisma());

        System.out.println("Languages: " + character.getLanguages());
        System.out.println("Actions: " + character.getActions());

    }

    public void printPlayerCharacter(Player player){
        //TODO
    }

}
