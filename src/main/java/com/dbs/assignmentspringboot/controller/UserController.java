package com.dbs.assignmentspringboot.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.assignmentspringboot.bean.User;
import com.dbs.assignmentspringboot.dao.IUserDao;
import com.dbs.assignmentspringboot.dao.UserDaoImpl;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	IUserDao daoObj; 
	 
	@GetMapping("/test")
	public String test()
	{
		return "in test";
	}
	@PostMapping("/insertrec")
	public User insert(@RequestBody User localUser)
	{
		System.out.println("in insert controller");
		
		return daoObj.insert(localUser);
		
	}
	@PutMapping("/update/{id}/{name}")
	public User update(@PathVariable int id, @PathVariable String name)
	{
		//localUser.setId(id);
		//localUser.setName(name);
		return null;//daoObj.updateUser(localUser);
		
	}
	@GetMapping("/users/{id}")
	public User getUserById(@PathVariable int id)
	{
		System.out.println("wwwwwwwwww");
		return daoObj.getUserById(id);
		
	}
	@GetMapping("/getAll")
	public ArrayList<User> getAll()
	{
		System.out.println("hiiiii");
		return daoObj.getAllUsers();
		
	}
	
}
