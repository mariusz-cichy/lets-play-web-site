package pl.emcea.letsplaywebsite.models;

import javax.persistence.*;

@Entity(name = "items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Lob
    private Byte[] image;
    private String celebrations;
    private String name;
    private String description;
    @Lob
    private String details;
    private Double buy;
    private Double hire;
    private Integer stock_buy;
    private Integer stock_hire;

    public Item(Byte[] image, String celebrations, String name, String description, String details, Double buy, Double hire, Integer stock_buy, Integer stock_hire) {
        this.image = image;
        this.celebrations = celebrations;
        this.name = name;
        this.description = description;
        this.details = details;
        this.buy = buy;
        this.hire = hire;
        this.stock_buy = stock_buy;
        this.stock_hire = stock_hire;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte[] getImage() {
        return image;
    }

    public void setImage(Byte[] image) {
        this.image = image;
    }

    public String getCelebrations() {
        return celebrations;
    }

    public void setCelebrations(String celebrations) {
        this.celebrations = celebrations;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Double getBuy() {
        return buy;
    }

    public void setBuy(Double buy) {
        this.buy = buy;
    }

    public Double getHire() {
        return hire;
    }

    public void setHire(Double hire) {
        this.hire = hire;
    }

    public Integer getStock_buy() {
        return stock_buy;
    }

    public void setStock_buy(Integer stock_buy) {
        this.stock_buy = stock_buy;
    }

    public Integer getStock_hire() {
        return stock_hire;
    }

    public void setStock_hire(Integer stock_hire) {
        this.stock_hire = stock_hire;
    }
}
