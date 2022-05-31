package pl.betiuk.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.betiuk.project.model.Employee;
import pl.betiuk.project.model.EmployeeTypeEnum;
import pl.betiuk.project.repository.EmployeeRepository;

import java.util.List;

@Controller
@RequestMapping("/empl")
public class EmployeeController {

    EmployeeTypeEnum employeeTypeEnum;
    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    @GetMapping("/add")
    public String addEmployee (Model model){
//        List<Employee> employeeList = employeeRepository.findAll();
//        model.addAttribute("EmployeeTypeEnum",employeeList);
        model.addAttribute("employee", new Employee());
        return "employeeAdd";
    }

    @PostMapping("/add")
    public String addEmployee (Employee employee){
        employeeRepository.save(employee);
        return "mmm"; // TODO: 30/05/2022 do zmiany

    }

}
