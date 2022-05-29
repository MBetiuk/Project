package pl.betiuk.project.model;

import org.hibernate.validator.constraints.pl.PESEL;

import javax.persistence.*;

@Entity
@Table(name = "agents")
public class Agent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    private String section;
    private String agency;
    private String firstName;
    private String lastName;

    @PESEL
    private String pesel;

    // modelowanie hiearchi w sql
//    private Agent przelozony;
}
