package com.pattern.BuilderPattern;

public class buildMeal {
	public Meal preXueBiAndHanBao() {
		Meal meal = new Meal();
		meal.addItem(new Hanbao());
		meal.addItem(new XueBi());
		return meal;
	}

	public Meal preKeLeAndJiRouHanBao() {
		Meal meal = new Meal();
		meal.addItem(new JiRouHanBao());
		meal.addItem(new KeLe());
		return meal;
	}
}
