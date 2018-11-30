package com.julisch94.musiclibrary;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLResolver;

public class Query implements GraphQLResolver {

    private final Library library;

    public Query(Library library) {
        this.library = library;
    }

    public List<Artist> allArtists() {
        return library.getAllArtists();
    }

}