package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Order;
import com.example.demo.model.User;

@Repository
public class OrderRepository {
	public List<Order> getOrderByUser(User user){
		return null;
	}
}
