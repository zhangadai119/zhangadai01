package com.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.shop.entity.Shop;

public interface ShopMapper {

	List<Shop> findAll();

	@Update("update tb_shop set status=#{status} where id = #{id}")
	void updateStatus(@Param("id")Integer id, @Param("status")Integer status);

	@Select("select * from tb_shop where id = #{id}")
	Shop findOne(@Param("id")Integer id);

}
