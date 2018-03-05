package com.jspiders.arrayPrograms;

public class EvenOdd {

	public static void main(String[] args) {
		int ar[]= {11,22,33,44,55,66,77,88,99,100};
		int size=ar.length;
		int evenCount=0;
		int oddCount=0;
		for(int i=0;i<size;i++)
		{
			if(ar[i]%2==0) {
//				evenCount=evenCount+1;
				evenCount++;
			}
			else {
//				oddCount=oddCount+1;
				oddCount++;
			}
			System.out.println("Even number count:"+evenCount);
			System.out.println("Odd number count:"+oddCount);
		}

	}

}
