package pl.betiuk.project.model;

import javax.persistence.*;

@Entity
@Table
public class Agency {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String agencyNo;


    public Agency() {
    }

    public Agency(Long id, String agencyNo) {
        this.id = id;
        this.agencyNo = agencyNo;
    }

    public String getAgencyNo() {
        return agencyNo;
    }

    public void setAgencyNo(String agencyNo) {
        this.agencyNo = agencyNo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
