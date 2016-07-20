package com.practice.ds.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class LinkedList<T extends Comparable<T>> {
	
	Node<T> root;
	
	public LinkedList()
	{
		
	}
	public void add(T data)
	{
		if(data==null) return;
		Node<T> node = new Node<T>(data);
		if(null==root)
		{
			root = node;
		}else{
			Node<T> temp = root;
			while(temp.next!=null)
			{
				temp = temp.next; 
			}
			temp.next = node;
		}
	}
	
	public void remove(T data)
	{
		Node<T> temp = root;
		Node<T> prev = null;
		Node<T> curr =  null;
		while(temp!=null)
		{
			prev = temp;
			curr = temp.next;
			if(curr.data.equals(data))
			{
				prev.next = curr.next;
			}
			temp = temp.next;
			
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuffer str =new StringBuffer();
		Node<T> temp = root;
		
		do{
			str.append(temp.data).append("->");
			temp = temp.next; 
		}while(temp!=null);
		return str.toString();
	}
	
	public void removeDuplicate()
	{
		HashMap<T, Integer>		map =  new HashMap<	T, Integer>();
		Node<T> temp = root;
 		while(temp!=null)
 		{
 			if(map.containsKey(temp.data))
 			{
 				map.put(temp.data, map.get(temp.data)+1);
 				
 				
 			}else{
 				map.put(temp.data, 1);
 			}
 			temp = temp.next;
 		}
 		for(Map.Entry entry: map.entrySet())
 		System.out.println(entry.getKey()+" :: "+entry.getValue());
 		
 		
		
	}

}
