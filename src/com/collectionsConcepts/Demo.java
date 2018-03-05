package com.collectionsConcepts;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		String[] str= {"Month","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		List<String> list1=new ArrayList<String>();
		for(int i=0;i<str.length;i++)
		{
			list1.add(str[i]);
		}
		System.out.println("List1 Elements are:");
		System.out.println(list1);
		
		String[] str2= {"Month","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		List<String> list2=new ArrayList<String>();
		for(int i=0;i<str2.length;i++)
		{
			list2.add(str[i]);
		}
		System.out.println("List2 Elements are:");
		System.out.println(list2);
		if(list1.containsAll(list2)) {
			System.out.println("both lists are identical");
		}
		else
			System.out.println("Not identical");

	}

}
