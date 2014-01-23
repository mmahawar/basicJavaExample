package com.learning.java.enums;


/***
 * 
 * An enumerated type is a type whose legal values consist of a fixed set of constants, 
 * such as the seasons of the year, 
 * the planets in the solar system, 
 * or the suits in a deck of playing cards
 *
 * You can augment an enum type with any method that seems appropriate.
 * 
 * An enum type can start life as a simple collection of enum constants 
 * and evolve over time into a full-featured abstraction
 */
public enum Planet {
    MERCURY(3.302e+23, 2.439e6),
    VENUS  (4.869e+24, 6.052e6),
    EARTH  (5.975e+24, 6.378e6),
    MARS   (6.419e+23, 3.393e6),
    JUPITER(1.899e+27, 7.149e7),
    SATURN (5.685e+26, 6.027e7),
    URANUS (8.683e+25, 2.556e7),
    NEPTUNE(1.024e+26, 2.477e7);
    
	private final double mass; // In kilograms
	private final double radius; // In meters
	private final double surfaceGravity; // In m / s^2
	
	// Universal gravitational constant in m^3 / kg s^2
	private static final double G = 6.67300E-11;

	// Constructor
	Planet(double mass, double radius) {
		this.mass = mass;
		this.radius = radius;
		surfaceGravity = G * mass / (radius * radius);
	}

	public double surfaceWeight(double mass) {
		return mass * surfaceGravity; // F = ma
	}

	public double mass() {
		return mass;
	}

	public double radius() {
		return radius;
	}

	public double surfaceGravity() {
		return surfaceGravity;
	}
}
