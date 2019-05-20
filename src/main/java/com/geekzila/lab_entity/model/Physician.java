package com.geekzila.lab_entity.model;

public class Physician {

	private Integer id;
	private String name;
	private Order order;

	public Physician() {
		// TODO Auto-generated constructor stub
	}

	public Physician(Integer id, String name, Order order) {
		super();
		this.id = id;
		this.name = name;
		this.order = order;
	}

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

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	
}