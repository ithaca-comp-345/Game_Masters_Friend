package edu.ithaca.gamemaster.clean_build;

import edu.ithaca.gamemaster.NPC;
import edu.ithaca.gamemaster.Player;

import java.util.HashMap;
import java.util.Map;

public class Campaign {
    private String campaignName;

    private Map<String, Player> characterList;
    private Map<String, User> players;
    private Map<String, Location> locations;
    private Map<String, NPC> npcsList;

    public Campaign(String campaignName){
        this.campaignName = campaignName;

        this.characterList= new HashMap<>();
        this.players=new HashMap<>();
        this.locations=new HashMap<>();
        this.npcsList=new HashMap<>();
    }
}
