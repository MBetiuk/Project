package pl.betiuk.project.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.betiuk.project.model.Address;
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

    @GetMapping("/add")
    public String addAddress(Model model) {
        model.addAttribute("address", new Address());
//        model.addAttribute("client", clientService.findById(clientId));
        return "address";
    }


    @PostMapping("/add")
    public String addAddress(Address address) {
//        address.setClient(clientRepository.findById(clientId).orElseThrow(EntityNotFoundException::new));
        addressRepository.save(address);
        return "redirect:/clients/all";
    }


}
