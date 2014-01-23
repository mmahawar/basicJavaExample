package com.learning.java.dont;

import org.junit.Test;

//prefer primitives to boxed primitives, 
//and watch out for unintentional autoboxing.
public class FewMoreThingsToTest {

	@Test
	public void testShouldTakeLongerTime() {
		long startTime = System.currentTimeMillis();
		Long sum = 0L;
		for (long i = 0; i < Integer.MAX_VALUE; i++) {
			sum += i;
		}
		long endTime = System.currentTimeMillis();
		System.out.println(sum +  "  :: " + (endTime - startTime ));
	}
	
	@Test
	public void testShouldTakeLessTime() {
		long startTime = System.currentTimeMillis();
		long sum = 0L;
		for (long i = 0; i < Integer.MAX_VALUE; i++) {
			sum += i;
		}
		long endTime = System.currentTimeMillis();
		System.out.println(sum +  "  :: " + (endTime - startTime ));
	}

}
