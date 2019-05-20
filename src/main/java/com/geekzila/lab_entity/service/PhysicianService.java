package com.geekzila.lab_entity.service;

import java.util.List;

import com.geekzila.lab_entity.model.Physician;

public interface PhysicianService {

	public void add(Physician physician);

	public List<Physician> findAll();

	public Physician get(Integer id);

	public void delete(Integer id);

	public Physician update(Physician physician);

}
