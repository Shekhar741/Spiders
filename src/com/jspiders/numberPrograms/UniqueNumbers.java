package com.jspiders.numberPrograms;

public class UniqueNumbers {
	public static void printDistinctElements(int[] arr){
        
        for(int i=0;i<arr.length;i++){
            boolean isDistinct = false;
            for(int j=0;j<i;j++)
            {
                if(arr[i] == arr[j])
                {
                    isDistinct = true;
                    break;
                }
            }
            if(!isDistinct){
                System.out.print(arr[i]+" ");
            }
        }
    }	

	public static void main(String[] args) {
		int[] a= {45,56,56,20,58,56,45};
		System.out.println("Array elements are:");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("The unique numbers are:");
		printDistinctElements(a);

	}

}
