package com.optical.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.optical.login.exception.IncorrectPasswordException;
import com.optical.login.exception.UserNotFoundException;
import com.optical.login.model.User;
import com.optical.login.model.UserDTO;
import com.optical.login.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping("/login")
	public User login(@RequestBody UserDTO dto) throws UserNotFoundException, IncorrectPasswordException {

		User user = service.login(dto);

		return user;
	}

}
