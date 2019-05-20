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

import com.geekzila.lab_entity.model.Order;
import com.geekzila.lab_entity.service.OrderService;

@RestController
@RequestMapping("/api")
public class OrderResource {
	@Autowired
	OrderService orderService;

	@GetMapping("/order")
	public List<Order> getOrder() {
		return orderService.findAll();
	}

	@PostMapping("/Order")
	public List<Order> addOrder(@RequestBody Order order) {
		orderService.add(order);
		return orderService.findAll();
	}

	@PutMapping("/Order")
	public List<Order> updateOrder(@RequestBody Order order) {
		orderService.update(order);
		return orderService.findAll();
	}

	@DeleteMapping("/order/{id}")
	public List<Order> deleteOrder(@RequestBody Integer id) {
		orderService.delete(id);
		return orderService.findAll();
	}
}
