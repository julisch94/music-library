package com.julisch94.musiclibrary;

import com.coxautodev.graphql.tools.SchemaParser;
import javax.servlet.annotation.WebServlet;

import graphql.schema.GraphQLSchema;
import graphql.servlet.SimpleGraphQLServlet;

@WebServlet(urlPatterns = "/graphql")
public class GraphQLEndpoint extends SimpleGraphQLServlet {

    private static final long serialVersionUID = 1L;

    public GraphQLEndpoint() {
        super(buildSchema());
    }

    private static GraphQLSchema buildSchema() {
        Library library = new Library();
        library.addArtist(new Artist("Ed Sheeran"));
        library.addArtist(new Artist("Outbreakband"));
        return SchemaParser.newParser().file("schema.graphqls").resolvers(new Query(library)).build()
                .makeExecutableSchema();
    }
}