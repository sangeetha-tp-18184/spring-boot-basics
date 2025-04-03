package com.example.e_comerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.e_comerce.model.Product;
import com.example.e_comerce.repo.Suplier;

@Service
public class ProductService
{
	@Autowired
	Suplier repo;

	public List<Product> getProducts() {return repo.findAll();}

	public void addProduct(Product product){ repo.save(product);}

	public Product getProduct(int code){ return  repo.findById(code).orElse(new Product());}
}
