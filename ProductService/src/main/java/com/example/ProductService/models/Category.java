package com.example.ProductService.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@Entity

//@JsonIgnoreProperties(ignoreUnknown = true)
public class Category extends BaseModel{
    private String name;
    @JsonIgnore //we have used cardinality in category and product so it creates infinite recursion
    // so  breaks infinite loops we use JsonIgnore

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "category")
    private List<Product> products;
}


/*
Get Category by Id
Get Category by Id Join Product where category id - id
1500 categories
500 million items

Category and Product
to fetch a category by id
in Eager Loading
1. Get category then run another query to get all product by category id
2. Use Join to get in one query


First option should be used when immediate operation on Product
Category category = findCategoryById()
// operation on product
 */
