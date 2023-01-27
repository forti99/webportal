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
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "anzahl", columnDefinition = "TEXT")
    private String amount;

    @Column(name = "preis", columnDefinition = "TEXT")
    private String price;

    public Long getMitgliedId() {
        return mitgliedId;
    }

    public void setMitgliedId(Long wareId) {
        this.mitgliedId = wareId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}


