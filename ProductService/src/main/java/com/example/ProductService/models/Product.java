package com.example.ProductService.models;

public class Product extends BaseModel {
    private Long id; //wrapper class
    private String title;
    private String desc;
    private Long price;
    private Category category;

}
