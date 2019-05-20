package com.geekzila.lab_entity.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.geekzila.lab_entity.model.Treatment;
import com.geekzila.lab_entity.service.TreatmentService;

@Service
public class TreatmentServiceImpl implements TreatmentService {

	public List<Treatment> treatments = new ArrayList<Treatment>();

	public TreatmentServiceImpl() {
		// TODO Auto-generated constructor stub
		treatments.add(new Treatment(1, "Fever"));
		treatments.add(new Treatment(2, "Fever"));
	}

	@Override
	public void add(Treatment treatment) {
		// TODO Auto-generated method stub
		treatments.add(treatment);

	}

	@Override
	public List<Treatment> findAll() {
		// TODO Auto-generated method stub
		return treatments;
	}

	@Override
	public Treatment get(Integer id) {
		// TODO Auto-generated method stub
		for (Treatment treatment : treatments) {
			if (treatment.getId().equals(id)) {
				return treatment;
			}

		}
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		treatments.remove(get(id));

	}

	@Override
	public Treatment update(Treatment treatment) {
		// TODO Auto-generated method stub
		Treatment treatmentFromDb = get(treatment.getId());
		Integer index = treatments.indexOf(treatmentFromDb);
		treatments.set(index, treatment);
		return treatment;
	}

}
