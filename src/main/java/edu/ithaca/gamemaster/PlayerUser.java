package edu.ithaca.gamemaster;

import javax.management.openmbean.KeyAlreadyExistsException;
import java.util.Map;

public class PlayerUser{
    private String name;
    private Map<String, Player> characters;
    public PlayerUser(String name){
        this.name=name;
    }

    public void addCharacter(String characterTag, Player character){ //make sure you hand it a playerCharacter not just a default character
        characters.put(characterTag,character);
    }

    public Character getPlayerCharacter(String characterTag){
        if(characters.containsKey(characterTag)){
            return characters.get(characterTag);
        }
        else{
            throw new IllegalArgumentException("Character tag doesn't exist in this user");
        }
    }

    public String getName(){
        return name;
    }
}
