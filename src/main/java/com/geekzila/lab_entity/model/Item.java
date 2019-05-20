package com.geekzila.lab_entity.model;

public class Item {

	private Integer id;
	private String identifier;
	private String quantity;
	private String date;
	private Integer cost;

	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(Integer id, String identifier, String quantity, String date, Integer cost) {
		super();
		this.id = id;
		this.identifier = identifier;
		this.quantity = quantity;
		this.date = date;
		this.cost = cost;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Integer getCost() {
		return cost;
	}

	public void setCost(Integer cost) {
		this.cost = cost;
	}

}
