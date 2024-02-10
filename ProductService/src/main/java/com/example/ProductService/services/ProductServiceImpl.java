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
    public void deleteProductById() {

    }

    @Override
    public void addProduct() {

    }

    @Override
    public void updateProductById() {

    } //after interface we use implementation as for dependency inversion

}
