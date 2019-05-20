package com.geekzila.lab_entity.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.geekzila.lab_entity.model.Diagnosis;
import com.geekzila.lab_entity.service.DiagnosisService;

@Service
public class DiagnosisServiceImpl implements DiagnosisService {

	public List<Diagnosis> diagnosiss = new ArrayList<Diagnosis>();

	public DiagnosisServiceImpl() {
		// TODO Auto-generated constructor stub
		diagnosiss.add(new Diagnosis(1, "Echocardiography", "05/05/2019", "8:00"));
		diagnosiss.add(new Diagnosis(2, "Echocardiography", "05/05/2019", "8:00"));
	}

	@Override
	public void add(Diagnosis diagnosis) {
		// TODO Auto-generated method stub
		diagnosiss.add(diagnosis);
	}

	@Override
	public List<Diagnosis> findAll() {
		// TODO Auto-generated method stub
		return diagnosiss;
	}

	@Override
	public Diagnosis get(Integer id) {
		// TODO Auto-generated method stub
		for (Diagnosis diagnosis : diagnosiss) {
			if (diagnosis.getId().equals(id)) {
				return diagnosis;
			}

		}
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		diagnosiss.remove(get(id));

	}

	@Override
	public Diagnosis update(Diagnosis diagnosis) {
		// TODO Auto-generated method stub
		Diagnosis diagnosisFromDb = get(diagnosis.getId());
		Integer index = diagnosiss.indexOf(diagnosisFromDb);
		diagnosiss.set(index, diagnosis);
		return diagnosis;
	}

}
