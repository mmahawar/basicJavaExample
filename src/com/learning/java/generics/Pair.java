package com.learning.java.generics;

public class Pair<K, V> {

	private K key;
	private V value;

	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
	
	public static <K, V> boolean compare(Pair<K,V> p1, Pair<K,V> p2) {
		
		if (p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue()))
			return true;
		return false;
	}

    public static <K, V> boolean superCompare(Pair<K,? super Number> p1, Pair<K,? super Number> p2) {
		
		if (p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue()))
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		Pair<String, String> pair = new Pair<>("Pair", "String Pair");

		Pair<Float, Integer> pair1 = new Pair<>(3.19F, 1);
		Pair<Float, Integer> pair2 = new Pair<>(3.19F, 1);
		
		Pair<Float, Object> pair3 = new Pair<>(3.19F, new Object());
		Pair<Float, Object> pair4 = new Pair<>(3.19F, new Object());
		
		boolean compare = compare(pair1, pair2);
		boolean supercompare = superCompare(pair3, pair4);
		
		
		System.out.println(compare);
		System.out.println(supercompare);
	}

}
