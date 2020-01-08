package com.shop.service;

import com.shop.entity.User;

public interface UserService {

	User findOne(String name, String pwd);

}
