package com.shop.utils;

import java.io.Serializable;
import java.util.List;

public class PageUtil implements Serializable{
	private List rows;
	private Long total;
	
	public List getRows() {
		return rows;
	}
	public void setRows(List rows) {
		this.rows = rows;
	}
	public Long getTotal() {
		return total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}
	public PageUtil(List rows, Long total) {
		super();
		this.rows = rows;
		this.total = total;
	}
	public PageUtil() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PageUtil [rows=" + rows + ", total=" + total + "]";
	}
	
}
