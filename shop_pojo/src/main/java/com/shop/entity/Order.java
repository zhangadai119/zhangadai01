package com.shop.entity;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable{
	private Integer oid;
	private String oname;
	private Integer ocount;
	private Double oprice;
	private String username;
	private Date odate;
	private Integer status;
	private String bz;
	public Integer getOid() {
		return oid;
	}
	public void setOid(Integer oid) {
		this.oid = oid;
	}
	public String getOname() {
		return oname;
	}
	public void setOname(String oname) {
		this.oname = oname;
	}
	public Integer getOcount() {
		return ocount;
	}
	public void setOcount(Integer ocount) {
		this.ocount = ocount;
	}
	public Double getOprice() {
		return oprice;
	}
	public void setOprice(Double oprice) {
		this.oprice = oprice;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getOdate() {
		return odate;
	}
	public void setOdate(Date odate) {
		this.odate = odate;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getBz() {
		return bz;
	}
	public void setBz(String bz) {
		this.bz = bz;
	}
	public Order(Integer oid, String oname, Integer ocount, Double oprice,
			String username, Date odate, Integer status, String bz) {
		super();
		this.oid = oid;
		this.oname = oname;
		this.ocount = ocount;
		this.oprice = oprice;
		this.username = username;
		this.odate = odate;
		this.status = status;
		this.bz = bz;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Order [oid=" + oid + ", oname=" + oname + ", ocount=" + ocount
				+ ", oprice=" + oprice + ", username=" + username + ", odate="
				+ odate + ", status=" + status + ", bz=" + bz + "]";
	}
	
}
