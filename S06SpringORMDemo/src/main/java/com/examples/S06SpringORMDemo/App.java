package com.examples.S06SpringORMDemo;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.examples.S06SpringORMDemo.Dao.ProductDao;
import com.examples.S06SpringORMDemo.entity.Product;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        create();
//    	delete();
    	//update();
    	find();
    }

	private static void create() {
		System.out.println( "Hello World!" );
    	
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/examples/S06SpringORMDemo/springconfig.xml");
	ProductDao productDao=(ProductDao) ctx.getBean("productdao");
	Product product =new Product();
	product.setId(2);
	product.setDescription("desktop computer");
	product.setName("Computer");
	product.setPrice(75554.7);
	int result=productDao.create(product);
	System.out.println("Product created"+result);
	}
	
	private static void delete() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/examples/S06SpringORMDemo/springconfig.xml");
		ProductDao productDao=(ProductDao) ctx.getBean("productdao");
		Product product =new Product();
		product.setId(2);
//		product.setDescription("desktop computer");
//		product.setName("Computer");
//		product.setPrice(7984.7);
		
		productDao.delete(product);
		System.out.println("product deleted");
	}
	private static void update() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/examples/S06SpringORMDemo/springconfig.xml");
		ProductDao productDao=(ProductDao) ctx.getBean("productdao");
		
		Product product =new Product();
		product.setId(1);
		product.setDescription("home computer");
		product.setName("Computer");
		product.setPrice(666.7);
	     productDao.update(product);
		System.out.println("Product updated");
	}
	private static void find() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/examples/S06SpringORMDemo/springconfig.xml");
		ProductDao productDao=(ProductDao) ctx.getBean("productdao");
		Product product =productDao.find(3);
		System.out.println("Product found-"+product);
	}
	private static void findAll() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/examples/S06SpringORMDemo/springconfig.xml");
		ProductDao productDao=(ProductDao) ctx.getBean("productdao");
List<Product> products=productDao.findAll();
System.out.println("Product found-"+products);
	}
}
