package pl.betiuk.project.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private LocalDate issueDate;
    private Integer term;
    private Integer value;

    public Loan(Long id, LocalDate issueDate, Integer term, Integer value) {
        this.id = id;
        this.issueDate = issueDate;
        this.term = term;
        this.value = value;
    }
}