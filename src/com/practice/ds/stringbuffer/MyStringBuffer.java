package com.practice.ds.stringbuffer;


public class MyStringBuffer {
	int MAX = 10;
	char[] array = null;
	public MyStringBuffer() {
		array = new char[MAX];
	}
	public MyStringBuffer(CharSequence string) {
		array = new char[MAX];
		append(string);

	}
	public MyStringBuffer append(CharSequence string)
	{
		int position =  0;
		for(int i=0; i<MAX ; i++)
		{
			
			if(array[i]!='\u0000'){
				position++;
			}
		}
		for(int j=0; j<string.length();j++)
		{
			if(position+j==MAX){
				char[] temp = array;
				array = new char[2*MAX];
				for(int k= 0; k<MAX; k++)
				{
					array[k] = temp[k];
				}
				MAX = 2*MAX;
			}
			array[position+j] = string.charAt(j);
		}
		
		return this;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub

		return new String(array).trim();
	}

}
