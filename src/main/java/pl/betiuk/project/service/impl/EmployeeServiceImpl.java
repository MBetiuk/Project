package pl.betiuk.project.service.impl;

import org.springframework.stereotype.Service;
import pl.betiuk.project.model.Employee;
import pl.betiuk.project.repository.EmployeeRepository;
import pl.betiuk.project.service.EmployeeService;

import java.util.List;

@Service

public class EmployeeServiceImpl<T> implements EmployeeService<Employee> {

    private final EmployeeRepository employeeRepository;


    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee findById(Long id) {
        return null;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public List<Employee> getList() {
        return employeeRepository.getList();
    }


}
