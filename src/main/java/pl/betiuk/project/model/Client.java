package pl.betiuk.project.model;

import lombok.*;
import org.hibernate.validator.constraints.pl.PESEL;

import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
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

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

    // TODO: 04/06/2022  - nie zapisuje mi się klient + adres, nie zapisuje mi się address_id, taka sama relacja
    //  będzie z pracownik+adres








}
