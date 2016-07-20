package com.practice.ds.ex01;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestP01 {

	@Test
	public void test() {
		P01 p = new P01();
		assertTrue(p.checkUniqueChar("abcd"));
		assertFalse(p.checkUniqueChar("abcda"));
		assertTrue(p.checkUniqueCharBitVector("abcd"));
		assertFalse(p.checkUniqueCharBitVector("abcda"));
	}

}
