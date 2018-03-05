package com.jspiders.arrayPrograms;

public class ArrayMatrix {
	

	public static void main(String[] args) {
		int arr[][]= {{2,4,5},{3,0,7},{1,2,9}};
		int min=arr[0][0];
		int mincolumn=0;
		int minrow=0;
		int largeNumber=0;
		for(int i=0;i<3;i++) //Row
		{
			for(int j=0;j<3;j++)  //Column
			{
				System.out.println("Value of block for Row "+i+" and column"+j+" is:"+arr[i][j]);
			}
			
		}
		
//		For printing min value
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(arr[i][j]<min) 
				{
					min=arr[i][j];
					mincolumn=j;
					minrow=i;
				}
			}
		}
    	System.out.println("Minimum value in a given matrix is:"+min);
		
		int max1=arr[0][mincolumn];  //For finding large number from the column
		int k=0;
		while(k<3) 
		{
			if(arr[k][mincolumn]>max1)
			{
				max1=arr[k][mincolumn];
			}
			k++;
			
		}
		System.out.println("First large number from smallest number column is:"+max1);
		
		int max2=arr[minrow][0];  //For finding large number from the row
		int l=0;
		while(l<3) 
		{
			if(arr[minrow][l]>max2) 
			{
				max2=arr[minrow][l];
			}
			l++;
		}
		System.out.println("Second largest number from smallest number row is:"+max2);
		
		// for displaying the  large number from comparing the row and column
		
		if(max1>max2) 
		{
			largeNumber=max1;
		}
		else 
		{
			largeNumber=max2;
		}
		
		System.out.println("The largest number is:"+largeNumber);
		

	}


}
