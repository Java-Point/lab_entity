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

import com.geekzila.lab_entity.model.Item;
import com.geekzila.lab_entity.service.ItemService;

@RestController
@RequestMapping("/api")
public class ItemResource {

	@Autowired
	ItemService itemService;

	@GetMapping("/item")
	public List<Item> getItem() {
		return itemService.findAll();
	}

	@PostMapping("/item")
	public List<Item> addItem(@RequestBody Item item) {
		itemService.add(item);
		return itemService.findAll();
	}

	@PutMapping("/item")
	public List<Item> updateItem(@RequestBody Item item) {
		itemService.update(item);
		return itemService.findAll();
	}

	@DeleteMapping("/item/{id}")
	public List<Item> deleteItem(@RequestBody Integer id) {
		itemService.delete(id);
		return itemService.findAll();
	}
}
