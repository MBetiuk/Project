package pl.betiuk.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.betiuk.project.model.Loan;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {
}

