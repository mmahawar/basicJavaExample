package com.learning.java.enums;

public enum SimpleOperation {
	PLUS  {
		double apply(double x, double y) {
			return x + y;
		}
	},
	MINUS {
		double apply(double x, double y) {
			return x - y;
		}
	},
	TIMES {
		double apply(double x, double y) {
			return x * y;
		}
	},
	DIVIDE {
		double apply(double x, double y) {
			return x / y;
		}
	};
	
	abstract double apply(double x, double y);
}
