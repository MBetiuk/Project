package pl.betiuk.project.controller;

import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.betiuk.project.model.Client;
import pl.betiuk.project.repository.ClientRepository;
import pl.betiuk.project.service.ClientService;

import java.util.List;


@Controller
@RequestMapping("/clients")
public class ClientController {


    private final ClientRepository clientRepository;
    private final ClientService clientService;

    public ClientController(ClientRepository clientRepository, ClientService clientService) {
        this.clientRepository = clientRepository;
        this.clientService = clientService;
    }

    @GetMapping("/add")
    public String showAddClientForm(Model model) {
        model.addAttribute("client", new Client());
        return "add";
    }

    @PostMapping("/add")
    public String showAddClientForm(Client client) {
        clientRepository.save(client);
        return "mmm";

    }


    @GetMapping("/all")
    public String showAllClients(Model model){
        List<Client> clientList = clientRepository.findAll();
        model.addAttribute("clientsList", clientList);
        return "clientsList";
    };

    @GetMapping("/update/{id}")
    public String updateClient(@PathVariable Long id, Model model){
        model.addAttribute("client", clientRepository.findById(id));
        return "clientUpdate";
    }
    @PostMapping("/update/{id}")
    public String updateClient(Client client){
        clientRepository.save(client);
        return "mmm";

    }

}
