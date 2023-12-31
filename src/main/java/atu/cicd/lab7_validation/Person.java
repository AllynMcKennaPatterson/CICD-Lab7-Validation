package atu.cicd.lab7_validation;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    @NotBlank(message = "Name cannot be blank")
    @Size(min = 2, max = 40, message = "Name must be between 2 and 40 characters")
    private String name;

    @NotBlank(message = "Title cannot be blank")
    private String title;

    @NotBlank(message = "Employee ID cannot be blank")
    @Size(max = 5, message = "Employee ID must me less than 5 characters")
    private String employeeId;

    @Min(value = 18, message = "Age must be over 18+")
    private int age;

    @Email(message = "Invalid email address")
    private String email;

    @NotBlank(message = "Position cannot be blank")
    private String position;

    @NotBlank(message = "Department cannot be blank")
    private String department;

}
