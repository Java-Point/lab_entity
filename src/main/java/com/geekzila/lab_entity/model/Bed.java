package com.geekzila.lab_entity.model;

public class Bed {

	private Integer id;
	private Integer bed_number;
	private Integer room_number;
	private Patient patient;
	private CareCentre careCentre;
	private Employee employee;

	public Bed() {
		// TODO Auto-generated constructor stub
	}

	public Bed(Integer id, Integer bed_number, Integer room_number, Patient patient, CareCentre careCentre,
			Employee employee) {
		super();
		this.id = id;
		this.bed_number = bed_number;
		this.room_number = room_number;
		this.patient = patient;
		this.careCentre = careCentre;
		this.employee = employee;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getBed_number() {
		return bed_number;
	}

	public void setBed_number(Integer bed_number) {
		this.bed_number = bed_number;
	}

	public Integer getRoom_number() {
		return room_number;
	}

	public void setRoom_number(Integer room_number) {
		this.room_number = room_number;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public CareCentre getCareCentre() {
		return careCentre;
	}

	public void setCareCentre(CareCentre careCentre) {
		this.careCentre = careCentre;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
