package com.practice.ds.ex01;

import java.util.HashMap;



/*
 * implement an algorithm to determine if a string has all unique char
 * what if you cannot use additional DataStructure
 */

public class P01 {

	public boolean checkUniqueChar(String string)
	{
		if(string.length()>26)
			return false;
		boolean[] alphabet = new boolean[26];
		for(int i = 0; i<string.length(); i++)
		{
			int index = string.charAt(i)-'a';
			if(alphabet[index]) return false;
			else alphabet[index] =true;

		}
		return true;
	}
	
	public boolean checkUniqueCharBitVector(String string)
	{
		if(string.length()>26)
			return false;
		int checker = 0;
		for(int i = 0; i<string.length(); i++)
		{
			int index = string.charAt(i)-'a';
			if((checker & (1<<index))>0) return false;
			checker |= 1<<index;

		}
		return true;
	}

}
