package com.pattern.BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	private List<Item> items = new ArrayList<>();

	public void addItem(Item item) {
		items.add(item);
	}

	public float getCost() {
		float cost = 0.00f;
		for (Item item : items) {
			cost += item.price();
		}
		return cost;
	}

	public void showMeal() {
		for (Item item : items) {
			System.out.println(item.name() + ":" + item.price() + "--------" + item.packing().pack());
		}
	}
}
