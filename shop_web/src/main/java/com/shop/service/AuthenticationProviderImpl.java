package com.shop.service;

import java.util.ArrayList;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.shop.entity.User;

public class AuthenticationProviderImpl implements AuthenticationProvider{

	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public Authentication authenticate(Authentication authentication)
			throws AuthenticationException {
		String name = authentication.getName();
		String pwd = (String)authentication.getCredentials();
		
		User user = userService.findOne(name,pwd);
		if(user == null){
			throw new DisabledException("没这个用户");
		}
		ArrayList<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();
		if(user.getFlag() == 0){
			grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_USER"));
		}
		if(user.getFlag() == 1){
			grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_SHOP"));
		}
		return new UsernamePasswordAuthenticationToken(name, pwd,grantedAuthorities);
	}

	@Override
	public boolean supports(Class<?> authentication) {
		// TODO Auto-generated method stub
		return true;
	}

}
