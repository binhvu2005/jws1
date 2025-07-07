package com.example.ss1.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "product")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String name;
    private Double price;

}
