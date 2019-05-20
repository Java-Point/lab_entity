package com.geekzila.lab_entity.service;

import java.util.List;

import com.geekzila.lab_entity.model.Bed;

public interface BedService {

	public void add(Bed bed);

	public List<Bed> findAll();

	public Bed get(Integer id);

	public void delete(Integer id);

	public Bed update(Bed bed);

}
