package com.learning.java.generics;

// Class level type value
public class Example1 <T>{
	
	private T value;

	public T getValue() {
		return value;
	}
	
	public void setValue(T value) {
		T temp = value;
		this.value = temp;
	}
	
	
	public static void main(String[] args) {
		Example1<Number> numberExample = new Example1<Number>();
		numberExample.setValue(new Integer(4));
		Number number = numberExample.getValue();
		System.out.println(number);
		
		
		Example1<String> stringExample = new Example1<String>();
		stringExample.setValue("I am string now");
		String strVal = stringExample.getValue();
		System.out.println(strVal);
	}
}
