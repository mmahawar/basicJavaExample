package com.learning.java.manyconstructor;

// Telescoping constructor pattern - does not scale well!
public class NutritionFacts1 {
	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int carbohydrate;

	public NutritionFacts1(int servingSize, int servings) {
		this(servingSize, servings, 0);
	}

	public NutritionFacts1(int servingSize, int servings, int calories) {
		this(servingSize, servings, calories, 0);
	}

	public NutritionFacts1(int servingSize, int servings, int calories, int fat) {
		this(servingSize, servings, calories, fat, 0);
	}

	public NutritionFacts1(int servingSize, int servings, int calories, int fat,
			int sodium) {
		this(servingSize, servings, calories, fat, sodium, 0);
	}

	public NutritionFacts1(int servingSize, int servings, int calories, int fat,
			int sodium, int carbohydrate) {
		this.servingSize = servingSize;
		this.servings = servings;
		this.calories = calories;
		this.fat = fat;
		this.sodium = sodium;
		this.carbohydrate = carbohydrate;

	}

	public static void main(String[] args) {
		// May not look bad with only six parameters but it is very hard to
		// write client code using this approach..
		NutritionFacts1 cocaCola = new NutritionFacts1(240, 8, 100, 0, 35, 27);
	}
}
