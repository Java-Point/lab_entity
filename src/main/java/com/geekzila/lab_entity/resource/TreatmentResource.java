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

import com.geekzila.lab_entity.model.Treatment;
import com.geekzila.lab_entity.service.TreatmentService;

@RestController
@RequestMapping("/api")
public class TreatmentResource {
	@Autowired
	TreatmentService treatmentService;

	@GetMapping("/treatment")
	public List<Treatment> getTreatment() {
		return treatmentService.findAll();
	}

	@PostMapping("/treatment")
	public List<Treatment> addTreatment(@RequestBody Treatment treatment) {
		treatmentService.add(treatment);
		return treatmentService.findAll();
	}

	@PutMapping("/treatment")
	public List<Treatment> updateTreatment(@RequestBody Treatment treatment) {
		treatmentService.update(treatment);
		return treatmentService.findAll();
	}

	@DeleteMapping("/treatment/{id}")
	public List<Treatment> deleteTreatment(@RequestBody Integer id) {
		treatmentService.delete(id);
		return treatmentService.findAll();
	}

}
