package com.example.demo1.controller;


import com.example.demo1.model.Product;
import com.example.demo1.service.Productservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController
{
    @Autowired
    Productservice productservice;

    @GetMapping ("/products")
    public List<Product> getProducts()
    {
        return productservice.getProducts();
    }

    @GetMapping("/products/{productId}")
    public Product getProduct(@PathVariable int productId){ return  productservice.getProduct(productId);}

    @PostMapping ("/products")
    public void addProduct(@RequestBody Product product) {productservice.addProduct(product);}

    @PutMapping ("/products")
    public void updateProduct(@RequestBody Product product) {productservice.updateProduct(product);}

    @DeleteMapping ("/products/{productId}")
    public void deleteProduct(@PathVariable int productId) {productservice.deleteProduct(productId);}
}
