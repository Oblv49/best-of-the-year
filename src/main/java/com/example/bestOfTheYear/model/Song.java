package com.example.bestOfTheYear.model;

public class Song {
    //variables
    private int id;
    private String title;
    private String director;

    //constructor

    public Song(int id, String title, String director) {
        this.id = id;
        this.title = title;
        this.director = director;
    }

    //constructor default
    public Song() {
    }

    //getter and setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
