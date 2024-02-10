package com.example.ProductService.controller;

import com.example.ProductService.ProductServiceApplication;
import com.example.ProductService.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController //ask spring to create object
@RequestMapping("/products/")//common path
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(@Qualifier("FakeProductService") ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("{id}")    //here we can use also @getMapping("/products/{id}) but above is best
    public String getProductbyId(@PathVariable("id") Long id) {//annotation will the link of the above id
        return productService.getProductById(id);
    }

    @GetMapping()

    public List<Object> getAllProducts() {
        return Collections.emptyList();
    }
//    public String getProductCategory(String category)
//    }

}

/**
 * www.xyz.com/api/......
 * Endpoint is nothing but a combination of domain name + Path of Entity API
 * <p>
 * 1. GetProductById(Id)
 * 2. GetAllProducts
 * 3. UpdateProductById()
 * 4.DeleteProduct(Id)
 * 5. AddPrrodcut()
 * <p>
 * constructor injection
 * field injection
 * setter injection
 * above three are three types of injetion
 */
/**
 * 1. GetProductById(Id)
 * 2. GetAllProducts
 * 3. UpdateProductById()
 * 4.DeleteProduct(Id)
 * 5. AddPrrodcut()
 * */
/**
 * constructor injection
 * field injection
 * setter injection
 * above three are three types of injetion
 */