package com.example.ProductService.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductDto {
    private Long id; //wrapper class
    private String title;
    private String description;
    private Long price;
    private String category;

}

/**
 * ObjectMapper -  map the json map to an object
 */