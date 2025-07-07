package com.example.ss1.repository;

import com.example.ss1.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository {
    void save(Product product);
    void update(Product product);
    void delete(Long id);
    Product findById(Long id);
    List<Product> findAll();

}
