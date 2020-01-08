package com.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.shop.entity.Order;
import com.shop.mapper.OrderMapper;
import com.shop.service.OrderService;
@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderMapper orderMapper;

	@Override
	public List<Order> findAll() {
		return orderMapper.findAll();
	}
}
