package com.pattern.BuilderPattern;

public class demo {

	public static void main(String[] args) {
		buildMeal bm = new buildMeal();
		Meal meal = bm.preXueBiAndHanBao();
		meal.showMeal();
		System.out.println("套餐一:" + meal.getCost());
		Meal meal1 = bm.preKeLeAndJiRouHanBao();
		meal1.showMeal();
		System.out.println("套餐二:" + meal1.getCost());

		System.out.println(meal.getCost() + meal1.getCost());
	}

}
