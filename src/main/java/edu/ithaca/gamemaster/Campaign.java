package edu.ithaca.gamemaster;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Campaign{

    public String campaignName;
    //public Location location;
    public Map<String,PlayerUser> userPlayers;


    public Campaign(){
        userPlayers=new HashMap<>();
    }

    public void addUserPlayers(String username, PlayerUser playerUser){
        if(!findUserPlayer(username)){
            userPlayers.put(username, playerUser);
        }
        else {
            throw new IllegalArgumentException("user has already been added");

        }
    }

    public boolean findUserPlayer(String username){
        if(!userPlayers.containsKey(username)){
            return false;
        }
        else{
            return true;
        }
    }

   // public void shareInformation(){};
   // public void createEncounter(){};
   // public void addNotes(){};



}

