package OneToMany.OneToMany.Controller;

import OneToMany.OneToMany.Entity.Product;
import OneToMany.OneToMany.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/savePosters")
    private String savePost(@RequestBody Product product) {
        productService.save(product);
        return "success ";
    }
    @PutMapping("/updated")
    private String update(@RequestBody Product product) {
        productService.update(product);
        return "updated ";
    }
    @DeleteMapping("/deleted/{id}")
    private String deleted(@PathVariable("id")Integer id){
        productService.deleted(id);
        return "deleted";
    }

}

