package com.optical.login.service;

import com.optical.login.exception.IncorrectPasswordException;
import com.optical.login.exception.UserNotFoundException;
import com.optical.login.model.User;
import com.optical.login.model.UserDTO;

public interface UserService {

	User login(UserDTO dto) throws UserNotFoundException, IncorrectPasswordException;

}
