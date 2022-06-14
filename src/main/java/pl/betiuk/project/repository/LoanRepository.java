package pl.betiuk.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.betiuk.project.model.Loan;

import java.util.List;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {

@Query(value = "select l.id, l.issue_date, l.term, l.value from loan l join client c on l.id=c.loan_id where c.id=:clientid", nativeQuery = true)
    List<Loan> findLoansByClient_Id(Long clientid);
}

