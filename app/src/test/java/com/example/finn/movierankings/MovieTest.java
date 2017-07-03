package com.example.finn.movierankings;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Finn on 03/07/2017.
 */

public class MovieTest {

    Movie movie01;

    @Before
    public void before() {
        movie01 = new Movie("Dirty Dancing", "romance", 1);
    }

    @Test
    public void hasTitle() {
        assertEquals("Title: Dirty Dancing, ", movie01.getTitle());
    }

    @Test
    public void hasGenre() {
        assertEquals("Genre: romance, ", movie01.getGenre());
    }

    @Test
    public void hasRanking() {
        assertEquals("Ranking: 1", movie01.getRanking());
    }

    @Test
    public void returnsMovieDetails() {
        assertEquals("Title: Dirty Dancing, Genre: romance, Ranking: 1", movie01.allDetails());
    }


}
