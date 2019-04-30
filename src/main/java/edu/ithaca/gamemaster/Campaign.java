package edu.ithaca.gamemaster;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import edu.ithaca.gamemaster.map.Location;

public class Campaign{

    public String campaignName;
    //public Location location;
    private Map<String,PlayerUser> userPlayers;
    private Map<String,Notes> notes;
    private Map<String, Session> sessions;
    private Map<String, Character> characters;
    private GameMaster gm;
    private Map<String, Location> locations;


    public Campaign(){
       this.notes = new HashMap<>();
       this.userPlayers=new HashMap<>();
       this.sessions = new HashMap<>();
       this.locations = new HashMap<>();

    }
    public Campaign(GameMaster gameMaster){
        this.notes = new HashMap<>();
        this.userPlayers=new HashMap<>();
        this.sessions = new HashMap<>();
        this.locations = new HashMap<>();
        this.gm = gameMaster;

    }

    public void setGm(GameMaster gameMaster){
        this.gm = gameMaster;
    }


    public void addUserPlayers(String username, PlayerUser playerUser){
        if(!findUserPlayer(username)){
            userPlayers.put(username, playerUser);
        }
        else {
            throw new IllegalArgumentException("user has already been added");

        }
    }

    public void addCharacter(String name,int hitPts, int hitDice, int hitSide, int hitMod,
                             int armor, int speed, int strength, int dexterity,
                             int constitution, int intelligence, int wisdom, int charisma,
                             String alignment, ArrayList<String> languages, ArrayList<Action> actions){
        if(!characters.containsKey(name)){
            Character newCharacter = new Character(name, hitPts, hitDice, hitSide, hitMod, armor, speed, strength, dexterity, constitution, intelligence, wisdom, charisma, alignment, languages,actions);
            characters.put(name, newCharacter);
        }
        else {
            throw new IllegalArgumentException("character already exists");
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

    public void addSession(String sessionName){
        if(!sessions.containsKey(sessionName)){
            sessions.put(sessionName, new Session(sessionName, gm, true));
        }
        else{
            throw new IllegalArgumentException("session already exists");
        }
    }

    public boolean isLocationInList(String locationName){
        if(locations.containsKey(locationName)){
            return true;
        }
        else{
            return false;
        }
    }



   public Location searchLocations(String locationName){
        if(locations.containsKey(locationName)){
            return locations.get(locationName);
        }
        else {
            throw new IllegalArgumentException("Location doesn't exist");
        }
    }



    public void addNotes(String sessionName){
        if(!notes.containsKey(sessionName)){
            Notes note=new Notes(sessionName);
            notes.put(sessionName,note);
        }
        else {
            throw new IllegalArgumentException("notes with the same name already exist");
        }
    }

    public String getNotes(String sessionName){
        if(notes.containsKey(sessionName)){
            return notes.get(sessionName).getNotes();
        }
        throw new IllegalArgumentException("notes were not found");
    }

    public void addToCurrNotes(String sessionName){
        if(notes.containsKey(sessionName)){
            new NoteEditor(notes.get(sessionName)).setVisible(true);
        }
        else{
            throw new IllegalArgumentException("notes were not found");
        }
    }

    public void deleteCurrNotes(String sessionName){
        if(notes.containsKey(sessionName)){
            notes.remove(sessionName);
        }
        else{
            throw new IllegalArgumentException("notes were not found");
        }

    }
    public void addLocation(String locationName, String locationPath){
        if(!locations.containsKey(locationName)){
            Location newLocation = new Location(locationName, locationPath);
            locations.put(locationName,newLocation);
        }
        else {
            throw new IllegalArgumentException("location already exists");
        }

    }


    public boolean isNotes(String sessionName){
        if (notes.containsKey(sessionName)) {
            return true;
        }
        else{
            return false;
        }
    }

    public String shareInformation(String sessionName){
        return notes.get(sessionName).getNotes();
    }


}

