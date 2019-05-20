package com.geekzila.lab_entity.model;

public class Order {

	private Integer id;
	private String time;
	private String date;

	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(Integer id, String time, String date) {
		super();
		this.id = id;
		this.time = time;
		this.date = date;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
