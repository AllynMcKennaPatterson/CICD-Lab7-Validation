package atu.cicd.lab7_validation;

import org.springframework.stereotype.Service;

@Service
public class PersonService {
    public void savePerson(Person person){
        System.out.println("Person saved: " + person);
    }
}
