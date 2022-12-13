package webportal.data.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "ware")
public class Ware {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long wareId;

    @NotNull
    @Column(name = "warenname", nullable = false)
    private String name;

    @Column(name = "anzahl", columnDefinition = "TEXT")
    private String amount;

    @Column(name = "preis", columnDefinition = "TEXT")
    private String price;

    public Long getWareId() {
        return wareId;
    }

    public void setWareId(Long wareId) {
        this.wareId = wareId;
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


