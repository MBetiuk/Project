package pl.betiuk.project.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "loans")
public class Loan {

    @Id
@GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private LocalDate issueDate;
    private Integer term;
    private Integer value;
//    private Integer costs;
//    private Integer total;
//    private Integer rate;
//    private String agentName;

//    @ManyToOne
//    @JoinColumn(name = "client_id")
//    private Client client;

}
