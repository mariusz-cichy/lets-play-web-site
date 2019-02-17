package pl.emcea.letsplaywebsite.controllers;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import pl.emcea.letsplaywebsite.models.Product;
import pl.emcea.letsplaywebsite.services.ImageService;
import pl.emcea.letsplaywebsite.services.ProductService;

import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

@Controller
public class ImageController {

    private final ProductService productService;
    private final ImageService imageService;

    public ImageController(ProductService productService, ImageService imageService) {
        this.productService = productService;
        this.imageService = imageService;
    }

    @GetMapping("/image")
    public String image(){
        return "imagePage";
    }

    @GetMapping("product/{id}/productimage")
    public void renderImageFromDB(@PathVariable String id, HttpServletResponse response) throws IOException {
        Product product = productService.findById(Long.valueOf(id));

        if (product.getImage() != null) {
            byte[] byteArray = new byte[product.getImage().length];
            int i = 0;

            for (Byte wrappedByte : product.getImage()){
                byteArray[i++] = wrappedByte; //auto unboxing
            }

            response.setContentType("image/jpeg");
            InputStream is = new ByteArrayInputStream(byteArray);
            IOUtils.copy(is, response.getOutputStream());
        }
    }

    @GetMapping("/product/{id}/image")
    public String showUploadForm(@PathVariable String id, Model model){
//        model.addAttribute("product", productService.findCommandById(Long.valueOf(id)));

        return "/product/imageUploadFormPage";
    }

    @PostMapping("product/{id}/image")
    public String handleImagePost(@PathVariable String id, @RequestParam("imagefile") MultipartFile file){

        imageService.saveImageFile(Long.valueOf(id), file);
        System.out.println("--->>>");
        return "redirect:/product/1/image";
    }
}
