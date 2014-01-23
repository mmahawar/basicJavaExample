package com.learning.java.singleton;

// Singleton with static factory
public class Elvis2 {
	private static final Elvis2 INSTANCE = new Elvis2();

	private Elvis2() {
		// something
	}

	public static Elvis2 getInstance() {
		return INSTANCE;
	}

	public String leaveTheBuilding() {
		return "not leaving";
	}
}