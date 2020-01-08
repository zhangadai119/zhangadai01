package com.shop.controller;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shop.utils.Result;

@RestController
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/loginName")
	public Result loginName(){
		Collection<? extends GrantedAuthority> authorities = SecurityContextHolder.getContext().getAuthentication().getAuthorities();
		Result result = null;
		for (GrantedAuthority grantedAuthority : authorities) {
			System.out.println(grantedAuthority);
			result = new Result(true, grantedAuthority.toString());
		}
		return result;
	}
}
