package com.geekzila.lab_entity.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.geekzila.lab_entity.model.CareCentre;
import com.geekzila.lab_entity.service.CareCentreService;

@Service
public class CareCentreServiceImpl implements CareCentreService {

	public List<CareCentre> careCentres = new ArrayList<CareCentre>();

	public CareCentreServiceImpl() {

		careCentres.add(new CareCentre(1, "Bangalore"));
		careCentres.add(new CareCentre(2, "Chennai"));

	}

	@Override
	public void add(CareCentre careCentre) {
		// TODO Auto-generated method stub
		careCentres.add(careCentre);

	}

	@Override
	public List<CareCentre> findAll() {
		// TODO Auto-generated method stub
		return careCentres;
	}

	@Override
	public CareCentre get(Integer id) {
		// TODO Auto-generated method stub
		for (CareCentre careCentre : careCentres) {
			if (careCentre.getId().equals(id)) {
				return careCentre;
			}

		}
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		careCentres.remove(get(id));

	}

	@Override
	public CareCentre update(CareCentre careCentre) {
		// TODO Auto-generated method stub
		CareCentre careCentreFromDb = get(careCentre.getId());
		Integer index = careCentres.indexOf(careCentreFromDb);
		careCentres.set(index, careCentre);
		return careCentre;
	}
}
