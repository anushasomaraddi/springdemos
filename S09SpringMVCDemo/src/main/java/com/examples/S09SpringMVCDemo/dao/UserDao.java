package com.examples.S09SpringMVCDemo.dao;

import java.util.List;

import com.examples.S09SpringMVCDemo.entity.Users;

public interface UserDao {


int create(Users user);
List<Users> findUsers();
Users findUser(String email);
}
