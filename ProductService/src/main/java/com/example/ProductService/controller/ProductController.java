package com.example.ProductService.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController //ask spring to create object
@RequestMapping("/products")//common path
public class ProductController {
    @GetMapping("{Id}")    //here we can use also @getMapping("/products/{id}) but above is best
    public String getProductbyId(@PathVariable("id") Long id){//annotation will the link of the above id
        return "Product fetched with id: " +id;
    }

    @GetMapping()
    public List<Object> getAllProducts(){
            return Collections.emptyList();
        }
//    public String getProductCategory(String category)
//    }

}

/**
 * www.xyz.com/api/......
 * Endpoint is nothing but a combination of domain name + Path of Entity API
 */
/**
 * 1. GetProductById(Id)
 * 2. GetAllProducts
 * 3. UpdateProductById()
 * 4.DeleteProduct(Id)
 * 5. AddPrrodcut()
 * */
