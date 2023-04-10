package com.examples.S06SpringORMDemo.Dao;

import java.util.List;

import com.examples.S06SpringORMDemo.entity.Product;

public interface ProductDao {
int create(Product product);

void update(Product product);
void delete(Product product);
Product find(int id);
List<Product> findAll();

}
