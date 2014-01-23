package com.learning.java.enums;

public class WeightTable {
	
	public static void main(String[] args) {
		double earthWeight = 10.10d;
		double mass = earthWeight / Planet.EARTH.surfaceGravity();
		for (Planet p : Planet.values())
			System.out.printf("Weight on %s is %f%n", p, p.surfaceWeight(mass));
	}
	
}