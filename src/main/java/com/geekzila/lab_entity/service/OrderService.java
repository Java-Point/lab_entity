package com.geekzila.lab_entity.service;

import java.util.List;

import com.geekzila.lab_entity.model.Order;

public interface OrderService {

	public void add(Order Order);

	public List<Order> findAll();

	public Order get(Integer id);

	public void delete(Integer id);

	public Order update(Order Order);

}
