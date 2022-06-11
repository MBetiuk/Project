package pl.betiuk.project.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.Objects;

@Getter
@Setter
@ToString

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String nick;

//    @Email
    private String email;
    private String password;

    private UserTypeEnum userTypeEnum;


}
