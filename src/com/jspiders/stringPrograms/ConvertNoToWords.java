package com.jspiders.stringPrograms;

import java.util.Scanner;

public class ConvertNoToWords {
	void noToWod(int n,String st) 
	{
		String one[]= {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen",
				        "fifteem","sixteen","seventeen","eighteen","ninteen"};
		String two[]= {"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty"};
		if(n<20) 
		{
			System.out.print(one[n]);
		}
		else if(n>=20)
		{
			System.out.print(two[n/10]+one[n%10]);
		}
		if(n!=0)
			System.out.print(st+" ");
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your number:");
		int number=sc.nextInt();
		ConvertNoToWords c=new ConvertNoToWords();
		c.noToWod(number/10000000%100,"crore" );
		c.noToWod(number/100000%100, "lakh");
		c.noToWod(number/1000%100, "thousand");
		c.noToWod(number/100%10, "hundred");
		c.noToWod(number%100, "");

	}

}
