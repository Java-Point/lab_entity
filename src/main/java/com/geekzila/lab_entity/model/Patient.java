package com.geekzila.lab_entity.model;

public class Patient {

	private Integer id;
	private String identifier;
	private String name;
	private Item item;
	private Physician physician;
	private Treatment treatment;
	private Diagnosis diagnosis;

	public Patient() {
		// TODO Auto-generated constructor stub
	}

	public Patient(Integer id, String identifier, String name, Item item, Physician physician, Treatment treatment,
			Diagnosis diagnosis) {
		super();
		this.id = id;
		this.identifier = identifier;
		this.name = name;
		this.item = item;
		this.physician = physician;
		this.treatment = treatment;
		this.diagnosis = diagnosis;
	}

	public Integer getid() {
		return id;
	}

	public void setid(Integer id) {
		this.id = id;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Physician getPhysician() {
		return physician;
	}

	public void setPhysician(Physician physician) {
		this.physician = physician;
	}

	public Treatment getTreatment() {
		return treatment;
	}

	public void setTreatment(Treatment treatment) {
		this.treatment = treatment;
	}

	public Diagnosis getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(Diagnosis diagnosis) {
		this.diagnosis = diagnosis;
	}

}