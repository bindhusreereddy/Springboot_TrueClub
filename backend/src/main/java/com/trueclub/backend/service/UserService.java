package com.trueclub.backend.service;


import com.trueclub.backend.entities.assignment;

public interface UserService {

	Iterable<assignment> getUsers();
	
	assignment saveUser(assignment user);
	
	assignment getSingleUser(Integer id);
	
	void deleteUser(Integer id);

	assignment updateUser(assignment user);
	
}
