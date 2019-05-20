package com.geekzila.lab_entity.service;

import java.util.List;

import com.geekzila.lab_entity.model.Employee;

public interface EmployeeService {

	public void add(Employee employee);

	public List<Employee> findAll();

	public Employee get(Integer id);

	public void delete(Integer id);

	public Employee update(Employee employee);

}
