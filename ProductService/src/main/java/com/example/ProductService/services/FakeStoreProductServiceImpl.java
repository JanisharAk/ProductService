package com.example.ProductService.services;

import com.example.ProductService.dtos.FakeStoreProductDto;
import com.example.ProductService.exceptions.ProductNotFoundException;
import com.example.ProductService.models.Category;
import com.example.ProductService.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.LinkedList;
import java.util.List;
@Service
@Qualifier("FakeProductService")
public class FakeStoreProductServiceImpl implements ProductService {
    //to connet with third party we need url
    private  RestTemplateBuilder restTemplateBuilder;
    private  String specificProductUrl= "https://fakestoreapi.com/products/{id}";
    private String genericProductUrl = "https://fakestoreapi.com/products/";
    @Autowired
    public FakeStoreProductServiceImpl(RestTemplateBuilder restTemplateBuilder){
        this.restTemplateBuilder = restTemplateBuilder;
    }

//    @Override
//    // heere we will get the data in the form of string
//    public String getProductById(Long id) {
//        String url = getProductUrl + id;
//        RestTemplate restTemplate = restTemplateBuilder.build();
//        ResponseEntity<String> responseEntity = restTemplate.getForEntity(getProductUrl, String.class);
//        return "Product fetched from fake service, Id: " + responseEntity.getBody();
//    }
@Override
// heere we will get the data in the form of string
public Product getProductById(Long id) throws ProductNotFoundException {
    //String url = getProductUrl + id;
    RestTemplate restTemplate = restTemplateBuilder.build();
    ResponseEntity<FakeStoreProductDto> responseEntity =
            restTemplate.getForEntity(specificProductUrl, FakeStoreProductDto.class, id);
    if(responseEntity.getBody()==null){
        //through excpetion
        throw new ProductNotFoundException("Product not found for id: "+id);
    }
    return getProductFromFakeStoreProductDto(responseEntity.getBody());
}

    @Override
    public List<Product> getAllProducts() {
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductDto[]> responseEntity = restTemplate.getForEntity(genericProductUrl, FakeStoreProductDto[].class);
        List<Product> productList = new LinkedList<>();
        for(FakeStoreProductDto fakeStoreProductDto: responseEntity.getBody()){
            productList.add(getProductFromFakeStoreProductDto(fakeStoreProductDto));
        }
        return productList;
    }

    @Override
    public void deleteProductById() {

    }

    @Override
    public void addProduct() {

    }

    @Override
    public void updateProductById() {

    }
    private Product getProductFromFakeStoreProductDto(FakeStoreProductDto fakeStoreProductDto){
        Product product = new Product();
        product.setId(fakeStoreProductDto.getId());
        product.setTitle(fakeStoreProductDto.getTitle());
        product.setDesc(fakeStoreProductDto.getDescription());
        Category category = new Category();
        category.setName(fakeStoreProductDto.getCategory());
        product.setCategory(category);
        product.setPrice(fakeStoreProductDto.getPrice());
        return product;

    }
}
