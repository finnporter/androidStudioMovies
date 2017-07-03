package com.example.finn.movierankings;

import java.util.ArrayList;

/**
 * Created by Finn on 03/07/2017.
 */

public class Ranking {
    private ArrayList<Movie> movies;

    public Ranking() {
        this.movies = new ArrayList<Movie>();
    }

    public ArrayList<Movie> getMovies() {
        return this.movies;
    }

    public void setUp() {
        Movie movie01 = new Movie("Dirty Dancing", "romance", 1);
        Movie movie02 = new Movie("The Sting", "crime", 2);
        Movie movie03 = new Movie("The Princess Bride", "adventure", 3);
        Movie movie04 = new Movie("The Grand Budapest Hotel", "comedy", 4);
        Movie movie05 = new Movie("The Shop Around The Corner", "comedy", 5);
        Movie movie06 = new Movie("Tootsie", "comedy", 6);
        Movie movie07 = new Movie("Cinema Paradiso", "drama", 7);
        Movie movie08 = new Movie("La vita e bella", "drama", 8);
        Movie movie09 = new Movie("Lock, Stock and Two Smoking Barrels", "crime", 9);
        Movie movie10 = new Movie("Dancer in the Dark", "drama", 10);
        movies.add(movie01, movie02, movie03, movie04, movie05, movie06, movie07, movie08, movie09, movie10);
    }

    public int getNumberOfMovies() {
        this.movies.length();
    }

}
