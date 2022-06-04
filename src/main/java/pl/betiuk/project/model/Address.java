package pl.betiuk.project.model;


import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")


    private Long id;
    private String streetName;
    private String houseNo;
    private String flatNo;
    private String postCode;
    private String postTown;
    private String town;


@OneToMany(mappedBy = "address")
  private List<Client> clientList;





}
