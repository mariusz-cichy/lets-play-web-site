package pl.emcea.letsplaywebsite.controllers;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import pl.emcea.letsplaywebsite.services.ImageService;
import pl.emcea.letsplaywebsite.services.ProductService;

@Controller
public class ImageController {

    private final ProductService productService;
    private final ImageService imageService;

    public ImageController(ProductService productService, ImageService imageService) {
        this.productService = productService;
        this.imageService = imageService;
    }

    @GetMapping("/product/{id}/image")
    public String showUploadForm(@PathVariable String id, Model model){
        System.out.println("1: id="+id);
        model.addAttribute("product", productService.findById(Long.valueOf(id)));

        return "/product/imageUploadFormPage";
    }


    @GetMapping("/product/all")
    public String showAllProducts(Model model){
        model.addAttribute("products", productService.findAll());

        return "/product/showAllProducts";
    }

    @PostMapping("product/{id}/image")
    public String handleImagePost(@PathVariable String id, @RequestParam("imagefile") MultipartFile file){

        imageService.saveImageFile(Long.valueOf(id), file);
        System.out.println("2: id="+id);
        return "redirect:/product/"+id+"/image";
    }
}
