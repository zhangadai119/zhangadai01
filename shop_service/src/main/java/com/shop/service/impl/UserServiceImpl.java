package com.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.shop.entity.User;
import com.shop.mapper.UserMapper;
import com.shop.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User findOne(String name, String pwd) {
		// TODO Auto-generated method stub
		return userMapper.findOne(name,pwd);
	}

}
