package com.example.inventoryservice2.web;

import com.example.inventoryservice2.entities.Products;
import com.example.inventoryservice2.repositories.ProductRespositories;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Dell Latitude 5420
 * IFRAH ADNAN
 **/
@RestController
@RequestMapping("/api")

public class ProductsRestController {



    private ProductRespositories productRespositories;
    public ProductsRestController(ProductRespositories productRespositories) {
        this.productRespositories = productRespositories;
    }

    @GetMapping("/product")
    public List<Products> allProducts(){
        return productRespositories.findAll();
    }
    @GetMapping("/product/{id}")
    public Products getProductById(@PathVariable String id){
        return productRespositories.findById(id).orElseThrow();
    }


}
