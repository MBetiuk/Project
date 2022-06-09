package pl.betiuk.project.service.impl;

import pl.betiuk.project.model.Employee;
import pl.betiuk.project.repository.EmployeeRepository;
import pl.betiuk.project.service.EmployeeService;

import java.util.List;

public class EmployeeServiceImpl<T> implements EmployeeService<T> {
    public final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    @Override
    public List<Employee> getList() {
        return null;
    }
}
