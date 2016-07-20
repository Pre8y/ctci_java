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
	
	/*
	 * reference 
	 * https://www.quora.com/Could-someone-explain-how-this-code-dictates-if-the-string-has-all-unique-characters-or-not/answer/John-Kurlak?srid=h0O1
	 */
	public boolean checkUniqueCharBitVector(String string)
	{
		if(string.length()>26)
			return false;
		////32 bit, 0 indicate false char not used at this index, 1 char is already in use
		//000000000000000000000000000000000
		//-------zyxwvutsrqponmlkjihgfedcba
		int checker = 0;
		for(int i = 0; i<string.length(); i++)// loop
		{
			int index = string.charAt(i)-'a'; //get index in checker vector ascii of a is 97
			//"g," we get val = 6.  Accordingly, (1 << val) is 1000000 mask for g
			if((checker & (1<<index))>0) return false; //bitwise and return true iff both input are one 
			checker |= 1<<index; //set the value 0 or 0 is 0 otherwise its 1 always

		}
		return true;
	}

}
