package com.example.ProductService.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Service
@Qualifier("FakeProductService")
public class FakeStoreProductServiceImpl implements ProductService {
    //to connet with third party we need url
    private final RestTemplateBuilder restTemplateBuilder;
    private final String getProductUrl= "https://fakestoreapi.com/products/";
    @Autowired
    public FakeStoreProductServiceImpl(RestTemplateBuilder restTemplateBuilder){
        this.restTemplateBuilder = restTemplateBuilder;
    }

    @Override
    public String getProductById(Long id) {
        String url = getProductUrl + id;
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(getProductUrl, String.class);
        return "Product fetched from fake service, Id: " + responseEntity.getBody();
    }

    @Override
    public List<String> getAllProducts() {
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

    }
}
