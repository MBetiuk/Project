package pl.betiuk.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.betiuk.project.service.impl.DataService;

@Controller
@RequestMapping("/start")
public class StartController {

    private final DataService dataService;


    public StartController(DataService dataService) {
        this.dataService = dataService;
    }

    @GetMapping("")
    public String start() {
        dataService.loadData();
        return "login";
        // TODO: 12/06/2022 zrobić przekierowanie na strone logowania
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> korekta po awarii!!
