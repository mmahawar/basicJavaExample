package com.learning.java.enums;


/**
 * Most developer will have not use for ordinal method unless you are designing some
 * enumeration based data structures like enumset or enummap
 */
public enum EnsembleFixed {

	SOLO(1), DUET(2), TRIO(3), QUARTET(4), QUINTET(5), SEXTET(6), SEPTET(7), OCTET(
			8), DOUBLE_QUARTET(8), NONET(9), DECTET(10), TRIPLE_QUARTET(12);
	private final int numberOfMusicians;

	EnsembleFixed(int size) {
		this.numberOfMusicians = size;
	}

	public int numberOfMusicians() {
		return numberOfMusicians;
	}
}
