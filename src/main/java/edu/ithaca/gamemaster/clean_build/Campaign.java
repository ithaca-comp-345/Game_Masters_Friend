package edu.ithaca.gamemaster.clean_build;

import edu.ithaca.gamemaster.NPC;
import edu.ithaca.gamemaster.Player;

import java.nio.file.FileAlreadyExistsException;
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

    public void invitePlayer(User invited) throws FileAlreadyExistsException{
        if(players.containsKey(invited.getName())){
            throw new FileAlreadyExistsException("Player has already been invited");
        }
        else{
            players.put(invited.getName(),invited);
        }
    }

    public void createPlayerChar(User player){
        //TODO
    }
}
