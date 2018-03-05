package com.jspiders.patterndisplay;

public class Pattern4 {

	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++) {                    //54321
			for(int j=n;j>i;j--) {                //5432
				System.out.print(j);              //543
			}                                     //54
			System.out.println();                 //5
		}

	}

}
