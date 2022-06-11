package pl.betiuk.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.betiuk.project.model.Employee;
import pl.betiuk.project.repository.EmployeeRepository;

import java.util.List;

@Controller
@RequestMapping("/empl")
public class EmployeeController {
    private final EmployeeRepository employeeRepository;
    private Long id;
    private Model model;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


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
        return "redirect:/empl/all";

    }

    @GetMapping("/all")
    public String showEmployee(Model model) {
        List<Employee> employeeList = employeeRepository.findAll();
        model.addAttribute("employeeList", employeeList);
        return "employeeList";
    }

    @GetMapping("/update/{id}")
    public String updateEmployee(@PathVariable Long id, Model model){
        model.addAttribute("employee", employeeRepository.findById(id));
        return "employeeUpdate";
    }

    @PostMapping("/update/{id}")
    public String updateEmployee(Employee employee){
        employeeRepository.save(employee);
        return "redirect:/empl/all";
    }



    @GetMapping("/question/{id}")
    public String question(@PathVariable Long id, Model model){
        model.addAttribute("employee", employeeRepository.findById(id));
        return "emplQuestion";
    }

    @PostMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable Long id){
        employeeRepository.deleteById(id);
        return "redirect:/empl/all";
    }
}