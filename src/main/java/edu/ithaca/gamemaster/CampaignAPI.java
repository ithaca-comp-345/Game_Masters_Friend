package edu.ithaca.gamemaster;

import edu.ithaca.gamemaster.map.Location;
import edu.ithaca.gamemaster.user_interfaces.Notes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CampaignAPI {
    private Campaign campaign;
    private GameMaster gm;
    private Map<String,PlayerUser> userPlayers;
    private Map<String, Notes> notes;
    private Map<String, Session> sessions;
    private Map<String, Character> characters;
    private Map<String, Location> locations;
    private Map<String, NPC> npcs;

    public CampaignAPI(Campaign campaign){
        this.campaign = campaign;
    }
    public CampaignAPI(Campaign campaign,GameMaster gm){
        this.gm = gm;
        campaign.setGm(this.gm);
        this.notes = new HashMap<>();
        this.userPlayers=new HashMap<>();
        this.sessions = new HashMap<>();
        this.locations = new HashMap<>();
        this.npcs = new HashMap<>();
    }
    public CampaignAPI(){
        this.notes = new HashMap<>();
        this.userPlayers=new HashMap<>();
        this.sessions = new HashMap<>();
        this.locations = new HashMap<>();
        this.npcs = new HashMap<>();
    }

    public Campaign createCampaign(GameMaster gm){
        Campaign campaign = new Campaign(gm);
        return campaign;
    }
    public void addUserPlayer(PlayerUser player, String username){
        campaign.addUserPlayers(username,player);
    }

    public Location addLocation(String locationName, String imagePath){
        Location location = new Location("image.jpg", locationName);
        locations.put(locationName, location);
        return location;
    }

    public Character addCharacter(String name, int hitPts, int hitDice, int hitSide, int hitMod,
                                  int armor, int speed, int strength, int dexterity,
                                  int constitution, int intelligence, int wisdom, int charisma,
                                  String alignment, ArrayList<String> languages, ArrayList<Action> actions){
        Character newCharacter = new Character(name, hitPts, hitDice, hitSide, hitMod, armor, speed, strength, dexterity, constitution, intelligence, wisdom, charisma, alignment, languages,actions);
        characters.put(name, newCharacter);
        campaign.addCharacter(name, newCharacter);
        return newCharacter;
    }








}
