package pl.betiuk.project.service;

import org.springframework.stereotype.Service;
import pl.betiuk.project.model.Employee;

import java.util.List;

public interface EmployeeService <T>{


    Employee findById(Long id);

    List<Employee> findAll();





}
