package pl.betiuk.project.model;


import javax.persistence.*;

@Entity
@Table (name = "addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")


    private Long id;
    private String streetName;
    private String houseNo;
    private String flatNo;
    private String postCode;
    private String town;

    //    @OneToMany (mappedBy = "address")
//    private List<Client> clients = new ArrayList<>();
}
