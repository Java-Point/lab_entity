package com.geekzila.lab_entity.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.geekzila.lab_entity.model.Employee;
import com.geekzila.lab_entity.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	public List<Employee> employees = new ArrayList<Employee>();

	public EmployeeServiceImpl() {
		// TODO Auto-generated constructor stub
		employees.add(new Employee(1, "Raja"));
		employees.add(new Employee(2, "Rajat"));
	}

	@Override
	public void add(Employee employee) {
		// TODO Auto-generated method stub
		employees.add(employee);

	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employees;
	}

	@Override
	public Employee get(Integer id) {
		// TODO Auto-generated method stub
		for (Employee employee : employees) {
			if (employee.getId().equals(id)) {
				return employee;
			}

		}
		return null;

	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		employees.remove(get(id));

	}

	@Override
	public Employee update(Employee employee) {
		Employee employeeFromDb = get(employee.getId());
		Integer index = employees.indexOf(employeeFromDb);
		employees.set(index, employee);
		return employee;
	}

}
