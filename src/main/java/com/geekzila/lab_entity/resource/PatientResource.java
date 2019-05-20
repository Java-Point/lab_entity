package com.geekzila.lab_entity.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geekzila.lab_entity.model.Patient;
import com.geekzila.lab_entity.service.PatientService;

@RestController
@RequestMapping("/api")
public class PatientResource {

	@Autowired
	PatientService patientService;

	@GetMapping("/patient")
	public List<Patient> getPatient() {
		return patientService.findAll();
	}

	@PostMapping("/Patient")
	public List<Patient> addPatient(@RequestBody Patient patient) {
		patientService.add(patient);
		return patientService.findAll();
	}

	@PutMapping("/Patient")
	public List<Patient> updatePatient(@RequestBody Patient patient) {
		patientService.update(patient);
		return patientService.findAll();
	}

	@DeleteMapping("/Patient/{id}")
	public List<Patient> deletePatient(@RequestBody Integer id) {
		patientService.delete(id);
		return patientService.findAll();
	}

}
