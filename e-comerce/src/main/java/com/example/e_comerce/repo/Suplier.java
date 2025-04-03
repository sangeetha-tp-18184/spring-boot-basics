package com.example.e_comerce.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.e_comerce.model.Product;

@Repository

public interface Suplier extends JpaRepository<Product,Integer>
{
}
