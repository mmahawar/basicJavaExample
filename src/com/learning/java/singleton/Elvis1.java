package com.learning.java.singleton;

//Singleton with public final field
public class Elvis1 {
	public static final Elvis1 INSTANCE = new Elvis1();

	private Elvis1() {
		// Blah Blah
	}

	public void leaveTheBuilding() {
		// something i will write
	}
}
