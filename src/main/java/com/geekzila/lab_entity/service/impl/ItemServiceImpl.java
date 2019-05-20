package com.geekzila.lab_entity.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.geekzila.lab_entity.model.Item;
import com.geekzila.lab_entity.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	public List<Item> items = new ArrayList<Item>();

	public ItemServiceImpl() {
		// TODO Auto-generated constructor stub
		items.add(new Item(1, "Identfied", "Less", "05/05/2019", 500));
		items.add(new Item(2, "Identfied", "More", "05/05/2019", 500));
	}

	@Override
	public void add(Item item) {
		// TODO Auto-generated method stub
		items.add(item);

	}

	@Override
	public List<Item> findAll() {
		// TODO Auto-generated method stub
		return items;
	}

	@Override
	public Item get(Integer id) {
		// TODO Auto-generated method stub
		for (Item item : items) {
			if (item.getId().equals(id)) {
				return item;
			}

		}
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		items.remove(get(id));

	}

	@Override
	public Item update(Item item) {
		// TODO Auto-generated method stub
		Item itemFromDb = get(item.getId());
		Integer index = items.indexOf(itemFromDb);
		items.set(index, item);
		return item;
	}

}
