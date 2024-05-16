package com.example.springtoolwindowdiffbeantypes.model;

import org.springframework.data.repository.RepositoryDefinition;

import java.util.List;

@RepositoryDefinition(domainClass = Person.class, idClass = Integer.class)
public interface RepositoryDefinitionInterface {

    List<Person> getByName(String firstName);
}
