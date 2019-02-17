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
    public Product findById(Long l) {
        Optional<Product> productOptional = productRepository.findById(5L);

        if (!productOptional.isPresent()) {
            throw new RuntimeException("Recipe Not Found!");
        }

        return productOptional.get();
    }
}
