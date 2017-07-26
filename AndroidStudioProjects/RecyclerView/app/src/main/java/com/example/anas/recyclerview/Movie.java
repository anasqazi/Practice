package com.example.anas.recyclerview;

/**
 * Created by anas on 21/7/17.
 */

public class Movie {
    private String title,name,genre,year;
    public Movie()
    {}
    public Movie(String title,String name,String genre,String year)
    {
        this.title=title;
        this.name=name;
        this.year=year;
        this.genre=genre;
    }

    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public String getYear() {
        return year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setYear(String year) {
        this.year = year;

    }

}