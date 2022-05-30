//package pl.betiuk.project.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import pl.betiuk.project.model.Employee;
//import pl.betiuk.project.repository.EmployeeRepository;
//
//@Controller
//@RequestMapping("/empl")
//public class EmployeeController {
//
//    private final EmployeeRepository employeeRepository;
//
//    public EmployeeController(EmployeeRepository employeeRepository) {
//        this.employeeRepository = employeeRepository;
//    }
//
//
//    @GetMapping("/add")
//    public String addEmployee (Model model){
//        model.addAttribute("employee", new Employee());
//        return "employeeAdd";
//    }
//
//    @PostMapping("/add")
//    public String addEmployee (Employee employee){
//        employeeRepository.save(employee);
//        return "mmm"; // TODO: 30/05/2022 do zmiany
//
//    }
//
//}
