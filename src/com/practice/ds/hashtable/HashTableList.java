package com.practice.ds.hashtable;

public class HashTableList<X, Y>  {
	
	X key;
	Y value;
	HashTableList<X, Y> next ;
	public HashTableList(X key, Y value) {
		this.key = key;
		this.value = value;
		next = null;
	}

}
