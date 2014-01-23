package com.learning.java.enums;

/**
 * 
 * Compiler won't complain if you pass an apple to a method who expects orange
 * 
 * Nothing to provide type safely... They are compile type constants
 * 
 */
public class OldIsNotGold {

	// The int enum pattern - severely deficient!
	public static final int APPLE_FUJI = 0;
	public static final int APPLE_PIPPIN = 1;
	public static final int APPLE_GRANNY_SMITH = 2;

	public static final int ORANGE_NAVEL = 0;
	public static final int ORANGE_TEMPLE = 1;
	public static final int ORANGE_BLOOD = 2;

	// Java Enums are full fledge classes
	// but clients can not create an instance nor extends it
	// Hence we can say enum types are instance controlled
	public enum Apple {
		FUJI, PIPPIN, GRANNY_SMITH
	}

	public enum Orange {
		NAVEL, TEMPLE, BLOOD
	}

}
