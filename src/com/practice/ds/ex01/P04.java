package com.practice.ds.ex01;
/*
 * replace space by %20
 */
public class P04 {
	private static final int MAX = 100;
	public String encode(String word)
	{
		char[] array = new char[MAX];
		int increaseBy=0;
		for(int i = 0; i<word.length(); i++)
		{
			if(word.charAt(i)==' ')
			{
				array[i+increaseBy] = '%';
				increaseBy ++;
				array[i+increaseBy+1] = '2';
				increaseBy ++;
				array[i+increaseBy+1] = '0';
				increaseBy ++;
			}else{
				array[i+increaseBy] = word.charAt(i);
			}
		}
		return new String(array).trim();
	}

}
