package com.examples.S09SpringMVCDemo.service;

import java.util.List;

import com.examples.S09SpringMVCDemo.entity.Users;
import com.examples.S09SpringMVCDemo.exception.UserAlreadyExistsException;

public interface UserService {
int save(Users user) throws UserAlreadyExistsException;
List<Users> getUsers();
}
