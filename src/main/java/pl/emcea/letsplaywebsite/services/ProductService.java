package pl.emcea.letsplaywebsite.services;

import pl.emcea.letsplaywebsite.models.Product;

import java.util.List;

public interface ProductService {

    Product findById(Long l);
    List<Product> findAll();

}
