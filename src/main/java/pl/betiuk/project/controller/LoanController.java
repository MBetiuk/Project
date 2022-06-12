package pl.betiuk.project.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.betiuk.project.model.Loan;
import pl.betiuk.project.repository.LoanRepository;

@Controller
@RequestMapping("/loan")
public class LoanController {


    private final LoanRepository loanRepository;


    public LoanController(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    @GetMapping("/add")
    public String addLoan(Model model){
        model.addAttribute("loan", new Loan());
        return "loanAdd";
    }

    @PostMapping("/add")
    public String addLoan(Loan loan){
        loanRepository.save(loan);
        return "mmm";
    }
}
