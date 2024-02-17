package com.example.ProductService.services;

import com.example.ProductService.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService{
    @Override
    public Product getProductById(Long id) {

        return null;
    }

    @Override
    public List<Product> getAllProducts() {

        return null;
    }

    @Override
    public Product deleteProductById(Long id) {

        return null;
    }

    @Override
    public Product  addProduct(Product product) {
        return null;

    }



    @Override
    public Product updateProductById(Long id) {
        return null;

    } //after interface we use implementation as for dependency inversion

}