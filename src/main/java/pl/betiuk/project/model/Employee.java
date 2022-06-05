package pl.betiuk.project.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@EqualsAndHashCode
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    private String firstName;
    private String lastName;
    private EmployeeTypeEnum employeeTypeEnum;

    @ManyToOne
    @JoinColumn(name = "super_visor_id")
    private Employee superVisor;  // TODO: 04/06/2022 czy oddzielna encja dla supervisora????



//    @ManyToOne
//    @JoinColumn(name = "address_id")
//        private Address address;



//    @PESEL
//    private String pesel;

    // modelowanie hiearchi w sql
//    private Agent przelozony;
    //    private String section;  -- druga tabela i relacja 1:1?
//    private String agency; - relacja 1:1?


}
