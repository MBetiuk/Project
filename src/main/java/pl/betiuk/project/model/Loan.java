package pl.betiuk.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
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

}
