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

   public  List<Employee> search(Filter filter){
        String superVisor;
        String employeeTypeEnum;
        if (filter.getEmployee() == null) {
            return employeeRepository.findAll();
        }else {
            superVisor = String.valueOf(filter.getEmployee().getSuperVisor().getId());
            employeeTypeEnum = String.valueOf(filter.getEmployee().getEmployeeTypeEnum());
        }

        List<Employee> employeeList = employeeRepository.search(employeeTypeEnum,superVisor);
        return employeeList;
    }


    @Override
    public Employee findById(Long id) {
        return null;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }




}
