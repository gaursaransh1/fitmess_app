package com.saranshgaur.firstapp;

/**
 * Created by saransh gaur on 06-07-2016.
 */
public class User {
    public String Largetext;
    public String Mediumtext;

    public User(String Largetext, String Mediumtext) {
        super();
        this.Largetext = Largetext;
        this.Mediumtext = Mediumtext;
    }

    public void setMediumtext(String mediumtext) {
        Mediumtext = mediumtext;
    }

    public void setLargetext(String largetext) {
        Largetext = largetext;
    }

    public String getLargetext() {
        return Largetext;
    }

    public String getMediumtext() {
        return Mediumtext;
    }
}