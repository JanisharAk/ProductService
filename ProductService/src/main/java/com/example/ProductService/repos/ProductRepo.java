package com.example.ProductService.repos;

import com.example.ProductService.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {
    //Optional<Product> findById(Long id);
 // we commented lin 10 still its running fine because @Repository is handling it well
}
