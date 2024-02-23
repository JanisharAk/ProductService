package com.example.ProductService.services;

import com.example.ProductService.models.Category;
import com.example.ProductService.models.Product;
import com.example.ProductService.repos.ProductRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("SelfProductService")
public class ProductServiceImpl implements ProductService{
    private ProductRepo productRepo;
    public ProductServiceImpl(ProductRepo productRepo)
    {
        this.productRepo = productRepo;
    }
    @Override
    public Product getProductById(Long id) {
        Optional<Product> product = this.productRepo.findById(id);
//        if(product.isPresent()){
//            Category category = product.get().getCategory();
//        }
        return product.get();
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