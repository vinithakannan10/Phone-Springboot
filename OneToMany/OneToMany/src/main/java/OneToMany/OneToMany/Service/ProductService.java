package OneToMany.OneToMany.Service;
import OneToMany.OneToMany.Entity.Product;
import OneToMany.OneToMany.Entity.OutputProduct;
import OneToMany.OneToMany.Entity.RawMaterial;
import OneToMany.OneToMany.Repository.ProductRepository;
import OneToMany.OneToMany.Repository.OutputProductRepository;
import OneToMany.OneToMany.Repository.RawMaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private RawMaterialRepository rawMaterialRepository;
    @Autowired
    private OutputProductRepository outputProductRepository;

    public String save(Product product) {
        Date date = new Date();
        product.setCreatedOn(date);
        productRepository.save(product);
        for (RawMaterial obj : product.getRawMaterial()) {
            obj.setProduct(product);
            rawMaterialRepository.saveAndFlush(obj);
        }
        for (OutputProduct i : product.getOutputProduct()) {
            i.setProduct(product);
            outputProductRepository.saveAndFlush(i);
        }
        return "success";
    }

    public String update(Product product) {
        Date date = new Date();
        product.setUpdateOn(date);
        product.setCreatedOn(date);
        productRepository.save(product);
        for (RawMaterial obj : product.getRawMaterial()) {
            obj.setProduct(product);
            rawMaterialRepository.saveAndFlush(obj);
        }
        for (OutputProduct i : product.getOutputProduct()) {
            i.setProduct(product);
            outputProductRepository.saveAndFlush(i);
        }
        return "updated";
    }
    public void deleted(Integer id) {
        if (id != null) {
            Optional<Product> productObj = productRepository.findById(id);
            Product obj = productObj.get();
            obj.setDeletedBy("vini");
            obj.setDeletedOn(new Date());
            productRepository.saveAndFlush(obj);
        }
    }
}











