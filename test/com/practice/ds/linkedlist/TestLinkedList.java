package com.practice.ds.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestLinkedList {
	
	@Test
	public void test() {
		LinkedList< String> table = new LinkedList<String>();
			table.add("first");
			assertEquals(table.toString(), "first->");
			
			table.add("second");
			assertEquals(table.toString(), "first->second->");
			
			table.add("third");
			assertEquals(table.toString(), "first->second->third->");
			
			table.add("first");
			assertEquals(table.toString(), "first->second->third->first->");
			
			table.add("second");
			assertEquals(table.toString(), "first->second->third->first->second->");
			
			table.add("third");
			assertEquals(table.toString(), "first->second->third->first->second->third->");
			
			table.removeDuplicate();
//			table.remove("third");
//			assertEquals(table.toString(), "first->second->first->second->");
		

	}

}
