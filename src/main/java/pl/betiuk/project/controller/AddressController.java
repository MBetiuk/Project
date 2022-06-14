package pl.betiuk.project.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.betiuk.project.model.Address;
import pl.betiuk.project.model.Client;
import pl.betiuk.project.repository.AddressRepository;
import pl.betiuk.project.repository.ClientRepository;
import pl.betiuk.project.service.ClientService;

import javax.persistence.EntityNotFoundException;

@Controller
@RequiredArgsConstructor
@RequestMapping("/address")
public class AddressController {
    private final AddressRepository addressRepository;
    private final ClientService clientService;
    private final ClientRepository clientRepository;

    @GetMapping("/add/{clientid}")
    public String addAddress(Model model, @PathVariable Long clientid) {
        model.addAttribute("address", new Address());
        model.addAttribute("clientid", clientid);
        return "address";
    }


    @PostMapping("/add/{clientid}")
    public String addAddress(Address address, @PathVariable Long clientid) {
        Client client = clientRepository.findById(clientid).orElseThrow(EntityNotFoundException::new);
        client.setAddress(address);
        clientRepository.save(client);
        return "redirect:/clients/all";
    }


}
