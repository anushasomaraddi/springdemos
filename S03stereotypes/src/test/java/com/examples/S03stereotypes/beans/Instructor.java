package com.examples.S03stereotypes.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Instructor {
	@Value("12")
private int id;
	@Value("MAx")
private String name;
	@Autowired
	private Address homeaddress;

@Override
public String toString() {
	return "Instructor [id=" + id + ", name=" + name + ", homeaddress=" + homeaddress + "]";
}

}
