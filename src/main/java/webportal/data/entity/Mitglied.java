package webportal.data.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "mitglied")
public class Mitglied {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mitgliedId;

    @NotNull
    @Column(name = "vorname", nullable = false)
    private String vorname;

    @NotNull
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "alter", columnDefinition = "TEXT")
    private String alter;

    @Column(name = "adresse", columnDefinition = "TEXT")
    private String adresse;

    public Long getMitgliedId() {
        return mitgliedId;
    }

    public void setMitgliedId(Long wareId) {
        this.mitgliedId = wareId;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlter() {
        return alter;
    }

    public void setAlter(String amount) {
        this.alter = amount;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String price) {
        this.adresse = price;
    }
}


