package edu.ithaca.gamemaster.map;

public class Location {
    public String locationName;
    public Map map;
    public String imagePath;

    public Location(String imagePathIn, String locationNameIn){
        this.locationName = locationNameIn;
        this.imagePath = imagePathIn;
        this.map = new Map(imagePath);
    }

    public void editMap(String imagePathIn){
        this.map =  new Map(imagePath);
    }

    public void getMap(){
        map.display();

    }

}
