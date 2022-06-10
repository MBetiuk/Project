package pl.betiuk.project.service;

import pl.betiuk.project.model.Employee;

import java.util.Optional;

public interface EmployeeService <T>{



    Optional<Employee> findById (Long id);


}
