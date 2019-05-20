package com.geekzila.lab_entity.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.geekzila.lab_entity.model.Diagnosis;
import com.geekzila.lab_entity.model.Item;
import com.geekzila.lab_entity.model.Order;
import com.geekzila.lab_entity.model.Patient;
import com.geekzila.lab_entity.model.Physician;
import com.geekzila.lab_entity.model.Treatment;
import com.geekzila.lab_entity.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService {

	public List<Patient> patients = new ArrayList<Patient>();

	public PatientServiceImpl() {
		// TODO Auto-generated constructor stub
		Diagnosis diagnosis = new Diagnosis(1, "Echocardiography", "05/05/2019", "8:00");
		Treatment treatment = new Treatment(1, "Fever");
		Order order = new Order(1, "8:00", "06/05/2019");
		Physician physician = new Physician(1, "Raman", order);
		Item item = new Item(1, "Identfied", "More", "05/05/2019", 500);
		patients.add(new Patient(1, "Identified", "Raka", item, physician, treatment, diagnosis));

		Diagnosis diagnosis1 = new Diagnosis(2, "Echocardiography", "05/05/2019", "8:00");
		Treatment treatment1 = new Treatment(2, "Fever");
		Order order1 = new Order(2, "8:00", "06/05/2019");
		Physician physician1 = new Physician(2, "Raman", order1);
		Item item1 = new Item(2, "Identfied", "More", "05/05/2019", 500);
		patients.add(new Patient(2, "Identified", "Raka", item1, physician1, treatment1, diagnosis1));
	}

	@Override
	public void add(Patient patient) {
		// TODO Auto-generated method stub
		patients.add(patient);

	}

	@Override
	public List<Patient> findAll() {
		// TODO Auto-generated method stub
		return patients;
	}

	@Override
	public Patient get(Integer id) {
		// TODO Auto-generated method stub
		for (Patient patient : patients) {
			if (patient.getid().equals(id)) {
				return patient;
			}
		}
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		patients.remove(get(id));

	}

	@Override
	public Patient update(Patient patient) {
		// TODO Auto-generated method stub
		Patient patientFromDb = get(patient.getid());
		Integer index = patients.indexOf(patientFromDb);
		patients.set(index, patient);
		return patient;
	}

}
