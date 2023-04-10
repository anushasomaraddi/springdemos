//28march

package com.examples.S06SpringORMDemo.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.examples.S06SpringORMDemo.entity.Product;

@Component("productdao")
public class ProductDaoImpl implements ProductDao {
@Autowired
HibernateTemplate hibernateTemplate;

@Override
@Transactional
public int create(Product product) {
	Integer result=(Integer) hibernateTemplate.save(product);
	return result;
	
}

@Override
@Transactional
public void update(Product product) {
	// TODO Auto-generated method stub
	hibernateTemplate.update(product);
}

@Override
@Transactional
public void delete(Product product) {
	// TODO Auto-generated method stub
	hibernateTemplate.delete(product);
}

@Override
@Transactional
public Product find(int id) {
	// TODO Auto-generated method stub
	return  hibernateTemplate.get(Product.class,id);
	
}

@Override
@Transactional
public List<Product> findAll() {
	// TODO Auto-generated method stub
	return hibernateTemplate.loadAll(Product.class);
	
}


}
