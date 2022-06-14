package pl.betiuk.project.service.impl;

import org.springframework.stereotype.Service;
import pl.betiuk.project.model.Employee;
import pl.betiuk.project.model.Filter;
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
    public List<Employee> searchEmplEnum(Filter filter) {
        String employeeTypeEnum;

        if (filter.getEmployee() == null) {
            return employeeRepository.findAll();
        } else {
            employeeTypeEnum = String.valueOf(filter.getEmployee().getEmployeeTypeEnum());

        }
        List<Employee>enumList = employeeRepository.searchEmplEnum(employeeTypeEnum);
        return enumList;
    }
    
    
    public List<Employee> search(Filter filter) {
        
        String superVisor = null;
      
        if (filter.getEmployee() == null) {
            return employeeRepository.findAll();
        } else {
            superVisor = String.valueOf(filter.getEmployee().getSuperVisor().getId());
        }


        List<Employee> employeeList = employeeRepository.searchEmplEnum( superVisor);
        return employeeList;

    }

 


    // TODO: 14/06/2022  po wprowadzeniu drugiego filtra - NIE FILTRUJE !!!!!
    @Override
    public Employee findById(Long id) {
        return null;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }


}
