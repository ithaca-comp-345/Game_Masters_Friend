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

    public CharacterAPI(Player player, Character character){
        this.player=player;
        this.character=character;
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

    public void printPlayerCharacter(){
        System.out.println("== Player Info ==");
        System.out.println("Name: " + player.getName());
        System.out.println("Class & Level: " + "Lvl " + player.getLevel() + " " + player.getCharClass());
        System.out.println("Background: " + player.getBackground());
        System.out.println("EXP: " + player.getExperience());
        System.out.println("Race: " + player.getRace());
        System.out.println("Alignment: " + player.getAlignment());
        System.out.println("STR: " + player.getStrength() + "\t" + "DEX: " + player.getDexterity() + "\t" + "CON: " + player.getConstitution() +
                "\t" + "INT: " + player.getIntelligence() +"\t" + "WIS: " + player.getWisdom() + "\t" + "CHA: " + player.getCharisma());
        System.out.println("Proficiency Bonus: " + player.getProficiencyBonus());
        System.out.println("Ability Mods: " + "STR: " + player.getStrenMod() + "\t" + "DEX: " + player.getDexteMod() + "\t" + "CON: " + player.getConstMod()
        + "\t" + "INT: " + player.getIntelMod() + "\t" + "WIS: " + player.getWisdoMod() + "\t" + "CHA: " +player.getChariMod());
    }

}
