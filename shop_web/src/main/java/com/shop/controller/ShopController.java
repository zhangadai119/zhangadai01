package com.shop.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.shop.service.ShopService;
import com.shop.utils.PageUtil;
import com.shop.utils.Result;

@RestController
@RequestMapping("/shop")
public class ShopController {

	@Reference
	private ShopService shopService;
	
	@RequestMapping("/list")
	public PageUtil findAll(Integer page,Integer size){
		System.out.println(page);
		page = page == null?1:page;
		System.out.println(page);
		return shopService.findAll(page,size);
	}
	
	@RequestMapping("/updateStatus")
	public Result updateStatus(Integer id,Integer status){
		try {
			shopService.updateStatus(id,status);
			return new Result(true, "ok");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new Result(false, "no");
		}
	}
}
