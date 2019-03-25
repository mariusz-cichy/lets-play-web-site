package pl.emcea.letsplaywebsite.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity(name = "basket_items")
public class BasketItem {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @ManyToOne
    @JoinColumn(name="customer_id", nullable=false)
    @JsonIgnore
    private Customer customerId;
    @ManyToOne
    @JoinColumn(name="item_id", nullable=false)
    @JsonIgnore
    private Item itemId;
    private Integer stock_buy;
    private Integer stock_hire;

    public BasketItem() {
    }

    public BasketItem(Customer customerId, Item itemId, Integer stock_buy, Integer stock_hire) {
        this.customerId = customerId;
        this.itemId = itemId;
        this.stock_buy = stock_buy;
        this.stock_hire = stock_hire;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public Item getItemId() {
        return itemId;
    }

    public void setItemId(Item itemId) {
        this.itemId = itemId;
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
