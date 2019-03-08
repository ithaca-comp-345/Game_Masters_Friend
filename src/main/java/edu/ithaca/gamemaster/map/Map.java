package edu.ithaca.gamemaster.map;

public class Map {

    private int width;
    private int heigth;
    private String image;

    public Map(int width, int length, String image) {

        this.width = width;
        this.heigth = length;
        this.image = image;

    }


    public int getWidth(){

        return width;
    }

}
