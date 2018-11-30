package com.julisch94.musiclibrary;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

public class Query implements GraphQLQueryResolver {

    private final Library library;

    public Query(Library library) {
        this.library = library;
    }

    public List<Artist> allArtists() {
        return library.getAllArtists();
    }

}