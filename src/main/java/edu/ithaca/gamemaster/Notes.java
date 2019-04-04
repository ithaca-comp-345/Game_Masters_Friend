package edu.ithaca.gamemaster;

public class Notes {

    private String noteName;
    private String notes;

    public Notes(String noteName, String notes) {
        this.noteName = noteName;
        this.notes = notes+"\n";
    }

    public String getNoteName() {
        return noteName;
    }

    public void setNoteName(String noteName) {
        this.noteName = noteName;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void addToNotes(String stringToAdd){
        this.notes += stringToAdd+"\n";
    }

}
