package pl.betiuk.project.service.impl;

import pl.betiuk.project.model.Loan;
import pl.betiuk.project.service.LoanService;

import java.util.List;

public class LoanServiceImpl implements LoanService {
    private final LoanService loanService;

    public LoanServiceImpl(LoanService loanService) {
        this.loanService = loanService;
    }


}