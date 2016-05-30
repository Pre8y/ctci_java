package com.practice.ds.stringbuffer;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMyStringBuffer {
	@Test
	public void test() {
		MyStringBuffer string = new MyStringBuffer("this ");
		string = string.append("is ").append("string ").append("buffer ").append("test.");
		
		assertEquals(string.toString(), "this is string buffer test.");
		
	}

}
