package pl.betiuk.project.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "loans")
public class Loan {

    @Id

    @Column(name = "number" , unique = true)
    private Long id;
    private Date issueDate;
    private Integer term;
    private Integer value;
    private Integer costs;
    private Integer total;
    private Integer rate;
    private String agentName;

//    @ManyToOne
//    @JoinColumn(name = "id")
//    private Client client;

}
