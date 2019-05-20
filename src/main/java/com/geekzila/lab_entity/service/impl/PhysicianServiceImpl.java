package com.geekzila.lab_entity.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.geekzila.lab_entity.model.Order;
import com.geekzila.lab_entity.model.Physician;
import com.geekzila.lab_entity.service.PhysicianService;

@Service
public class PhysicianServiceImpl implements PhysicianService {

	public List<Physician> physicians = new ArrayList<Physician>();

	public PhysicianServiceImpl() {
		// TODO Auto-generated constructor stub
		Order order = new Order(1, "8:00", "06/05/2019");
		physicians.add(new Physician(1, "Rama", order));

		Order order1 = new Order(2, "8:00", "06/05/2019");
		physicians.add(new Physician(2, "Raman", order1));
	}

	@Override
	public void add(Physician physician) {
		// TODO Auto-generated method stub
		physicians.add(physician);

	}

	@Override
	public List<Physician> findAll() {
		// TODO Auto-generated method stub
		return physicians;
	}

	@Override
	public Physician get(Integer id) {
		// TODO Auto-generated method stub
		for (Physician physician : physicians) {
			if (physician.getId().equals(id)) {
				return physician;
			}

		}
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		physicians.remove(get(id));

	}

	@Override
	public Physician update(Physician physician) {
		// TODO Auto-generated method stub
		Physician physicianFromDb = get(physician.getId());
		Integer index = physicians.indexOf(physicianFromDb);
		physicians.set(index, physician);
		return physician;
	}

}
