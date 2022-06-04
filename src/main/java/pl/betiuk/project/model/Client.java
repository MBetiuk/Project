package pl.betiuk.project.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.pl.PESEL;

import javax.persistence.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private Long id;





    private String firstName;
    private String lastName;
    @PESEL
    private String pesel;
//    private TypeEnum clientype;


//    @ManyToOne
//    private Agency agency;
//
//    @OneToMany (mappedBy = "client")
//    private List <Loan> loanList = new ArrayList<>();
//
//    @ManyToOne
//    @JoinColumn(name = "id")
//    private Address address;


}
