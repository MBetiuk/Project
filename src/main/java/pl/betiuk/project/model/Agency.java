package pl.betiuk.project.model;

import javax.persistence.*;

@Entity
@Table
public class Agency {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToOne

    private String agencyNo;
    private String DM;
    private String AM;

    public Agency() {
    }

    public Agency(Long id, String agencyNo, String DM, String AM) {
        this.id = id;
        this.agencyNo = agencyNo;
        this.DM = DM;
        this.AM = AM;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAgencyNo() {
        return agencyNo;
    }

    public void setAgencyNo(String agencyNo) {
        this.agencyNo = agencyNo;
    }

    public String getDM() {
        return DM;
    }

    public void setDM(String DM) {
        this.DM = DM;
    }

    public String getAM() {
        return AM;
    }

    public void setAM(String AM) {
        this.AM = AM;
    }
}
