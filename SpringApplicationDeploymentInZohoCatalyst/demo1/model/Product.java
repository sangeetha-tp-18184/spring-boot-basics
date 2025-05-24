package com.example.demo1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Product
{
    private String name;
    private int price;
    private int stock;
    @Id
    private int code;

    public Product(int code,String name, int price, int stock)
    {
        this.code = code;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public Product()
    {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", code=" + code +
                '}';
    }
}
