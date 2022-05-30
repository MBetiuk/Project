package pl.betiuk.project.model;

import org.hibernate.validator.constraints.pl.PESEL;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

//    private String section;  -- druga tabela i relacja 1:1?
//    private String agency; - relacja 1:1?
    private String firstName;
    private String lastName;
    private String type;




    @PESEL
    private String pesel;

    // modelowanie hiearchi w sql
//    private Agent przelozony;
}
