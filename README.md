GRAPHDB DEMO
------------

Featuring :

- Jdk 17
- SpringBoot
- Neo4J
- REST API



# Queries to test

[More details](https://spring.io/guides/gs/accessing-neo4j-data-rest/)

[Deeper](https://docs.spring.io/spring-data/neo4j/docs/current/reference/html/#query-by-example.matchers)

- Post a new Person 

curl --location 'http://localhost:8080/persons' \
--header 'Content-Type: application/json' \
--data '{
    "name": "Paulo",
    "movies": [
        {
            "title": "What Dreams May Come"
        }
    ]
}'

- Search options

curl --location 'http://localhost:8080/persons/search'

curl --location 'http://localhost:8080/persons/search/findPersonByName?name=Paulo'

curl --location 'http://localhost:8080/persons/search/findByMoviesTitle?title=That%20Thing%20You%20Do'

