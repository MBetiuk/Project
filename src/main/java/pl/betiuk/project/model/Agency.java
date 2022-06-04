package pl.betiuk.project.model;

import lombok.*;

import javax.persistence.*;
@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table
public class Agency {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String agencyNo;


    //zrobić relację
//    private Employee employee;


}
