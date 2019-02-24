package pl.emcea.letsplaywebsite.models;

import javax.persistence.*;

@Entity(name="products")
public class Product {
    @Id
    private Long id;

    private String name;

    @Lob
    private Byte[] image;

    public Product() {
    }

    public Product(String name, Byte[] image) {
        this.name = name;
        this.image = image;
    }

    public Product(Long id, String name, Byte[] image) {
        this.id = id;
        this.name = name;
        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte[] getImage() {
        return image;
    }

    public void setImage(Byte[] image) {
        this.image = image;
    }
}
