package com.geekzila.lab_entity.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.geekzila.lab_entity.model.Bed;
import com.geekzila.lab_entity.model.CareCentre;
import com.geekzila.lab_entity.model.Diagnosis;
import com.geekzila.lab_entity.model.Employee;
import com.geekzila.lab_entity.model.Item;
import com.geekzila.lab_entity.model.Order;
import com.geekzila.lab_entity.model.Patient;
import com.geekzila.lab_entity.model.Physician;
import com.geekzila.lab_entity.model.Treatment;
import com.geekzila.lab_entity.service.BedService;

@Service
public class BedServiceImpl implements BedService {

	public List<Bed> beds = new ArrayList<Bed>();

	public BedServiceImpl() {
		Employee employee = new Employee(1, "Raja");
		CareCentre careCentre = new CareCentre(1, "Bangalore");
		Diagnosis diagnosis = new Diagnosis(1, "Echocardiography", "05/05/2019", "8:00");
		Treatment treatment = new Treatment(1, "Fever");
		Order order = new Order(1, "8:00", "06/05/2019");
		Physician physician = new Physician(1, "Rama", order);
		Item item = new Item(1, "Identfied", "Less", "05/05/2019", 500);
		Patient patient = new Patient(1, "Identified", "Rakesh", item, physician, treatment, diagnosis);
		beds.add(new Bed(1, 100, 200, patient, careCentre, employee));

		Employee employee1 = new Employee(2, "Rajat");
		CareCentre careCentre1 = new CareCentre(2, "Chennai");
		Diagnosis diagnosis1 = new Diagnosis(2, "Echocardiography", "05/05/2019", "8:00");
		Treatment treatment1 = new Treatment(2, "Fever");
		Order order1 = new Order(2, "8:00", "06/05/2019");
		Physician physician1 = new Physician(2, "Raman", order1);
		Item item1 = new Item(2, "Identfied", "More", "05/05/2019", 500);
		Patient patient1 = new Patient(2, "Identified", "Raka", item1, physician1, treatment1, diagnosis1);
		beds.add(new Bed(2, 500, 600, patient1, careCentre1, employee1));
	}

	@Override
	public void add(Bed bed) {
		// TODO Auto-generated method stub
		beds.add(bed);

	}

	@Override
	public List<Bed> findAll() {
		// TODO Auto-generated method stub
		return beds;
	}

	@Override
	public Bed get(Integer id) {
		// TODO Auto-generated method stub
		for (Bed bed : beds) {

			if (bed.getId() == id) {
				return bed;
			}

		}
		return null;

	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		beds.remove(get(id));

	}

	@Override
	public Bed update(Bed bed) {
		// TODO Auto-generated method stub
		Bed bedFromDb = get(bed.getId());
		Integer index = beds.indexOf(bedFromDb);
		beds.set(index, bed);
		return bed;
	}

}
