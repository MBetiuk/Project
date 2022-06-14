package pl.betiuk.project.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    private String firstName;
    private String lastName;
    @Column(columnDefinition = "varchar(255)")
    private EmployeeTypeEnum employeeTypeEnum;

    @ManyToOne
    @JoinColumn(name = "super_visor_id")
    private Employee superVisor;

//    @ManyToOne
//    @JoinColumn(name = "id")
//    private Address address;

}
