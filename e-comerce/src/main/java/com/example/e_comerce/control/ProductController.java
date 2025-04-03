package com.example.e_comerce.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.e_comerce.model.Product;
import com.example.e_comerce.service.ProductService;

@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class ProductController
{
	@Autowired
	ProductService service;

	@GetMapping("/")
	public String home(){return "hello world !!!";}


	@GetMapping("/products")
	public List<Product> getProducts(){return service.getProducts();}

	@GetMapping("/products/{code}")
	private Product getProduct(@PathVariable int code){
		return  service.getProduct(code);
	}

	@PostMapping("/products")
	public void addProduct(@RequestBody Product product) {service.addProduct(product);}


}
