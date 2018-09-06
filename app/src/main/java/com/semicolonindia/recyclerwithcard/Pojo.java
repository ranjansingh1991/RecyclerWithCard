package com.semicolonindia.recyclerwithcard;

/**
 * Created by RANJAN SINGH on 8/25/2017.
 */

public class Pojo {
    private int image;
    private String name;

    public Pojo(int image, String name) {

        this.image = image;
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
