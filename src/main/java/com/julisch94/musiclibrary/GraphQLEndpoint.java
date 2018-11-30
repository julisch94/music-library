package com.julisch94.musiclibrary;

import com.coxautodev.graphql.tools.SchemaParser;
import javax.servlet.annotation.WebServlet;
import graphql.servlet.SimpleGraphQLServlet;

@WebServlet(urlPatterns = "/graphql")
public class GraphQLEndpoint extends SimpleGraphQLServlet {

    private static final long serialVersionUID = 1L;

    public GraphQLEndpoint() {
        super(SchemaParser.newParser().file("schema.graphqls").build().makeExecutableSchema());
    }
}