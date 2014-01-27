package com.learning.java.generics;

//Higher Bound
@SuppressWarnings("unused")
public class GenericPoints<X extends Number, Y extends Number> {

	private X xCoord;
	private Y yCoord;

	public X getxCoord() {
		return xCoord;
	}

	public void setxCoord(X xCoord) {
		this.xCoord = xCoord;
	}

	public Y getyCoord() {
		return yCoord;
	}

	public void setyCoord(Y yCoord) {
		this.yCoord = yCoord;
	}

	public GenericPoints(X x, Y y) {
		xCoord = x;
		yCoord = y;
	}

	public static void main(String[] args) {
		GenericPoints<Integer, Float> genericPoints = new GenericPoints<>(1,
				12.3F);
		GenericPoints<Integer, Integer> genericPoint1 = new GenericPoints<>(1,
				1);
		GenericPoints<Double, Integer> genericPoint2 = new GenericPoints<>(
				1.2d, 1);

		// GenericPoints<Double, String> genericPoint3 = new
		// GenericPoints<>(1.2d, "");
	}
}
