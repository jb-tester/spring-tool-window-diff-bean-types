package com.example.springtoolwindowdiffbeantypes.model;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * *
 * <p>Created by Irina on 4/19/2024.</p>
 * <p>Project: spring-tool-window-diff-bean-types</p>
 * *
 */
public interface RepositoryInterface extends CrudRepository<Person, Integer> {

    List<Person> findAll();

    @Query("select e from Person e")
    List<Person> customQuery(@Param("") String arg);
}
