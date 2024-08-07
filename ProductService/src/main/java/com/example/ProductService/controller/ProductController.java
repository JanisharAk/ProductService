package com.example.ProductService.controller;

import com.example.ProductService.dtos.ExceptionDto;
import com.example.ProductService.exceptions.ProductNotFoundException;
import com.example.ProductService.models.Product;
import com.example.ProductService.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController //ask spring to create object
@RequestMapping("/products/")//common path
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(@Qualifier("SelfProductService") ProductService productService) {
        this.productService = productService;

    }

    @GetMapping("/{id}")    //here we can use also @getMapping("/products/{id}) but above is best
    public Product getProductbyId(@PathVariable("id") Long id) throws ProductNotFoundException {//annotation will the link of the above id
        //return productService.getProductById(id);
        Product p = productService.getProductById(id);
        //p.setId(2L);
        return p;
    }

    @GetMapping()
    public List<Product> getAllProducts() {

        return productService.getAllProducts();
    }
    @PostMapping("/create")
    public Product createProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

    @DeleteMapping("/{id}")    //here we can use also @getMapping("/products/{id}) but above is best
    public void deleteProductbyId(@PathVariable("id") Long id) throws ProductNotFoundException {//annotation will the link of the above id
         productService.deleteProductById(id);
    }

    @PutMapping("/{id}")    //here we can use also @PutMapping("/products/{id}) but above is best
    public Product updateProductbyId(@PathVariable("id") Long id, @RequestBody Product product) throws ProductNotFoundException {//annotation will the link of the above id
        return productService.updateProductById(id);
    }

//    public String getProductCategory(String category)
//    }
//    @ExceptionHandler(ProductNotFoundException.class)
//    //@ResponseStatus(HttpStatus.NOT_FOUND) // we can use this annotation
//   // @ResponseBody
//    private ResponseEntity<ExceptionDto> handleProductNotFoundException(ProductNotFoundException e){
//        ExceptionDto exceptionDto = new ExceptionDto();
//        exceptionDto.setMessage(e.getMessage());
//        exceptionDto.setStatus("Failure");
//        ResponseEntity<ExceptionDto> responseEntity = new ResponseEntity<>(exceptionDto, HttpStatus.NOT_FOUND);
//        return  responseEntity;
//    }

    // @ExceptionHandler(ProductNotFoundException.class)
//    //@ResponseStatus(HttpStatus.NOT_FOUND) // we can use this annotation
//   // @ResponseBody
//    private ExceptionDto handleProductNotFoundException(ProductNotFoundException e){
//        ExceptionDto = new ExceptionDto();
//        exceptionDto.setMessage(e.getMessage());
//        exceptionDto.setStatus("Failure");
//        return  responseEntity;
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