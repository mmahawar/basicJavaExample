package com.learning.java.enums;


/**
 * 1) Maintenance nighmare --- Never do it
 * 2) reordering the list will break numberOfMusicians method
 * 3) i would like to associate same value to another constant .... like double quartet, 
 */
public enum Ensemble {

	// Abuse of ordinal to derive an associated value - DON'T DO THIS
	SOLO, DUET, TRIO, QUARTET, QUINTET, SEXTET, SEPTET, OCTET, NONET, DECTET;
	
	public int numberOfMusicians() {
		return ordinal() + 1;
	}

}
