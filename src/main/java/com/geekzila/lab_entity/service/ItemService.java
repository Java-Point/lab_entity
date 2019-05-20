package com.geekzila.lab_entity.service;

import java.util.List;

import com.geekzila.lab_entity.model.Item;

public interface ItemService {

	public void add(Item item);

	public List<Item> findAll();

	public Item get(Integer id);

	public void delete(Integer id);

	public Item update(Item item);

}
