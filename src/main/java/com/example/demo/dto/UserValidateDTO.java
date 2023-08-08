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
}