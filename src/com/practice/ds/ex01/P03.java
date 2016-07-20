package com.practice.ds.ex01;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

/*
 * check if one string is permutation of other
 */
public class P03 {

	public boolean isPermutation(String first, String second)
	{
		if(first.length()!=second.length())
			return false;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for(int i = 0; i<first.length(); i++)
		{
			char c = first.charAt(i);
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else{
				map.put(c,1);
			}
		}
		
		for(int i = 0; i<second.length(); i++)
		{
			char c = second.charAt(i);
			if(map.containsKey(c))
			{
				if(map.get(c)==0) return false;
				map.put(c, map.get(c)-1);
			}
			else{
				return false;
			}
		}
		Collection<Integer> i = map.values();
		for(int a:i)
		{
			if(a!=0)
				return false;
		}
		return true;
	}
	public boolean isPermutationUsingArray(String first, String second)
	{
		if(first.length()!=second.length())
			return false;
		char[] firstArray = first.toCharArray();
		char[] secondArray = second.toCharArray();
		Arrays.sort(firstArray);
		Arrays.sort(secondArray);
		return Arrays.equals(firstArray, secondArray);

	}

}
