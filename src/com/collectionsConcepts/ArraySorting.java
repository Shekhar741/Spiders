package com.collectionsConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraySorting {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		list.add(0);
		list.add(1);
		list.add(0);
		list.add(1);
		list.add(0);
		list.add(1);
		
		System.out.println("Before sorting:");
		for(Integer i:list) 
		{
			System.out.println(i);
		}
		
		System.out.println("After sorting:");
		Collections.sort(list,new MyComparator());
		for(Integer i:list) 
		{
			System.out.println(i);
		}
		

	}

}
