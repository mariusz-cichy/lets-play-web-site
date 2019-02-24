package pl.emcea.letsplaywebsite.services;

import org.springframework.stereotype.Service;
import pl.emcea.letsplaywebsite.models.Product;
import pl.emcea.letsplaywebsite.repositories.ProductRepository;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product findById(Long id) {
        Optional<Product> productOptional = productRepository.findById(id);

        if (!productOptional.isPresent()) {
            Product product = new Product(id,"To be added", null);
            productRepository.save(product);
            return product;
        }

        return productOptional.get();
    }
}
