package edu.ithaca.gamemaster.user_interfaces.clean_build;

import edu.ithaca.gamemaster.Account;
import edu.ithaca.gamemaster.NPC;
import edu.ithaca.gamemaster.Player;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class User {
    private String name;
    private Account linkedAccount;
    private Map<String, Player> characters;
    private Map<String, Campaign> joinedCampaigns;
    private Map<String, Campaign> createdCampaigns;
    private Map<String, NPC> npcs;
    public int campaignCount = 0;

    public User(String name, Account linkedAccount){
        this.linkedAccount = linkedAccount;
        this.name=name;

        this.characters = new HashMap<>();
        this.createdCampaigns = new HashMap<>();
        this.npcs = new HashMap<>();
    }

    //adds the character to the users list of completed characters
    public Player addCharacter(Player playerToAdd){

//        if(getCharacter(playerToAdd.getName()) != null){
//            characters.remove(playerToAdd.getName());
//            characters.put(playerToAdd.getName(), playerToAdd);
//            return playerToAdd;
//        }
        System.out.println(characters);
        characters.put(playerToAdd.getName(),playerToAdd);
        return playerToAdd;
    }

    public Campaign createCampaign(String campaignName){
        if(Pattern.matches("[a-zA-z0-9 ]+",campaignName)){
            Campaign createdCampaign = new Campaign(campaignName);
            createdCampaigns.put(campaignName, createdCampaign);
            campaignCount++;
            return createdCampaign;
        }
        else {
            throw new IllegalArgumentException("Illegal characters");
        }
    }

    public boolean deleteCampaign(String campaignName) throws FileNotFoundException{
        if(createdCampaigns.containsKey(campaignName)){
            createdCampaigns.remove(campaignName);
            campaignCount--;
            return true;
        }
        throw new FileNotFoundException("Campaign doesn't exist to delete");

    }

    public Player createCharacter(String name){
        Player newCharacter = new Player(name);
        characters.put(newCharacter.getName(),newCharacter);
        return newCharacter;
    }

    public NPC createNPC(String name){
        NPC newNPC = new NPC();
        newNPC.setName(name);
        npcs.put(name,newNPC);
        return newNPC;
    }

    public void addNPC(String name, NPC npc){
        npcs.put(name, npc);
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

    public ArrayList<Campaign> getCampaignListClean(){
        ArrayList<Campaign> campaignsArray = new ArrayList<>();
        for(Campaign val : createdCampaigns.values()){
            campaignsArray.add(val);
        }
        return campaignsArray;
    }
}
