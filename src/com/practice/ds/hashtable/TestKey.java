package com.practice.ds.hashtable;

public class TestKey implements KeyInterface<TestKey> {
	int key;
	public TestKey(int key) {
		this.key = key;
	}

	@Override
	public boolean localIsEqual(TestKey key) {
		// TODO Auto-generated method stub
		return this.key==key.key;
	}

	@Override
	public int localHashCode() {
		// TODO Auto-generated method stub
		return key%MAX;
	}

}
