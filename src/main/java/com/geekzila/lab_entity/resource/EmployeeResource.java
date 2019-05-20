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

import com.geekzila.lab_entity.model.Employee;
import com.geekzila.lab_entity.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeResource {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/employee")
	public List<Employee> getEmployee() {
		return employeeService.findAll();
	}

	@PostMapping("/employee")
	public List<Employee> addEmployee(@RequestBody Employee employee) {
		employeeService.add(employee);
		return employeeService.findAll();
	}

	@PutMapping("/employee")
	public List<Employee> updateEmployee(@RequestBody Employee employee) {
		employeeService.update(employee);
		return employeeService.findAll();
	}

	@DeleteMapping("/employee/{id}")
	public List<Employee> deleteEmployee(@RequestBody Integer id) {
		employeeService.delete(id);
		return employeeService.findAll();
	}

}
