package pl.betiuk.project.controller;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.betiuk.project.model.Client;
import pl.betiuk.project.repository.ClientRepository;

import java.util.List;

@RequiredArgsConstructor
@Controller
@RequestMapping("/clients")
public class ClientController {


    private final ClientRepository clientRepository;


    @GetMapping("/all")

    public String showClients(Model model) {
        List<Client> clientList = clientRepository.findAll();
        model.addAttribute("clientsList", clientList);
        return "clientsList";

    }

    @GetMapping("/add")
    public String showAddClientForm(Model model) {
        model.addAttribute("client", new Client());
        return "add";
    }

    @PostMapping("/add")
    public String showAddClientForm(Client client) {

        clientRepository.save(client);
        return "redirect:/address/add"+client.getId();

    }


    @GetMapping("/update/{id}")
    public String updateClient(@PathVariable Long id, Model model) {
        model.addAttribute("client", clientRepository.findById(id));

        return "clientUpdate";
    }


}
