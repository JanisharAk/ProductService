package com.example.ProductService.inheritancedemo.tableperclass;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity(name = "tpc_student")
public class Student extends User {
    private int psp;
    private String batch;
}