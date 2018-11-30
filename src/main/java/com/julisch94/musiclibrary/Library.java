package com.julisch94.musiclibrary;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private final List<Artist> artists;

    public Library() {
        this.artists = new ArrayList<>();
    }

    public List<Artist> getAllArtists() {
        return artists;
    }

    public void addArtist(Artist a) {
        artists.add(a);
    }

}