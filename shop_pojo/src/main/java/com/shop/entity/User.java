package com.shop.entity;

import java.io.Serializable;

public class User implements Serializable{
	private Integer id;
	private String name;
	private String pwd;
	private Integer flag;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Integer getFlag() {
		return flag;
	}
	public void setFlag(Integer flag) {
		this.flag = flag;
	}
	public User(Integer id, String name, String pwd, Integer flag) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.flag = flag;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", pwd=" + pwd + ", flag="
				+ flag + "]";
	}
	
}
