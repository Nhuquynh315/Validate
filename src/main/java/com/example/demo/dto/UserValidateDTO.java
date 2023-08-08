package com.example.demo.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class UserValidateDTO {
	@Pattern(regexp = "^[a-zA-Z0-9.\\-\\/+=@_ ]*$", message = "username should not contain special character")
	private String username;
	@Min(8)
	@Max(16)
	@NotNull(message = "password should not be null")
	private String password;
	@Email(message = "invalid email address")
	private String email;
	private String forgotPassword;
	
	public UserValidateDTO() {
		// TODO Auto-generated constructor stub
	}

	public UserValidateDTO(
			@Pattern(regexp = "^[a-zA-Z0-9.\\-\\/+=@_ ]*$", message = "username should not contain special character") String username,
			@Min(8) @Max(16) @NotNull(message = "password should not be null") String password,
			@Email(message = "invalid email address") String email, String forgotPassword) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.forgotPassword = forgotPassword;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getForgotPassword() {
		return forgotPassword;
	}

	public void setForgotPassword(String forgotPassword) {
		this.forgotPassword = forgotPassword;
	}
	
	
}