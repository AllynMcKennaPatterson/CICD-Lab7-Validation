package atu.cicd.lab7_validation;

import org.springframework.stereotype.Service;

@Service
public class PersonService {
    public void savePerson(Person person){
        System.out.println("Person saved: " + person);
    }

    public Person getPersonByEmployeeId(String employeeId){
        Person myPerson = new Person("Allyn", "Mr", employeeId, 22, "G00392765@atu.ie", "student", "engineering");
        return myPerson;
    }
}
