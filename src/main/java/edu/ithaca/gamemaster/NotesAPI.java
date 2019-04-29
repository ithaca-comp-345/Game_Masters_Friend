package edu.ithaca.gamemaster;

public class NotesAPI {

    protected Campaign campaign;

    public NotesAPI(Campaign c){
        this.campaign = c;
    }
    public void addNotes(String sessName, String note){
        campaign.addNotes(sessName, note);
    }
    public void editNotes(String sessName, String note){ campaign.editCurrNotes(sessName, note);}
    public String getNotes(String sessName){ return campaign.getNotes(sessName);}

}
