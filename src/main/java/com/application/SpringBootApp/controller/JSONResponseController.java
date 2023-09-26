package com.application.SpringBootApp.controller;

import java.util.Random;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.application.SpringBootApp.dto.User;
import com.google.gson.Gson;

@RestController
public class JSONResponseController {
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, path = "/getUser", produces = MediaType.APPLICATION_JSON_VALUE)
	public User getUserDetails() {
		User user = new User();
		user.setPkUserId(new Random().nextInt());
		user.setTitle("Mr.");
		user.setFirstName("Ayush");
		user.setLastName("Kumar");
		user.setEmail("ayush-ktr@test.com");
		user.setFullName(user.getFirstName().concat(" ").concat(user.getLastName()));
		user.setPhonenumber("+1855864776");
		
		return user;
	}
	
	@RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE,path = "/getUser/{name}")
	public String getUserByName(@PathVariable(name = "name") String userName) {
		
		User user = new User();
		user.setFirstName(userName);
		
		return new Gson().toJson(user);
	}
	
}
