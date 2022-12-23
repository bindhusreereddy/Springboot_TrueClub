package com.trueclub.backend.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.trueclub.backend.entities.assignment;
import com.trueclub.backend.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService uService;
	
	//get the users
	@GetMapping("/users")
	public Iterable<assignment> getUsers()
	{
		return uService.getUsers();
	}
	
	//get single user by id
	@GetMapping("/users/{id}")
	public assignment getUser(@PathVariable Integer id) {
		return uService.getSingleUser(id);
	}
	
	//insert the new user using post
	@PostMapping("/users")
	public assignment saveUser(@RequestBody assignment user) {
		return uService.saveUser(user);
	}
	
	//update the user using put
	@PutMapping("/users/{id}")
	public assignment updateUser(@PathVariable Integer id, @RequestBody assignment user) {
		user.setId(id);
		return uService.updateUser(user);
				
	}
	
	//delete the user 
	@DeleteMapping("/users/{id}")
	public void deleteUser(@RequestParam Integer id) {
		
		uService.deleteUser(id);	
	}
}

