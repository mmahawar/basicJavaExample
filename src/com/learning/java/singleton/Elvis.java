package com.learning.java.singleton;

/**
 * 
 * This approach is functionally equivalent to the public field approach, 
 * except that it is more concise, 
 * 
 * provides the serialization machinery for free, and 
 * provides an ironclad guarantee against multiple instantiation, 
 * even in the face of sophisticated serialization or reflection attacks. 
 * 
 * While this approach has yet to be widely adopted, a single-element enum type is the best way to implement a singleton.
 * 
 */
public enum Elvis {
	INSTANCE;
	public void leaveTheBuilding() {
		// Blah Blah
	}
}
