package edu.ithaca.gamemaster;

public class Notes {

    private String noteName;
    private String notes;

    public Notes(String noteName) {
        this.noteName = noteName;
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

//   public void addToNotes(String stringToAdd){
//        this.notes += stringToAdd+"\n";
//    }
//
//    public void editNotes(){
//        new NoteEditor(notes).setVisible(true);
//    }

}
