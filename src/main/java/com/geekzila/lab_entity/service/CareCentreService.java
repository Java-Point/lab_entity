package com.geekzila.lab_entity.service;

import java.util.List;

import com.geekzila.lab_entity.model.CareCentre;

public interface CareCentreService {

	public void add(CareCentre careCentre);

	public List<CareCentre> findAll();

	public CareCentre get(Integer id);

	public void delete(Integer id);

	public CareCentre update(CareCentre careCentre);

}
