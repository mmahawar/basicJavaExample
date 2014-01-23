package com.learning.java.enums;

public class UseOperation {

	public static void main(String[] args) {

		double x = 2, y = 2;
		System.out.println("===========================");
		for (SimpleOperation op : SimpleOperation.values())
			System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));

		System.out.println("===========================");
		for (OperationWithToString op : OperationWithToString.values())
			System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));

		System.out.println("===========================");
		test(BasicOperation.class, x, y);

		System.out.println("===========================");
		test(ExtendedOperation.class, x, y);
	}

	private static <T extends Enum<T> & Operation> void test(Class<T> opSet,
			double x, double y) {
		for (Operation op : opSet.getEnumConstants())
			System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
	}
}
