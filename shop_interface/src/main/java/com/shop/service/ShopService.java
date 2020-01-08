package com.shop.service;


import com.shop.utils.PageUtil;

public interface ShopService {

	PageUtil findAll(Integer page, Integer size);

	void updateStatus(Integer id, Integer status);

}
