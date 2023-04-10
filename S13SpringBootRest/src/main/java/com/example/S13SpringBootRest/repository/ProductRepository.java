package com.example.S13SpringBootRest.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.S13SpringBootRest.entity.Products;

public interface ProductRepository extends CrudRepository<Products,Integer>{
List<Products> findByName(String name);
List<Products> findByPrice(Double price);
List<Products> findByNameAndPrice(String name,Double price);
}
