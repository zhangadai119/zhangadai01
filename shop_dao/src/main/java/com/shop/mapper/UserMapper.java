package com.shop.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.shop.entity.User;


public interface UserMapper {

	@Select("select * from tb_user where name = #{name} and pwd = #{pwd}")
	User findOne(@Param("name")String name, @Param("pwd")String pwd);

}
