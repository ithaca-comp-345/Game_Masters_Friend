package edu.ithaca.gamemaster.user_interfaces.clean_build;

import edu.ithaca.gamemaster.NPC;
import edu.ithaca.gamemaster.Player;

import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Campaign {
    private String campaignName;

    private Map<String, Player> characterList;
    private Map<String, User> players;
    private Map<String, Location> locations;
    private Map<String, NPC> npcsList;
    private Map<String, Session> sessionList;
    public int sessionCount = 0;

    public Campaign(String campaignName){
        this.campaignName = campaignName;

        this.characterList= new HashMap<>();
        this.players=new HashMap<>();
        this.locations=new HashMap<>();
        this.npcsList=new HashMap<>();
        this.sessionList=new HashMap<>();
    }

    public Session createSession(String sessionName){
        Session newSession = new Session(sessionName,this);
        sessionList.put(sessionName,newSession);
        sessionCount++;
        return newSession;
    }

    public Session deleteSession(String sessionName) throws FileNotFoundException{
        if(sessionList.containsKey(sessionName)) {
            Session deletedSession = sessionList.get(sessionName);
            sessionList.remove(sessionName);
            sessionCount--;
            return deletedSession;
        }
        throw new FileNotFoundException("Session doesn't exist to delete");
    }

    public Session getSession(String sessionName) throws FileNotFoundException{
        if(sessionList.containsKey(sessionName)) {
            Session session = sessionList.get(sessionName);
            return session;
        }
        throw new FileNotFoundException("Session doesn't exist to be gotten");
    }

    public void invitePlayer(User invited) throws FileAlreadyExistsException{
        if(players.containsKey(invited.getName())){
            throw new FileAlreadyExistsException("Player has already been invited");
        }
        else{
            players.put(invited.getName(),invited);
        }
    }

    public void addNPC(String npcName, NPC npc) throws FileAlreadyExistsException{
        if(npcsList.containsKey(npcName)){
            throw new FileAlreadyExistsException("NPC already exist");
        }
        else{
            npcsList.put(npcName, npc);
        }

    }

    public Object[] getSessionList(){
        return sessionList.keySet().toArray();
    }

    public Object[] getCharacterList(){
        return characterList.keySet().toArray();
    }

    public Object[] getNPCList(){
        return npcsList.keySet().toArray();
    }

    public Object[] getPlayerList() {return players.keySet().toArray();}



    public void createPlayerChar(User player){
        //TODO
    }

    public String getCampaignName(){
        return campaignName;
    }

    public User getPlayer(String name) throws FileNotFoundException{
        if(players.containsKey(name)){
            return players.get(name);
        }
        throw new FileNotFoundException("Player isn't invited to this campaign");
    }


    public ArrayList<Session> getSessionListClean(){
        ArrayList<Session> sessionsArray = new ArrayList<>();
        for(Session val : sessionList.values()){
            sessionsArray.add(val);
        }
        return sessionsArray;
    }
}
