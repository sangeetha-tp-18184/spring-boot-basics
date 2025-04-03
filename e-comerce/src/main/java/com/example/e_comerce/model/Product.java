package com.example.e_comerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import org.springframework.stereotype.Component;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Product
{
	@Id
	private int code;
	private int stock;
	private String name;
	private int price;
	private String description;
	private String category;

	public Product()
	{

	}

	public Product(int code, int stock, String name, int price, String description, String category)
	{
		this.code = code;
		this.stock = stock;
		this.name = name;
		this.price = price;
		this.description = description;
		this.category = category;
	}

	public int getCode()
	{
		return code;
	}

	public void setCode(int code)
	{
		this.code = code;
	}

	public int getStock()
	{
		return stock;
	}

	public void setStock(int stock)
	{
		this.stock = stock;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getPrice()
	{
		return price;
	}

	public void setPrice(int price)
	{
		this.price = price;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public String getCategory()
	{
		return category;
	}

	public void setCategory(String category)
	{
		this.category = category;
	}
}
