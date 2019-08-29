package com.dbs.assignmentspringboot.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.dbs.assignmentspringboot.bean.User;


public interface IUserDao {

	User insert(User user);
	ArrayList getAllUsers();
	User updateUser(User user);
	User getUserById(int id);
}
