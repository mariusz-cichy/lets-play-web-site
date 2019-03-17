package pl.emcea.letsplaywebsite.services;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface ImageService {

    void saveImageFile(Long recipeId, MultipartFile file);
    void loadImage(Byte[] image, HttpServletResponse response) throws IOException;

}