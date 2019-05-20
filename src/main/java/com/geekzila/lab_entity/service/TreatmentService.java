package com.geekzila.lab_entity.service;

import java.util.List;

import com.geekzila.lab_entity.model.Treatment;

public interface TreatmentService {

	public void add(Treatment treatment);

	public List<Treatment> findAll();

	public Treatment get(Integer id);

	public void delete(Integer id);

	public Treatment update(Treatment treatment);

}
