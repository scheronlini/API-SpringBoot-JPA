package br.com.scheronlini.APISpringBootJPA.resources;

import br.com.scheronlini.APISpringBootJPA.entities.Product;
import br.com.scheronlini.APISpringBootJPA.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> findAll(){
       List <Product> products= productService.findAll();
       return ResponseEntity.ok().body(products);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id){
        var product = productService.findById(id);
        return ResponseEntity.ok().body(product);
    }
}
