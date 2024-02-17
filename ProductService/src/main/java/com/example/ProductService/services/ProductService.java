package com.example.ProductService.services;
//import com.example.ProductService.services.ProductService;
import com.example.ProductService.exceptions.ProductNotFoundException;
import com.example.ProductService.models.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(Long id) throws ProductNotFoundException;
    List<Product> getAllProducts();
    Product deleteProductById(Long id);
    Product  addProduct(Product product);

    Product updateProductById(Long id) throws ProductNotFoundException;
}