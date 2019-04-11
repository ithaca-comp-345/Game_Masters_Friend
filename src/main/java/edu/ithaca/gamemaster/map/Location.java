package edu.ithaca.gamemaster.map;

import java.io.File;

public class Location {
    private String locationName;
    private Map map;
    private String imagePath;

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

   public String getLocationName(){
        return locationName;
   }

   public String getImagePath(){
        return imagePath;
   }

    public void editMap(String imagePathIn){
        this.map =  new Map(imagePath);
    }

    public void displayMap(){
        map.display();
    }

    public Map getMap(){
        return map;
    }

}
