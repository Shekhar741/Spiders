package com.jspiders.numberPrograms;

public class LargestNumbers {

	public static void main(String[] args) { //First and second biggest numbers without sorting
		
		int []a= {11,22,25,43,53,48,57,38,53};
		int fbig=a[0];
		int sbig=a[1];
		for(int i=1;i<a.length;i++)
		{
			if(fbig<a[i])
			{
				sbig=fbig;
				fbig=a[i];
				
			}
			else if(sbig<a[i]&&a[i]!=fbig)
			{
				sbig=a[i];
			}
		}
		System.out.println("First large element:"+fbig);
		System.out.println("Second large element:"+sbig);
		

	}

}
