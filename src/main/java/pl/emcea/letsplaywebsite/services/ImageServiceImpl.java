package pl.emcea.letsplaywebsite.services;

import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import pl.emcea.letsplaywebsite.models.Product;
import pl.emcea.letsplaywebsite.repositories.ProductRepository;

import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

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

    @Override
    public void loadImage(Byte[] image, HttpServletResponse response) throws IOException {
        if (image != null) {
            byte[] byteArray = new byte[image.length];
            int i = 0;
            for (Byte b : image) {
                byteArray[i++] = b;
            }
            response.setContentType("image/jpeg");
            InputStream is = new ByteArrayInputStream(byteArray);
            IOUtils.copy(is, response.getOutputStream());
        }
    }
}
