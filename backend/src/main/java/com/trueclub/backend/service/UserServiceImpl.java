package com.trueclub.backend.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trueclub.backend.entities.assignment;
import com.trueclub.backend.repo.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository uRepo;
	
	@Override
	public Iterable<assignment> getUsers()
	{
		return uRepo.findAll();
	}
	
	@Override
	public assignment saveUser(assignment user) {
		return uRepo.save(user);
	}
	
	@Override
	public assignment getSingleUser(Integer id) {
		Optional<assignment> user = uRepo.findById(id);
		if(user.isPresent()) {
			return user.get();
		}
		throw new RuntimeException("User is not found for the id "+id);
		
	}

	@Override
	public void deleteUser(Integer id) {
		uRepo.deleteById(id);
		
	}

	@Override
	public assignment updateUser(assignment user) {
		
		return uRepo.save(user);
	}
	
	
}
