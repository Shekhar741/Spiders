package com.jspiders.stringPrograms;

import java.util.Scanner;

public class RandomWordFormation {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the String:");
		String st=scanner.nextLine();
		String i = "";
		while(st.length() != 0) {
			try {
				if(st.length() % 2 ==0) {
					if(i.length()==0) {
						i = st.substring(0, 2);
						st = st.substring(2);
					}else {
						i = st.substring(0,1) + i + st.substring(1,2);
						st = st.substring(2);
					}
				}else {
					if(i.length()==0) {
						i = st.substring(0, 1);
						st = st.substring(1);
					}else {
						i = st.substring(0,1) + i + st.substring(1,2);
						st = st.substring(2);
					}
				}
			}catch(IndexOutOfBoundsException e) {
				System.out.println("Exception.");
			}
		}
		System.out.println(i);	
		

	}

}
