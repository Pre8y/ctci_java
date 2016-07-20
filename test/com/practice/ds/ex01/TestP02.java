package com.practice.ds.ex01;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestP02 {

	@Test
	public void test() {
		P02 p = new P02();
		assertEquals("dcba", p.reverse("abcd"));
		assertEquals("abcd", p.reverse("dcba"));
		assertNull(p.reverse(null));
	}

}
