package com.example.S13SpringBootRest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Products {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int  id;
@Column(name="description")
private String desc;
private double price;
private String name;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getDesc() {
	return desc;
}
public void setDesc(String desc) {
	this.desc = desc;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Products [id=" + id + ", desc=" + desc + ", price=" + price + ", name=" + name + "]";
}

}
