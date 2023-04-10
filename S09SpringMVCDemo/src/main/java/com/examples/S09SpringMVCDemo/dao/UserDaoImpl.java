package com.examples.S09SpringMVCDemo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.examples.S09SpringMVCDemo.entity.Users;
@Repository
public class UserDaoImpl implements UserDao{
private static final Class<Users> Users = null;
@Autowired
private HibernateTemplate hibernateTemplate;
	public int create(Users user){
		// TODO Auto-generated method stub
		int result=(int) hibernateTemplate.save(user);
		return result;
	}
	@Override
	public List<Users> findUsers() {
		// TODO Auto-generated method stub
		return hibernateTemplate.loadAll(Users.class);
	}
	@Override
	public Users findUser(String email) {
		// TODO Auto-generated method stub
		Users result=null;
		List<?>users=hibernateTemplate.find("from Users u where u.email=?0");
		if(users!=null && users.size()>0)
			result=(Users) users.get(0);
		return result;
		
		
	}

}
