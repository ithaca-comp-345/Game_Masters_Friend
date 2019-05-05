package edu.ithaca.gamemaster.user_interfaces;

public class Notes {

    private String noteName;
    private String text;

    public Notes(String noteName) {
        this.noteName = noteName;
    }

        public String getNotes() {
            return text;
        }

        public void setNotes(String notes) {
            this.text = notes;
        }

}
