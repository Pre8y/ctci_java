package com.practice.ds.ex01;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestP04 {

	@Test
	public void test() {
		P04 p = new P04();
		assertEquals("a%20b%20c%20d", p.encode("a b c d"));
	}

}
