package com.example.springtoolwindowdiffbeantypes.web;

import com.example.springtoolwindowdiffbeantypes.model.Person;
import com.example.springtoolwindowdiffbeantypes.model.RepositoryInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController("annotatedController")
public class PersonController {

    private final RepositoryInterface repository;

    public PersonController(RepositoryInterface repository) {
        this.repository = repository;
    }

    @GetMapping("/all")
    public List<Person> getAll() {

        return repository.findAll();
    }

    @GetMapping("/custom/{pvar}")
    public List<Person> customQuery(@PathVariable String pvar) {

        return repository.customQuery(pvar);
    }

}    