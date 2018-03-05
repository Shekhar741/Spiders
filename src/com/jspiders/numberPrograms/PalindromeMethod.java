package com.jspiders.numberPrograms;

public class PalindromeMethod {
	static boolean isPalindrome(int n) {
		int temp=n;
		int num=n;
		int sum=0;
		while(num>0)
		{
			sum=(sum*10)+num%10;
			num=num/10;
		}
		if(sum==temp)
		{
			return true;
		}
		return false;
		
	}

	public static void main(String[] args) {
		int []a= {11,12,13,22,23,33,44,45};
		System.out.println("Array elements are:");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Palindrome numbers are:");
		
		for(int i=0;i<a.length;i++) {
			boolean res=isPalindrome(a[i]);
			if(res)
				System.out.print(a[i]+" ");
		}
		System.out.println();

	}

}
