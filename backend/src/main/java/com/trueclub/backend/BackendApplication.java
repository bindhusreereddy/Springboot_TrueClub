package com.trueclub.backend;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.trueclub.backend.entities.assignment;
import com.trueclub.backend.repo.UserRepository;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(BackendApplication.class, args);
		
	}

}
