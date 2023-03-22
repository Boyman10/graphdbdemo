package com.example.graphdbdemo.entity;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.Collections;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Node
public class Person {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Integer born;

    public Person() {}

    public Person(String name) {
        this.name = name;
    }

    @Relationship(type="DIRECTED")
    public Set<Movie> movies;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {

        return this.name + "'s directed movies => "
                + Optional.ofNullable(this.movies).orElse(
                        Collections.emptySet()).stream()
                .map(Movie::getTitle)
                .toList();
    }

    public void direct(Movie movie) {
        if (movies == null) {
            movies = new HashSet<>();
        }
        movies.add(movie);
    }
}
