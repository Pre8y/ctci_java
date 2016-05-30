package com.practice.ds.hashtable;

public interface KeyInterface<Key> {
	
	final static int MAX = 10;
	
	public boolean localIsEqual(Key key) ;
	
	public int localHashCode();

}
