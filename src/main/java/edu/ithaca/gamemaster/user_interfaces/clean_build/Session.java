package edu.ithaca.gamemaster.user_interfaces.clean_build;

import edu.ithaca.gamemaster.user_interfaces.Notes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Session {
    private String sessionName;
    private Campaign parentCampaign;
    private Map<String, User> players = new HashMap<>();
    private String timeStart;
    private String timeEnd;
    private String goal;
    private boolean isActive = false;
    private boolean goalAchieved;
    public Notes notes;

    public Session(String name, Campaign parent){
        this.sessionName=name;
        this.parentCampaign=parent;
        this.notes = new Notes(name);
    }

    public boolean start(String goal){
        if(goalAchieved){
            //session done already
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

    public String getNotes(){
        return notes.getNotes();
    }

    public void editNotes(String s){
        notes.setNotes(s);
    }

    public boolean stop(){
        this.timeEnd=currTime();
        return true;
    }


    private String currTime(){
        DateFormat format = new SimpleDateFormat("yyyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        String dateStr = format.format(date);
        return dateStr;
    }

    @Override
    public String toString(){
        return sessionName;
    }


    public String getSessionName(){return sessionName;}
    public Campaign getParentCampaign(){return parentCampaign;}
    public Map<String, User> getPlayers(){return players;}
    public String getTimeStart(){return timeStart;}
    public String getTimeEnd(){return timeEnd;}
    public String getGoal(){return goal;}
    public boolean isActive(){return isActive;}
    public boolean isGoalAchieved(){return goalAchieved;}
}
