package com.geekzila.lab_entity.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.geekzila.lab_entity.model.Order;
import com.geekzila.lab_entity.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	public List<Order> orders = new ArrayList<Order>();

	public OrderServiceImpl() {
		// TODO Auto-generated constructor stub
		orders.add(new Order(1, "8:00", "06/05/2019"));
		orders.add(new Order(2, "8:00", "06/05/2019"));
	}

	@Override
	public void add(Order order) {
		// TODO Auto-generated method stub
		orders.add(order);

	}

	@Override
	public List<Order> findAll() {
		// TODO Auto-generated method stub
		return orders;
	}

	@Override
	public Order get(Integer id) {
		// TODO Auto-generated method stub
		for (Order order : orders) {
			if (order.getId().equals(id)) {
				return order;
			}

		}
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		orders.remove(get(id));

	}

	@Override
	public Order update(Order order) {
		// TODO Auto-generated method stub
		Order orderFromDb = get(order.getId());
		Integer index = orders.indexOf(orderFromDb);
		orders.set(index, order);
		return order;
	}

}
