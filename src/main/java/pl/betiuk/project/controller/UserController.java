package pl.betiuk.project.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.betiuk.project.model.User;
import pl.betiuk.project.repository.UserRepository;

import java.util.List;


@AllArgsConstructor
@Data
@RequestMapping("/user")
@Controller
public class UserController {

    private final UserRepository userRepository;

    @GetMapping("/add")
    public String addUser(Model model) {
        model.addAttribute("user", new User());
        return "userAdd";

    }

    @PostMapping("/add")
    public String addUser(User user) {
        userRepository.save(user);
        return "redirect:/user/all";
    }

    @GetMapping("/all")
    public String showUser(Model model) {
        List<User> userList = userRepository.findAll();
        model.addAttribute("userList", userList);
        return "userList";
    }

    @GetMapping("/update/{id}")
    public String updateUser(@PathVariable Long id, Model model){
        model.addAttribute("user", userRepository.findById(id));
        return "userUpdate";
    }

    @PostMapping("/update/{id}")
    public String updateUser(User user){
        userRepository.save(user);
        return "redirect:/user/all";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id){
        userRepository.deleteById(id);
        return "redirect:/user/all";
    }



}
