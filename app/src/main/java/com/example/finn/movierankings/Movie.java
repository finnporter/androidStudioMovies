package com.example.finn.movierankings;

/**
 * Created by Finn on 03/07/2017.
 */

public class Movie {
    private String title;
    private String genre;
    private int ranking;

    public Movie(String title, String genre, int ranking) {
        this.title = title;
        this.genre = genre;
        this.ranking = ranking;
    }

    public String getTitle() {
        return "Title: " + this.title + ", ";
    }

    public String getGenre() {
        return "Genre: " + this.genre + ", ";
    }

    public String getRanking() {
        return "Ranking: " + this.ranking;
    }

    public String allDetails() {
        return getTitle() + getGenre() + getRanking();
    }
}
