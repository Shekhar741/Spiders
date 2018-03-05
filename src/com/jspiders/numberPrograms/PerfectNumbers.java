package com.jspiders.numberPrograms;

public class PerfectNumbers {

	public static void main(String[] args) {
		System.out.println("perfect numbers are:");
		for(int num=1;num<1000;num++) 
		{
			int temp=num;
			int sum=0;
			for(int j=1;j<num;j++) 
			{
				if(num%j==0)
					sum=sum+j;
			}
			if(temp==sum)
				System.out.println(num);
		}
		
		

	}

}
