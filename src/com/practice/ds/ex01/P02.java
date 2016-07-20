package com.practice.ds.ex01;
/*
 * implement a function which  reverse string
 */
public class P02 {
	
	public String reverse(String string)
	{
		if(string==null)
			return null;
		char[] reverse = new char[string.length()];
		int length = string.length();
		for(int i=0; i<length; i++)
		{
			reverse[length-1-i] =string.charAt(i);
		}
		return new String(reverse);
		
	}

}
