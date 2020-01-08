package com.shop.entity;

import java.io.Serializable;

public class Shop implements Serializable{
	private Integer id;
	private String photo;
	private Integer status;
	private String shopname;
	private Double price;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getShopname() {
		return shopname;
	}
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Shop(Integer id, String photo, Integer status, String shopname,
			Double price) {
		super();
		this.id = id;
		this.photo = photo;
		this.status = status;
		this.shopname = shopname;
		this.price = price;
	}
	public Shop() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Shop [id=" + id + ", photo=" + photo + ", status=" + status
				+ ", shopname=" + shopname + ", price=" + price + "]";
	}
	
}
