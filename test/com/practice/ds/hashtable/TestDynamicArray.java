package com.practice.ds.hashtable;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDynamicArray {

	@Test
	public void test() {
		DynamicArray<String> array = new DynamicArray<String>();
		array.add("zero");
		array.add("one");
		array.add("two");
		array.add("three");
		array.add("four");
		array.add("five");
		array.add("six");
		array.add("seven");
		array.add("eight");
		array.add("nine");
		array.add("ten");
		array.add("eleven");
		array.add("twelve");
		
		assertEquals("zero", array.get(0));
		assertEquals("one", array.get(1));
		assertEquals("two", array.get(2));
		assertEquals("three", array.get(3));
		assertEquals("four", array.get(4));
		assertEquals("five", array.get(5));
		assertEquals("six", array.get(6));
		assertEquals("seven", array.get(7));
		assertEquals("eight", array.get(8));
		assertEquals("nine", array.get(9));
		assertEquals("ten", array.get(10));
		assertEquals("eleven", array.get(11));
		assertEquals("twelve", array.get(12));
		
	}

}
