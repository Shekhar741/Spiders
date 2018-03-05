package com.jspiders.numberPrograms;

import java.util.HashSet;

public class UniqueNumber1 {
	static void printDistinct(int arr[])
    {
        // Creates an empty hashset
        HashSet<Integer> set = new HashSet<>();
 
        // Traverse the input array
        for (int i=0; i<arr.length; i++)
        {
            // If not present, then put it in hashtable and print it
            if (!set.contains(arr[i]))
            {
                set.add(arr[i]);
                System.out.print(arr[i] + " ");
            }
        }
    }

	public static void main(String[] args) {
		 
		        int arr[] = {45,56,78,56,20,45};
		        printDistinct(arr);
		 
		

	}

}
