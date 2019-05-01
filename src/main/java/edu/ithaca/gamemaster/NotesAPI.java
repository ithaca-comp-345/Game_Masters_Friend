package edu.ithaca.gamemaster;

import java.util.ArrayList;

public class NotesAPI {

    private Campaign campaign;

    public NotesAPI(Campaign campaign){
        this.campaign = campaign;
    }

    public void addNotes(String sessionName){
        campaign.addNotes(sessionName);
    }

    public void editNotes(String sessionName,String note){

    }

    public String getNotes(String sessionName){
        return campaign.getNotes(sessionName);
    }

    public void deleteNotes(String sessionName ){
        campaign.deleteCurrNotes(sessionName);
    }

    public String shareNotes(String sessionName){
        return campaign.shareInformation(sessionName);
    }
}
