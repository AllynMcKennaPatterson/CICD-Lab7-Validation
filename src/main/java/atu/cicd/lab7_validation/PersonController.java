package atu.cicd.lab7_validation;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    private Person person;

    public PersonController(Person person){
        this.person = person;
    }

    @PostMapping("createPerson")
    public Person addPerson(@Valid @RequestBody Person person){
        return person;
    }
}
