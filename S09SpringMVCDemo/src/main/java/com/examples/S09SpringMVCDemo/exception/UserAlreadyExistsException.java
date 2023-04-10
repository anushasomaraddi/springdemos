package com.examples.S09SpringMVCDemo.exception;

public class UserAlreadyExistsException extends Exception {
private static final long serialVersionUID=1L;
public UserAlreadyExistsException(String email) {
	super("User already exists"+email);
}
}
