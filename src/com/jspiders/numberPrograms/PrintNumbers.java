package com.jspiders.numberPrograms;

public class PrintNumbers {

	public static void main(String[] args) {
		
		for(int i=1;i<=50;i++) 
		{
			 if(i%3==0&&i%5==0) 
			{
				System.out.println("ATGC");
			}
			 else if(i%3==0)
			{
				System.out.println("DNA");
			}
			else if(i%5==0) 
			{
				System.out.println("RNA");
			}
			
			else 
			{
				System.out.println(i);
			}
				
		}

	}

}
