package com.geekzila.lab_entity.service;

import java.util.List;

import com.geekzila.lab_entity.model.Patient;

public interface PatientService {

	public void add(Patient patient);

	public List<Patient> findAll();

	public Patient get(Integer id);

	public void delete(Integer id);

	public Patient update(Patient patient);

}
