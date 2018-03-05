package com.jspiders.numberPrograms;

import java.util.Scanner;

public class DecToHexConversion {
	 public static String Hexa(String s) {
	        String result = "";
	        int n = Integer.parseInt(s);
	        int remainder = n % 16;

	        if (n == 0) {
	            return "";
	        } else {
	            switch (remainder) {
	                case 10:
	                    result = "A";
	                    break;
	                case 11:
	                    result = "B";
	                    break;
	                case 12:
	                    result = "C";
	                    break;
	                case 13:
	                    result = "D";
	                    break;
	                case 14:
	                    result = "E";
	                    break;
	                case 15:
	                    result = "F";
	                    break;
	                default:
	                    result = remainder + result;
	                    break;
	            }
	            return Hexa(Integer.toString(n / 16)) + result;
	        }
	    }
		
		
	
		
	

	public static void main(String[] args) {
		System.out.println("Enter the number to convert:");
		Scanner sc= new Scanner(System.in);
	    String st= sc.next();
	    String hex=Hexa(st);
		System.out.println("Equivalent Hexadecimal number is:"+hex);
		

	}

}
