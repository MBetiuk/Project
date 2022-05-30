package pl.betiuk.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.betiuk.project.model.Client;
import pl.betiuk.project.repository.ClientRepository;

@Controller
@RequestMapping("/clients")
public class ClientController {


private final ClientRepository clientRepository;

    public ClientController(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }


//    @GetMapping("/all")
//    public String showClients (Model model, @ModelAttribute("client") Client client){
//        List<Client> clientList = clientRepository.findAll();
//        model.addAttribute("clientsList", clientList);
//        return "clientsList";
//
//    }

    @GetMapping("/add")
    public String showAddClientForm( Model model){
        model.addAttribute("client", new Client());
        return "add";
    }
    @PostMapping("/add")
    public String showAddClientForm(Client client) {

        clientRepository.save(client);
        return "mmm";
//         TODO: 30/05/2022 do zmiany

    }

}
