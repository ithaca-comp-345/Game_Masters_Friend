package edu.ithaca.gamemaster.map;

import java.io.File;

public class Location {
    public String locationName;
    public Map map;
    public String imagePath;

    public Location(String imagePathIn, String locationNameIn){
        if(isPathValid(imagePathIn)){
            this.locationName = locationNameIn;
            this.imagePath = imagePathIn;
            this.map = new Map(imagePath);
        }
        else {
            throw new IllegalArgumentException("path is incorrect");
        }
    }

   public static boolean isPathValid(String imagePathIn){
       boolean exists = (new File(imagePathIn)).exists();
       if (exists){
           return true;
       }
       else {
           return false;
       }
   }

    public void editMap(String imagePathIn){
        this.map =  new Map(imagePath);
    }

    public void getMap(){
        map.display();

    }

}
