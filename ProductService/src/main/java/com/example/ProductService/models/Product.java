package com.example.ProductService.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Getter
@Setter


public class Product extends BaseModel {
    private Long id; //wrapper class
    private String title;
    private String desc;
    private Long price;
    private Category category;

}
