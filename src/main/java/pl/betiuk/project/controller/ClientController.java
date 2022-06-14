package pl.betiuk.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.betiuk.project.model.Client;
import pl.betiuk.project.repository.AddressRepository;
import pl.betiuk.project.repository.ClientRepository;

import java.util.List;


@Controller
@RequestMapping("/clients")
public class ClientController {


    private final ClientRepository clientRepository;

    public ClientController(ClientRepository clientRepository, AddressRepository addressRepository) {
        this.clientRepository = clientRepository;
    }

    @GetMapping("/add")
    public String addClientForm(Model model) {
        model.addAttribute("client", new Client());
        return "add";
    }

    @PostMapping("/add")
    public String addClientForm(Client client) {
        clientRepository.save(client);
        return "redirect:/address/add/"+client.getId();

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
        return "redirect:/clients/all";

    }

    @GetMapping("/delete/{id}")
    public String deleteClient(@PathVariable Long id){

        clientRepository.deleteById(id);

        return "redirect:/clients/all";
    }

}
