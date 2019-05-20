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

import com.geekzila.lab_entity.model.Diagnosis;
import com.geekzila.lab_entity.service.DiagnosisService;

@RestController
@RequestMapping("/api")
public class DiagnosisResource {

	@Autowired
	DiagnosisService diagnosisService;

	@GetMapping("/diagnosis")
	public List<Diagnosis> getDiagnosis() {
		return diagnosisService.findAll();
	}

	@PostMapping("/diagnosis")
	public List<Diagnosis> addDiagnosis(@RequestBody Diagnosis diagnosis) {
		diagnosisService.add(diagnosis);
		return diagnosisService.findAll();
	}

	@PutMapping("/diagnosis")
	public List<Diagnosis> updateDiagnosis(@RequestBody Diagnosis diagnosis) {
		diagnosisService.update(diagnosis);
		return diagnosisService.findAll();
	}

	@DeleteMapping("/diagnosis/{id}")
	public List<Diagnosis> deleteDiagnosis(@RequestBody Integer id) {
		diagnosisService.delete(id);
		return diagnosisService.findAll();
	}
}
