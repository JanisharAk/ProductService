package com.example.ProductService.security.service;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
//    private RestTemplate restTemplate;
//
//    public AuthenticationService(RestTemplate restTemplate) {
//        this.restTemplate = restTemplate;
//    }
//
//    public boolean authenticate(String token) {
//        ResponseEntity<User> userResponseEntity = restTemplate.postForEntity(("http://localhost:9000/users/validate/" + token),
//                null, User.class);
//        if (userResponseEntity.getBody() != null) {
//            return true;
//        }
//        return false;
//    }
/*
 Client ---> User Service (Auth Server)
 Token ---> Client
 Client ---> Product Service with Token ---> UserService /validate
 */
}