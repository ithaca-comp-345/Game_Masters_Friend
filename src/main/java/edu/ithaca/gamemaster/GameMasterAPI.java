package edu.ithaca.gamemaster;
import edu.ithaca.gamemaster.map.Location;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class GameMasterAPI {
    private String name;
    private Map<String, Campaign> campaignList;
    private Map<String, Location> locationsList;
    private Map<String, NPC> npcList;
    private Map<String, Character> characterList;


    public GameMasterAPI(){
        this.campaignList = new HashMap<>();
        this.locationsList = new HashMap<>();
        this.npcList = new HashMap<>();
        this.characterList = new HashMap<>();
    };

    public Campaign createCampaign(String campaignName){
        Campaign campaign=new Campaign();
        campaignList.put(campaignName,campaign);
        return campaign;
    }

    public Location createLocation(String locationName, String campaignName, String imagePath){
        Location location = new Location("image.jpg", locationName);
        locationsList.put(locationName, location);
        campaignList.get(campaignName).addLocation(locationName,imagePath);
        return location;
    }

    public NPC createNPC(String npcName, String campaignName){
        NPC npc = new NPC();
        npc.setName(npcName);
        npcList.put(npcName,npc);
        campaignList.get(campaignName).addNPC(npcName,npc);
        return npc;
    }

    public void createMap(){
        //TODO idk how map works
    }

    public Character createCharacter(String charName, String campaignName){
        Character character = new Character();
        characterList.put(charName,character);
        campaignList.get(campaignName).addCharacter(charName, character);
        return character;
    }

    public void createEncounter(String encounterName){
        //TODO needs encounter to be implemented
    }

    public Character editCharacter(String characterName){
        Character edit = characterList.get(characterName);
        return edit;
    }

    public Location editLocation(String locationName){
        Location editLocation = locationsList.get(locationName);
        return editLocation;
    }
    // public void shareInformation(String campaignName){};
    // public void createEncounter(String campaignName){};
    // public void addNotes(String campaignName){};
    // public void editCharacter(){};
    // public void editLocation(){};
    // public void editNPC();
    // public void editMap();
    // public void searchNPC();
    // public void shareMap();

    public Campaign getCampaign(String campaignName){
        if(campaignList.containsKey(campaignName)){
            return campaignList.get(campaignName);
        }
        else{
            throw new IllegalArgumentException("Campaign doesn't exist");
        }
    }

    public Location getLocation(String locationName){
        if(locationsList.containsKey(locationName)){
            return locationsList.get(locationName);
        }
        else{
            throw new IllegalArgumentException("Location doesn't exist");
        }
    }





}