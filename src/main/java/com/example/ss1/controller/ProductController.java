package com.example.ss1.controller;

import com.example.ss1.entity.Product;
import com.example.ss1.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public String list(Model model) {
        model.addAttribute("products", productRepository.findAll());
        return "productList";
    }


    @PostMapping("/create")
    public String create(@ModelAttribute Product product) {
        productRepository.save(product);
        return "redirect:/products";
    }


    @PostMapping("/edit")
    public String update(@ModelAttribute Product product) {
        productRepository.update(product);
        return "redirect:/products";
    }


    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        productRepository.delete(id);
        return "redirect:/products";
    }
}
