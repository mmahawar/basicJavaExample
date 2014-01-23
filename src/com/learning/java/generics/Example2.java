package com.learning.java.generics;

import java.util.ArrayList;
import java.util.List;

public class Example2 {

	public static void main(String[] args) {
		List<Number> numberList = new ArrayList<Number>();
		numberList.add(new Integer(4));
		
		Number number = numberList.get(0);
		System.out.println(number);
	}
}
