package edu.ithaca.gamemaster;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Campaign{

    public String campaignName;
    //public Location location;
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



    public void addNotes(String noteName){
        if(!notes.containsKey(noteName)){
            Notes note=new Notes(noteName);
            notes.put(noteName,note);
        }
        else {
            throw new IllegalArgumentException("notes with the same name already exist");
        }
    }

    public String getNotes(String noteName){
        if(notes.containsKey(noteName)){
            return notes.get(noteName).getNotes();
        }
        throw new IllegalArgumentException("notes were not found");
    }

    public void addToCurrNotes(String noteName){
        if(notes.containsKey(noteName)){
            new NoteEditor(notes.get(noteName)).display();
        }
        else{
            throw new IllegalArgumentException("notes were not found");
        }
    }

    public void deleteCurrNotes(String noteName){
        if(notes.containsKey(noteName)){
            notes.remove(noteName);
        }
        else{
            throw new IllegalArgumentException("notes were not found");
        }

    }


    public boolean isNotes(String noteName){
        if (notes.containsKey(noteName)) {
            return true;
        }
        else{
            return false;
        }
    }

    public String shareInformation(String noteName){
        return notes.get(noteName).getNotes();
    }







   // public void createEncounter(){}
    // public void editCharacter(){};
    // public void editLocation(){};
    // public void editNPC();
    // public void editMap();
    // public void searchNPC();
    // public void shareMap();


}

