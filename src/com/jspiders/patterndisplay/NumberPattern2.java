package com.jspiders.patterndisplay;

public class NumberPattern2 {

	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<n-(i-1);j++) 
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(k);
			}
			for(int k1=i-1;k1>=1;k1--)
			{
				System.out.print(k1);
			}
			System.out.println();
		}
		//lower triangle    
        for(int i=1;i<=n-1;i++)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=n-i;k++)
            {
                System.out.print(k);
                
            }
            for(int k1=n-i-1;k1>=1;k1--)
            {
                    System.out.print(k1);
            }
            System.out.println();     
        }


	}

}
