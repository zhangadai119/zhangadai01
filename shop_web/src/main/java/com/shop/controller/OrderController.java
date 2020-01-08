package com.shop.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.shop.entity.Order;
import com.shop.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Reference
	private OrderService orderService;
	
	@RequestMapping("/list")
	public List<Order> findAll(){
		return orderService.findAll();
	}
}
