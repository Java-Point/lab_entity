package com.geekzila.lab_entity.model;

public class Diagnosis {

	private Integer id;
	private String name;
	private String date;
	private String time;

	public Diagnosis() {
		// TODO Auto-generated constructor stub
	}

	public Diagnosis(Integer id, String name, String date, String time) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.time = time;
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}
