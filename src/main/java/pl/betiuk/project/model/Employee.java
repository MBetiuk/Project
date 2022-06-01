package pl.betiuk.project.model;

import org.hibernate.validator.constraints.pl.PESEL;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;


    private String firstName;



    private String lastName;
//    private String type;  // TODO: 30/05/2022 czy to pole ma być listą??

private EmployeeTypeEnum employeeTypeEnum;




//    @PESEL
//    private String pesel;

    // modelowanie hiearchi w sql
//    private Agent przelozony;
    //    private String section;  -- druga tabela i relacja 1:1?
//    private String agency; - relacja 1:1?


    public Employee() {
    }

    public Employee(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public EmployeeTypeEnum getEmployeeTypeEnum() {
        return employeeTypeEnum;
    }

    public void setEmployeeTypeEnum(EmployeeTypeEnum employeeTypeEnum) {
        this.employeeTypeEnum = employeeTypeEnum;
    }

}
