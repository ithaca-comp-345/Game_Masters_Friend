package edu.ithaca.gamemaster;
import java.util.ArrayList;
import java.util.Map;


public class GMUser {
    public Map<String, Campaign> campaignList;

    GMUser(){};

    public void createCampaign(String campaignName, String location){
        Campaign campaign=new Campaign();
        campaignList.put(campaignName,campaign);
    };
    //public void createLocation(String locationName){};
    //public void createNPC(){};
    //public void createMap(){};
    //public void createCharacter(){};
    // public void shareInformation(String campaignName){};
    // public void createEncounter(String campaignName){};
    // public void addNotes(String campaignName){};
    // public void editCharacter(){};
    // public void editLocation(){};
    // public void editNPC();
    // public void editMap();
    // public void searchNPC();
    // public void shareMap();





}