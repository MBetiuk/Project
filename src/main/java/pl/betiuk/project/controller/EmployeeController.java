package pl.betiuk.project.controller;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.betiuk.project.model.Employee;
import pl.betiuk.project.model.EmployeeTypeEnum;
import pl.betiuk.project.repository.EmployeeRepository;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/empl")
public class EmployeeController {
    private final EmployeeRepository employeeRepository;


    @ModelAttribute("superVisors")
    public List<Employee> superVisors() {
        return this.employeeRepository.findAll();
    }


    @GetMapping("/add")
    public String addEmployee(Model model) {
        model.addAttribute("employee", new Employee());
        model.addAttribute("superVisor", employeeRepository.findAll());
        return "employeeAdd";
    }

    @PostMapping("/add")
    public String addEmployee(Employee employee) {

        employeeRepository.save(employee);
        return "mmm";

    }

    @GetMapping("/all")
    public String showEmployee(Model model) {
        List<Employee> employeeList = employeeRepository.findAll();
        model.addAttribute("employeeList", employeeList);
        return "mmm";

    }
}