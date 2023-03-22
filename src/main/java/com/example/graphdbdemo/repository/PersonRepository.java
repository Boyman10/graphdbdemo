package com.example.graphdbdemo.repository;

import com.example.graphdbdemo.entity.Person;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.List;

public interface PersonRepository extends Neo4jRepository<Person, Long> {

    Person findPersonByName(String name);
    List<Person> findByMoviesTitle(String title);
}
