package pl.emcea.letsplaywebsite.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import pl.emcea.letsplaywebsite.models.Product;
import pl.emcea.letsplaywebsite.repositories.ProductRepository;

import javax.transaction.Transactional;
import java.io.IOException;

@Slf4j
@Service
public class ImageServiceImpl implements ImageService {

    private final ProductRepository productRepository;

    public ImageServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    @Transactional
    public void saveImageFile(Long productId, MultipartFile file) {

        try {
            Product product = productRepository.findById(productId).get();

            Byte[] byteObjects = new Byte[file.getBytes().length];

            int i = 0;

            for (byte b : file.getBytes()) {
                byteObjects[i++] = b;
            }

            product.setImage(byteObjects);

            productRepository.save(product);
        } catch (IOException e) {
            log.error("Error occurred", e);
            e.printStackTrace();
        }
    }
}
