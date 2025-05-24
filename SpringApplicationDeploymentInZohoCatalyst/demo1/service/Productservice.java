package com.example.demo1.service;

import com.example.demo1.model.Product;
import com.example.demo1.repo.ProductRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Productservice
{
    @Autowired
    ProductRepo repo;

    public List<Product> getProducts()
    {
        return repo.findAll();
    }
    public Product getProduct(int name)
    {
        //repo.findById(name);
        return repo.getReferenceById(name);
    }

    public void addProduct(Product product) {repo.save(product);}

    public void updateProduct(Product product)
    {
        repo.save(product);
    }
    public void deleteProduct(int code)
    {
        repo.deleteById(code);
    }

}
