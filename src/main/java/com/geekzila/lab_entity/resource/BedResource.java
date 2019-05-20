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

import com.geekzila.lab_entity.model.Bed;
import com.geekzila.lab_entity.service.BedService;

@RestController
@RequestMapping("/api")
public class BedResource {

	@Autowired
	BedService bedService;

	@GetMapping("/bed")
	public List<Bed> getBed() {
		return bedService.findAll();
	}

	@PostMapping("/bed")
	public List<Bed> addBed(@RequestBody Bed bed) {
		bedService.add(bed);
		return bedService.findAll();
	}

	@PutMapping("/bed")
	public List<Bed> updateBed(@RequestBody Bed bed) {
		bedService.update(bed);
		return bedService.findAll();
	}

	@DeleteMapping("/bed/{id}")
	public List<Bed> deleteBed(@RequestBody Integer id) {
		bedService.delete(id);
		return bedService.findAll();
	}
}
