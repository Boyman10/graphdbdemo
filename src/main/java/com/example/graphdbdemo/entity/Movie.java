package com.example.graphdbdemo.entity;

import org.springframework.data.neo4j.core.schema.*;


@Node
public class Movie {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String tagLine;
    private Integer released;

    public Movie() {}

    public Movie(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
