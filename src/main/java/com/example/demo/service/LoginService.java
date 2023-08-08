package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserValidateDTO;
import com.example.demo.model.User;
import com.example.demo.repository.OrderRepository;
import com.example.demo.repository.UserRepository1;

@Service
@RestController
public class LoginService {
	
	@Autowired
	private UserRepository1 userRepository1;
	
	@Autowired
	OrderRepository orderRepository;
	
	public boolean checkLogin(User user) {
		//logic 1
//		user = userRepository.getUser(user);
//		List<Order> list = orderRepository.getOrderByUser(user);
//		if (user != null && user.getForgotPassword() != null && list.size() > 0) {
			return true;
//		}
//		return false;
		//logic 2
		
		//logic 3
		
		//+ get DB data by calling functions in REPOSITORY CLASS
	}
	
	public User saveUser(UserValidateDTO userValidateDTO) {
		User user = new User ();
		return userRepository1.save(user);
	}
	
	public List<User> getAllUser(){
		return userRepository1.findAll();
	}
	
	public User getUser(int id) {
		return userRepository1.findById(id);
	}
}
