package com.examples.S09SpringMVCDemo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.examples.S09SpringMVCDemo.dao.UserDaoImpl;
import com.examples.S09SpringMVCDemo.dao.UserDao;
import com.examples.S09SpringMVCDemo.entity.Users;
import com.examples.S09SpringMVCDemo.exception.UserAlreadyExistsException;
@Service
public class UserServiceImpl implements UserService{
@Autowired
private UserDao userdao;
@Transactional
	public int save(Users user) throws UserAlreadyExistsException{
    if(userdao.findUser(user.getEmail())!=null) {
    	throw new UserAlreadyExistsException(user.getEmail());
    	
    }
	
	return userdao.create(user);
	}
@Override
public List<Users> getUsers() {
	// TODO Auto-generated method stub
	return userdao.findUsers();
}

}
