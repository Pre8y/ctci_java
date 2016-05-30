package com.practice.ds.hashtable;

/*
 * HashTable - for highly efficient lookup store a value in 
 * an array at hash(key) index. Needs
 * very large array, or create a linked list. 
 * Store value at hash(key)%ARRAY location in a list in array
 */


public class MyHashTable<X extends KeyInterface, Y> {
	
	
	private HashTableList<X, Y>[] array  = null;
	
	
	public MyHashTable() {
		array = new HashTableList[KeyInterface.MAX];
	}
	//put value in array[hash(key)]
	public void put(X key, Y value) throws MaxSizeException
	{
		
			int position = key.localHashCode(); 
			if(position>KeyInterface.MAX)
				throw new MaxSizeException();
			
			if(array[position]==null)
			{
				array[position] = new HashTableList<X, Y>(key, value);
			}else{
				HashTableList<X, Y> list = array[position];
				while(!list.key.localIsEqual(key) || list.next!=null)
				{
					list = list.next;
				}
				if(list.key.localIsEqual(key)) list.value = value;
				else list.next = new HashTableList<X, Y>(key, value);
			}
		
	}
//	return y from list at position array[hash(key)]
	public Y get(X key)
	{
		int position = key.localHashCode();
		HashTableList<X, Y> list = array[position];
		while(list!=null && !list.key.localIsEqual(key) )
		{
			list = list.next;
		}
		if(list == null)
			return null;
		else return list.value;
	}
}
