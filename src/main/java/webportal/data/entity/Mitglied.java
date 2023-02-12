package webportal.data.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "mitglied")
public class Mitglied {
    @Id
    @Column(name = "mitgliedId", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mitgliedId;

    @NotNull
    @Column(name = "vorname", nullable = false)
    private String vorname;

    @NotNull
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "adresse")
    private String adresse;

    @Column(name = "alter")
    private Integer alter;

    @Column(name = "beitrag")
    private Double beitrag;

    @Column(name = "eintrittsalter")
    private Integer eintrittsalter;

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

    public Integer getAlter() {
        return alter;
    }

    public void setAlter(Integer alter) {
        this.alter = alter;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Double getBeitrag() {
        return beitrag;
    }

    public void setBeitrag(Double beitrag) {
        this.beitrag = beitrag;
    }

    public Integer getEintrittsalter() {
        return eintrittsalter;
    }

    public void setEintrittsalter(Integer eintrittsalter) {
        this.eintrittsalter = eintrittsalter;
    }
}


