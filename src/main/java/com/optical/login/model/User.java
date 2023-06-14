package com.optical.login.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class User {

	@Id
	private int id;

	private String email;

	private String mobileNo;

	private String password;

}
