package com.optical.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.optical.login.exception.IncorrectPasswordException;
import com.optical.login.exception.UserNotFoundException;
import com.optical.login.model.User;
import com.optical.login.model.UserDTO;
import com.optical.login.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo repo;

	@Override
	public User login(UserDTO dto) throws UserNotFoundException, IncorrectPasswordException {

		User user = repo.findByEmail(dto.getEmail());

		if (user == null) {

			throw new UserNotFoundException("No user found with this email..!!");

		}

		if (dto.getPassword().matches(user.getPassword())) {

			return user;

		} else {

			throw new IncorrectPasswordException("Incorrect Password");

		}
	}

}
