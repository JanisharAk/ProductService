package com.example.ProductService.services;

import com.example.ProductService.models.Category;
import com.example.ProductService.models.Product;
import com.example.ProductService.repos.CategoryRepo;
import com.example.ProductService.repos.ProductRepo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Primary
@Service("SelfProductService")
public class ProductServiceImpl implements ProductService{
    private ProductRepo productRepo;
    private CategoryRepo categoryRepo;
    public ProductServiceImpl(ProductRepo productRepo, CategoryRepo categoryRepo){
        this.productRepo = productRepo;
        this.categoryRepo = categoryRepo;
    }

    @Override
    public Product getProductById(Long id) {
        /*
        Product product = this.productrepo.findById(id);
        Category category = product.getCategory();
         */
        Optional<Product> product = productRepo.findById(id);
        if(product.isPresent()) {
            return product.get();
        }
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        this.productRepo.findAll();
        return this.productRepo.findAll();
        //return null;
    }

    @Override
    public Product deleteProductById(Long id) {
        Optional<Product> product = this.productRepo.findById(id);
        return product.orElse(null);
    }

    @Override
    public Product  addProduct(Product product) {
//        Optional<Category> categoryOptional = this.categoryRepo.findByName(product.getCategory().getName());
//        if(categoryOptional.isPresent()){
//            product.setCategory(categoryOptional.get());
//        }
//        else{
//            Category category = categoryRepo.save(product.getCategory());
//            product.setCategory(category);
//        }
        return this.productRepo.save(product);
    }
/*
* C - save
* R - save
* U -  find by
* D - delete by
* */

    @Override
    public Product updateProductById(Long id) {
        return null;
//        Optional<Category> categoryOptional = this.categoryRepo.findByName(product.getCategory().getName());
//        if(categoryOptional.isPresent()){
//            product.setCategory(categoryOptional.get());
//        }
//        else{
//            Category category = categoryRepo.save(product.getCategory());
//            product.setCategory(category);
//        }

               //return this.productRepo.save(product);
   }

    //after interface we use implementation as for dependency inversion

}