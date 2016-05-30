package test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.practice.ds.hashtable.KeyInterface;
import com.practice.ds.hashtable.MaxSizeException;
import com.practice.ds.hashtable.MyHashTable;
import com.practice.ds.hashtable.TestKey;

public class TestMyHashTable {

//	@Test(expected = MaxSizeException.class)
	@Test
	public void test() {
		MyHashTable<KeyInterface, String> table = new MyHashTable<KeyInterface, String>();
		TestKey one = new TestKey(1);
		TestKey two = new TestKey(2);
		TestKey eleven = new TestKey(11);
		try{
			table.put(one, "one");
			table.put(two, "two");
			assertEquals(table.get(one), "one");
			assertEquals(table.get(two), "two");
			table.put(one, "first");
			table.put(two, "second");
			assertEquals(table.get(one), "first");
			assertEquals(table.get(two), "second");
			table.put(eleven, "first");
			assertEquals(table.get(eleven), "eleven");
		}catch(Exception e)
		{
			e.getMessage();
		}

	}

}
