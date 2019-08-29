package com.dbs.assignmentspringboot.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.dbs.assignmentspringboot.bean.User;
@Repository
public class UserDaoImpl implements IUserDao{

	ArrayList<User> userarray= new ArrayList<>();
	@Override
	public User insert(User user) {
		// TODO Auto-generated method stub
		userarray.add(user);
		return user;
	}

	@Override
	public ArrayList getAllUsers() {
		// TODO Auto-generated method stub
		return userarray;
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		userarray.add(user);
		return user;

	}

	@Override
	public User getUserById(int id) {
		System.out.println("heloooooo");
		// TODO Auto-generated method stub
		for(User i: userarray)
		{
			if(i.getId()==id)
				{
					return i;
				}
				
		}
		return null;
	}

}
