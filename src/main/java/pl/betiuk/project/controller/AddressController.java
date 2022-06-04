//package pl.betiuk.project.controller;
//
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import pl.betiuk.project.model.Address;
//import pl.betiuk.project.repository.AddressRepository;
//
//@Controller
//@RequiredArgsConstructor
//@RequestMapping("/address")
//public class AddressController {
//   private final AddressRepository addressRepository;
//
//    @GetMapping("/address")
//    public String addAddress (Model model){
//        model.addAttribute("address", new Address());
//        return "address";
//    }
//
//
//    @PostMapping("/address")
//    public String addAddress (Address address){
//        addressRepository.save(address);
//        return "mmm";
//    }
//
//
//
//
//}
