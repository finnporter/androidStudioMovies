package com.example.finn.movierankings;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.*;

/**
 * Created by Finn on 03/07/2017.
 */

public class RankingTest {

    Ranking movies;

    @Before
    public void before() {
        movies = new Ranking();
    }

    @Test
    public void hasMovies() {
        assertNotNull(movies);
    }

    @Test
    public void canSetUp() {
        movies.setUp();
        assertEquals(10, movies.getNumberOfMovies());
    }
}
