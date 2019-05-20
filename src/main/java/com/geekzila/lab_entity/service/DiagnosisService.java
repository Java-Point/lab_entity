package com.geekzila.lab_entity.service;

import java.util.List;

import com.geekzila.lab_entity.model.Diagnosis;

public interface DiagnosisService {

	public void add(Diagnosis diagnosis);

	public List<Diagnosis> findAll();

	public Diagnosis get(Integer id);

	public void delete(Integer id);

	public Diagnosis update(Diagnosis diagnosis);

}
