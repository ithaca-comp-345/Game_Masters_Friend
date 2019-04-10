package edu.ithaca.gamemaster;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Session {
    private String sessionName;
    private GameMaster gameMaster;
    private Map<String, PlayerUser> players = new HashMap<>();
    private String timeStart;
    private String timeEnd;
    private String goal;
    private boolean isFirst;
    private boolean isActive = false;
    private boolean goalAchieved;

    public Session(String name, GameMaster gameMaster, boolean firstSession){
        this.sessionName=name;
        this.gameMaster=gameMaster;
        this.players=players;
        this.isFirst=firstSession;
    }

    public boolean start(String goal){
        if(goalAchieved){
            //session already fulfilled
            return false;
        }
        this.timeStart=currTime();
        this.isActive=true;
        this.goalAchieved=false;
        this.goal=goal;

        if(goal!=null && isActive){
            return true;
        }
        return false;

    }

    public boolean addPlayertoSession(String playerName){
        //creates a new playerUser
        PlayerUser newPlayer = new PlayerUser(playerName);
        players.put(playerName,newPlayer);
        if(players.containsKey(playerName)){
            return true;
        }
        return false;
    }

    public boolean addPlayerListtoSession(ArrayList<String> playersNames){
        //creates new players users
        for(int i = 0; i<playersNames.size(); i++){
            PlayerUser newPlayer = new PlayerUser(playersNames.get(i));
            players.put(playersNames.get(i),newPlayer);
            if(players.containsKey(playersNames.get(i))==false){
                return false;
            }
        }
        return true;
    }

    public boolean removePlayerfromSession(String playerName){
        if(players.containsKey(playerName)){
            players.remove(playerName);
            return true;
        }
        //no player was removed so false
        return false;

    }

    public boolean removeMultiPlayers(ArrayList<String> playersNames){
        for(int i = 0 ; i<playersNames.size(); i++){
            if(players.containsKey(playersNames.get(i))){
                players.remove(playersNames.get(i));
            }
            else{
                return false;
            }
        }
        return true;
    }

    public boolean createCharacterObj(String player, Player character){
        players.get(player).addCharacter(character.getName(),character);
        if(players.get(player).getPlayerCharacter(character.getName())
                .getName()==character.getName()){
            return true;
        }
        return false;
    }

    public boolean createCharacterRaw(String player){
        //TODO
        //needs to have raw character data in a ui context
        return false;
    }

    public boolean end(){
        this.timeEnd=currTime();
        if(goalAchieved){
            this.isActive=false;
            return true;
        }

        return false;
    }

    public boolean completeGoal(){
        this.goalAchieved=true;
        return true;
    }

    public boolean runEncounter(boolean wholeGroup, int amtOfPlayers){
        if(wholeGroup){
            //creates encounter for entire group
        }
        else{
            //creates encounter for amtOfPlayers
        }

        return true;
    }

    //Other methods underway

    private String currTime(){
        DateFormat format = new SimpleDateFormat("yyyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        String dateStr = format.format(date);
        return dateStr;
    }

    public PlayerUser getSpecificPlayer(String name){
        if(players.containsKey(name)){
            return players.get(name);
        }
        return null;
    }

    public String getSessionName() {
        return sessionName;
    }

    public GameMaster getGameMaster() {
        return gameMaster;
    }

    public Map<String, PlayerUser> getPlayers() {
        return players;
    }

    public String getTimeStart() {
        return timeStart;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public String getGoal() {
        return goal;
    }

    public boolean isFirst() {
        return isFirst;
    }

    public boolean isActive() {
        return isActive;
    }

    public boolean isGoalAchieved() {
        return goalAchieved;
    }
}
