package edu.ithaca.gamemaster.user_interfaces.clean_build;

import edu.ithaca.gamemaster.Account;
import edu.ithaca.gamemaster.Player;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

public class User {
    private String name;
    private Account linkedAccount;
    private Map<String, Player> characters;
    private Map<String, Campaign> joinedCampaigns;
    private Map<String, Campaign> createdCampaigns;
    private boolean isAdmin = false;
    public User(String name, boolean isAdmin, Account linkedAccount){
        this.linkedAccount = linkedAccount;
        this.name=name;
        this.isAdmin=isAdmin;

        this.characters = new HashMap<>();
    }

    //adds the character to the users list of completed characters
    public Player addCharacter(Player playerToAdd){
        characters.put(playerToAdd.getName(),playerToAdd);
        return playerToAdd;
    }

    public Campaign createCampaign(String campaignName){
        Campaign createdCampaign = new Campaign(campaignName);
        return createdCampaign;
    }

    public Player createCharacter(String name){
        Player newCharacter = new Player(name);
        characters.put(newCharacter.getName(),newCharacter);
        return newCharacter;
    }

    //Character methods

    public Player editCharacterName(String characterName, String newName){
        Player edit = characters.get(characterName);
        edit.setName(newName);
        return edit;
    }

    public Player editCharacterStr(String characterName, int newStr){
        Player edit = characters.get(characterName);
        edit.setStrength(newStr);
        return edit;
    }

    public Player editCharacterDext(String characterName, int newDex){
        Player edit = characters.get(characterName);
        edit.setDexterity(newDex);
        return edit;
    }

    public Player editCharacterConst(String characterName, int newConst){
        Player edit = characters.get(characterName);
        edit.setConstitution(newConst);
        return edit;
    }

    public Player editCharacterIntel(String characterName, int newIntel){
        Player edit = characters.get(characterName);
        edit.setIntelligence(newIntel);
        return edit;
    }

    public Player editCharacterWisdom(String characterName, int newWis){
        Player edit = characters.get(characterName);
        edit.setWisdom(newWis);
        return edit;
    }

    public Player editCharacterCharisma(String characterName, int newChar){
        Player edit = characters.get(characterName);
        edit.setCharisma(newChar);
        return edit;
    }

    //getters

    public String getName(){
        return name;
    }

    public Player getCharacter(String characterName){
        Player got = characters.get(characterName);
        return got;
    }

    public Account getLinkedAccount(){
        return linkedAccount;
    }
    public Map getJoinedCampaigns(){
        return joinedCampaigns;
    }
    public Map getCreatedCampaigns(){
        return createdCampaigns;
    }

    public Campaign getAJoinedCampaign(String campaignName) throws FileNotFoundException {
        if(!joinedCampaigns.containsKey(campaignName)){
            throw new FileNotFoundException("Campaign doesn't exist or isn't joined already");
        }
        else{
            return joinedCampaigns.get(campaignName);
        }
    }

    public Campaign getACreatedCampaign(String campaignName) throws FileNotFoundException{
        if(!createdCampaigns.containsKey(campaignName)){
            throw new FileNotFoundException("Campaign doesn't exists or wasn't created properly");
        }
        else{
            return createdCampaigns.get(campaignName);
        }
    }
}