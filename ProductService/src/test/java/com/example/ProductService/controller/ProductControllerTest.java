package com.example.ProductService.controller;

import com.example.ProductService.exceptions.ProductNotFoundException;
import com.example.ProductService.models.Product;
import com.example.ProductService.services.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;


@SpringBootTest
class ProductControllerTest {
    @Autowired
    //@InjectMock
    private ProductController productController;

    @MockBean
    //@Mock
    private ProductService productService;

//    @BeforeEach // set up function runs with every function
//    void setUp() {
//        MockitoAnnotations.initMocks(this);
//    }
//      @Test
//       void getProductByIdThrowsException() throws ProductNotFoundException {
//        Product dummy =  new Product();
//        dummy.setId(1L);
//        dummy.setTitle("dummy");
//        when(productService.getProductById(1L)).thenThrow(new ProductNotFoundException("Prodcut Not Found"));
//        Product p = productController.getProductbyId(1L);
//
//        //Assert
//        assertEquals(1L, p.getId());
//
//            assertThrows(ProductNotFoundException.class, ()-> productController.getProductbyId(1L));
//
//      }


}
