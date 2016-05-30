package com.practice.ds.hashtable;

/*
 * array that doubles its size when max value is reached doubling complexity n ,
 * insertion complexity n
 * access complexity 1  
 */


public class DynamicArray<T> {
	Object[] array = null;
	int MAX = 10;
	public DynamicArray() {
		array = new Object[MAX];
	}
	public void add(T data)
	{
		int position = 0;
		for(int i=0; i<MAX; i++)
		{
			if(array[i]!=null)
			{
				position++;
			}
		}
		if(position==MAX)
		{
			Object[] temp = array;
			array = new Object[2*MAX];
			for(int i=0; i<MAX; i++)
			{
				array[i] =temp[i];
			}
			MAX = 2* MAX;
			
		}
		array[position] = data;
	}
	public T get(int position) throws ArrayIndexOutOfBoundsException
	{
		if(position>MAX)
			throw new ArrayIndexOutOfBoundsException();
		return  (T)array[position];
	}

}
