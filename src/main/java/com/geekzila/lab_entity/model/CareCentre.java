package com.geekzila.lab_entity.model;

public class CareCentre {
	
	private Integer id;
	private String name;
	
	public CareCentre() {
		// TODO Auto-generated constructor stub
	}

	public CareCentre(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	

}
