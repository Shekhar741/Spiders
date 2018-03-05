package com.jspiders.patterndisplay;

public class NumberPattern1 {

	public static void main(String[] args) {
		   int num = 4;
           //upper triangle
           for(int i=1;i<=num;i++)
           {
               for(int j=1;j < num-(i-1);j++)
               {
                   System.out.print(" ");
               }
               for(int k=i;k>=1;k--)
               {
                   System.out.print(k);
               }
               for(int k1=2;k1<=i;k1++)
               {
                   System.out.print(k1);
               }
               System.out.println();
           }
           //lower triangle    
           for(int i=1;i<=num-1;i++)
           {
               for(int j=i;j>=1;j--)
               {
                   System.out.print(" ");
               }
               for(int k=num-i;k>=1;k--)
               {
                   System.out.print(k);
                   
               }
               for(int k1=2;k1<=num-i;k1++)
               {
                       System.out.print(k1);
               }
               System.out.println();     
           }

	}

}
