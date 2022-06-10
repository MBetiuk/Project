package pl.betiuk.project.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.betiuk.project.model.Employee;
import pl.betiuk.project.repository.EmployeeRepository;
import pl.betiuk.project.service.EmployeeService;

import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
public class EmployeeServiceImpl<T> implements EmployeeService<Employee> {
    public final EmployeeRepository employeeRepository;



    @Override
    public Optional<Employee> findById(Long id) {
        return employeeRepository.findById(id);
    }
}
