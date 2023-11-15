package atu.cicd.lab7_validation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private String name;

    private String title;
    private String employeeId;
    private int age;
    private String email;
    private String position;
    private String department;

}
