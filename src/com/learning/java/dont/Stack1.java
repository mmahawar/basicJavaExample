package com.learning.java.dont;

import java.util.Arrays;
import java.util.EmptyStackException;

// An obsolete reference is simply a reference 
// that will never be dereferenced again

// Memory leaks in garbage-collected languages more properly known 
// as unintentional object retentions
public class Stack1 {
	
	private Object[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;

	public Stack1() {
		elements = new Object[DEFAULT_INITIAL_CAPACITY];
	}

	public void push(Object e) {
		ensureCapacity();
		elements[size++] = e;
	}

	public Object pop() {
		if (size == 0)
			throw new EmptyStackException();
		return elements[--size];
	}

	/**
	 * Ensure space for at least one more element, roughly doubling the capacity
	 * each time the array needs to grow.
	 */
	private void ensureCapacity() {
		if (elements.length == size)
			elements = Arrays.copyOf(elements, 2 * size + 1);
	}
}