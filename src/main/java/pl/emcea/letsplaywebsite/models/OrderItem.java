package pl.emcea.letsplaywebsite.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity(name = "order_items")
public class OrderItem {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @OneToOne(cascade = CascadeType.ALL)
    private Item item;
    @ManyToOne
    @JoinColumn(name="order_id", nullable=false)
    @JsonIgnore
    private Order order;
    private Integer buyPieces;
    private Integer stock_hire;

    public OrderItem() {

    }

    public OrderItem(Item item, Order order, Integer buyPieces, Integer stock_hire) {
        this.item = item;
        this.order = order;
        this.buyPieces = buyPieces;
        this.stock_hire = stock_hire;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Integer getBuyPieces() {
        return buyPieces;
    }

    public void setBuyPieces(Integer buyPieces) {
        this.buyPieces = buyPieces;
    }

    public Integer getStock_hire() {
        return stock_hire;
    }

    public void setStock_hire(Integer stock_hire) {
        this.stock_hire = stock_hire;
    }
}
