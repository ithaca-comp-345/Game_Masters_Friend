package edu.ithaca.gamemaster;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Campaign{
    public String campaignName;
    public Location location;
    public Map<String,PlayerUser> userPlayers;
    public Map<String,Notes> notes;


    public Campaign(){
       this.notes = new HashMap<>();
       this.userPlayers=new HashMap<>();
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

    //  `public Location searchLocations(String name){ return location}



    public void addNotes(String noteName, String text){
        Notes note=new Notes(noteName,text);
        notes.put(noteName,note);
    }

    public String getNotes(String noteName){
        if(notes.containsKey(noteName)){
            return notes.get(noteName).getNotes();
        }
        throw new IllegalArgumentException("notes were not found");
    }



   // public void editNotes(){};


   // public void shareInformation(){};
   // public void createEncounter(){}
    // public void addNotes(String campaignName){};
    // public void editCharacter(){};
    // public void editLocation(){};
    // public void editNPC();
    // public void editMap();
    // public void searchNPC();
    // public void shareMap();


}

