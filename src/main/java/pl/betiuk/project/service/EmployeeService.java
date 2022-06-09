package pl.betiuk.project.service;

import pl.betiuk.project.model.Employee;

import java.util.List;

public interface EmployeeService <T>{


    List<Employee> getList();
}
