package atu.cicd.lab7_validation;

import jakarta.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {


    @PostMapping("createPerson")
    public String addPerson(@Valid @RequestBody Person person, BindingResult bindingResult){
        if(bindingResult.hasErrors())
            return bindingResult.toString();
        System.out.println("Person created: " + person);
        return "Person added:" + person;
    }
}
