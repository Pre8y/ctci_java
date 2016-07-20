package com.practice.ds.ex01;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestP03 {

	@Test
	public void test() {
		P03 p = new P03();
		assertTrue(p.isPermutation("sumit", "mitus"));
		assertFalse(p.isPermutation("sumit", "mitas"));
		
		assertTrue(p.isPermutationUsingArray("sumit", "mitus"));
		assertFalse(p.isPermutationUsingArray("sumit", "mitas"));
	}

}
