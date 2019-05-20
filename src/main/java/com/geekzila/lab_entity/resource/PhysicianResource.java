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

import com.geekzila.lab_entity.model.Physician;
import com.geekzila.lab_entity.service.PhysicianService;

@RestController
@RequestMapping("/api")
public class PhysicianResource {

	@Autowired
	PhysicianService physicianService;

	@GetMapping("/physician")
	public List<Physician> getPhysician() {
		return physicianService.findAll();
	}

	@PostMapping("/physician")
	public List<Physician> addPhysician(@RequestBody Physician physician) {
		physicianService.add(physician);
		return physicianService.findAll();
	}

	@PutMapping("/physician")
	public List<Physician> updatePhysician(@RequestBody Physician physician) {
		physicianService.update(physician);
		return physicianService.findAll();
	}

	@DeleteMapping("/physician/{id}")
	public List<Physician> deletePhysician(@RequestBody Integer id) {
		physicianService.delete(id);
		return physicianService.findAll();
	}

}
