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

import com.geekzila.lab_entity.model.CareCentre;
import com.geekzila.lab_entity.service.CareCentreService;

@RestController
@RequestMapping("/api")
public class CareCentreResource {

	@Autowired
	CareCentreService careCentreService;

	@GetMapping("/care")
	public List<CareCentre> getCareCentre() {
		return careCentreService.findAll();
	}

	@PostMapping("/care")
	public List<CareCentre> addCareCentre(@RequestBody CareCentre careCentre) {
		careCentreService.add(careCentre);
		return careCentreService.findAll();
	}

	@PutMapping("/care")
	public List<CareCentre> updateCareCentre(@RequestBody CareCentre careCentre) {
		careCentreService.update(careCentre);
		return careCentreService.findAll();
	}

	@DeleteMapping("/care/{id}")
	public List<CareCentre> deleteCareCentre(@RequestBody Integer id) {
		careCentreService.delete(id);
		return careCentreService.findAll();
	}

}
