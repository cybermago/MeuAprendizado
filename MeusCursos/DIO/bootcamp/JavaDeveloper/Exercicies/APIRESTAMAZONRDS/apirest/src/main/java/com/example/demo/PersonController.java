package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class PersonController {
    private final PersonRepository reporitoryPerson;

    public PersonController(PersonRepository reporitoryPerson) {
        this.reporitoryPerson = reporitoryPerson;
    }

    @GetMapping("/persons")
    public Person consultAllPersons(){
        return (Person) reporitoryPerson.findAll();
    }

    @GetMapping("/persons/{id}")
    public Optional<Person> consultById(@PathVariable Long id){
        return reporitoryPerson.findById(id);
    }
}
