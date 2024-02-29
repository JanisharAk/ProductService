package com.example.ProductService.models;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Product extends BaseModel {
    private String title;
    private String description;
    private Long price;
    @ManyToOne(cascade = CascadeType.ALL)
    // relationship between product and category
    private Category category;

    /*
    1 Product - 1 Category
    1 Category - M Product
     */
}