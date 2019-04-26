package edu.ithaca.gamemaster.clean_build;

import edu.ithaca.gamemaster.Account;
import edu.ithaca.gamemaster.Player;

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

    public Player addCharacter(Player playerToAdd){
        characters.put(playerToAdd.getName(),playerToAdd);
        return playerToAdd;
    }

    public Campaign createCampaign(String campaignName){
        Campaign createdCampaign = new Campaign(campaignName);
        return createdCampaign;
    }

    public String getName(){
        return name;
    }
}
