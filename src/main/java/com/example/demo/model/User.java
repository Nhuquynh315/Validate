package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "user")
//@Data
//@Getter
//@Setter
//@AllArgsConstructor (staticName = "build")
//@NoArgsConstructor
public class User {
	@Id
	@GeneratedValue
	private int id;
	private String username;
	private String password;
	private String email;
	private String forgotPassword;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(int id, String username, String password, String email, String forgotPassword) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.forgotPassword = forgotPassword;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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