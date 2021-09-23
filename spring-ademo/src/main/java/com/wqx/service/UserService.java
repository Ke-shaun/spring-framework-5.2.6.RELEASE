package com.wqx.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

	@Autowired
	private OrderService orderService;

	public UserService(){
		System.out.println("Constractor form UserService");

	}

	public void getOrderService(){
		System.out.println("获取的 orderService : " + orderService);
	}
}
