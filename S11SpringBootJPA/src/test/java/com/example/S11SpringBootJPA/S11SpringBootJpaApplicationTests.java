package com.example.S11SpringBootJPA;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.example.S11SpringBootJPA.repository.ProductRepository;
import com.example.S11SpringBootJPA.entity.Products;




@SpringBootTest
class S11SpringBootJpaApplicationTests {
@Autowired
ApplicationContext context;
	@Test
	void contextLoads() {
	}
//@Test
	void createProduct() {
		Products product=new Products();
		product.setName("laptop");
		product.setDesc("Dell laptop");
		product.setPrice(62000);
		
		ProductRepository prodrepo=context.getBean(ProductRepository.class);
		prodrepo.save(product);
	}
	
//	@Test
	void readProduct() {
		
		
		ProductRepository prodrepo=context.getBean(ProductRepository.class);
		Optional<Products> optionalProduct=prodrepo.findById(1);
		if(optionalProduct.isPresent()) {
			Products product=optionalProduct.get();
			System.out.println(product);
			
			
		}else {
			System.out.println("Product not present in db");
		}
	}
//	@Test
	void updateProduct() {
		
		
		ProductRepository prodrepo=context.getBean(ProductRepository.class);
		Optional<Products> optionalProduct=prodrepo.findById(1);
		if(optionalProduct.isPresent()) {
			Products product=optionalProduct.get();
			System.out.println(product);
			product.setPrice(10000);
			prodrepo.save(product);
			
		}else {
			System.out.println("Product not present in db");
		}
	}
//	@Test
	void readAllProducts() {
		
		
		ProductRepository prodrepo=context.getBean(ProductRepository.class);
		List<Products>products=(List<Products>)prodrepo.findAll();
		System.out.println(products);
			
	}
}
