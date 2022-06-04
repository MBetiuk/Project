//package pl.betiuk.project.model;
//
//
//import lombok.Getter;
//import lombok.RequiredArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;
//
//import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.List;
//
//@Getter
//@Setter
//@ToString
//@RequiredArgsConstructor
//@Entity
//@Table (name = "addresses")
//public class Address {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "id")
//
//
//    private Long id;
//    private String streetName;
//    private String houseNo;
//    private String flatNo;
//    private String postCode;
//    private String postTown;
//    private String town;
//
//    @OneToMany (mappedBy = "address")
//    private List<Client> clients = new ArrayList<>();
//
//    @OneToMany(mappedBy = "address")
//        private List<Employee> employeeList = new ArrayList<>();
//}
