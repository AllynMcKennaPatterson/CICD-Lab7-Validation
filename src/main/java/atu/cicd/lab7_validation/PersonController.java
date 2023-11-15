package atu.cicd.lab7_validation;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {
    private PersonService personService;

    public PersonController(PersonService personService){
        this.personService = personService;
    }

    @PostMapping("createPerson")
    public String addPerson(@Valid @RequestBody Person person, BindingResult bindingResult){
        if(bindingResult.hasErrors())
            return bindingResult.toString();
        System.out.println("Person created: " + person);
        return "Person added:" + person;
    }

    @GetMapping("/{employeeId}")
    public ResponseEntity<?> getPerson(@PathVariable String employeeId) {
        if(employeeId.length() > 5 || employeeId.isBlank()){
            return ResponseEntity.badRequest().body("EmployeeId is invalid");
        }

        Person person = personService.getPersonByEmployeeId(employeeId);

        if (person == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(person);
    }
}
