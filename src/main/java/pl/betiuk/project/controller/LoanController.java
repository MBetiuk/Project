package pl.betiuk.project.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.betiuk.project.model.Address;
import pl.betiuk.project.model.Client;
import pl.betiuk.project.model.Loan;
import pl.betiuk.project.repository.ClientRepository;
import pl.betiuk.project.repository.LoanRepository;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Controller
@RequestMapping("/loan")
public class LoanController {


    private final LoanRepository loanRepository;
    private final ClientRepository clientRepository;


    public LoanController(LoanRepository loanRepository, ClientRepository clientRepository) {
        this.loanRepository = loanRepository;
        this.clientRepository = clientRepository;
    }

    @GetMapping("/add/{clientid}")
    public String addLoan(Model model, @PathVariable Long clientid){
        model.addAttribute("loan", new Loan());
        model.addAttribute("clientid", clientid);
        return "loanAdd";
    }


    @PostMapping("/add/{clientid}")
    public String addAddress(Loan loan, @PathVariable Long clientid) {
        Client client = clientRepository.findById(clientid).orElseThrow(EntityNotFoundException::new);
        client.setLoan(loan);
        clientRepository.save(client);
        return "redirect:/loan/all/" + client.getId();
    }
    @GetMapping("/all/{clientid}")
    public String showAllLoans (Model model,  @PathVariable Long clientid){
    List<Loan> loanList = loanRepository.findLoansByClient_Id(clientid);
        model.addAttribute("loanList", loanList);
        return "loanList";
    };




}
