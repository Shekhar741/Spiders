package com.jspiders.fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyData {

	public static void main(String[] args) {
		System.out.println("Main method start");
		
		FileInputStream fin=null;
		FileOutputStream fout=null;
		try {
			fin=new FileInputStream("G:\\Raj\\NumberPattern1.java");
			fout=new FileOutputStream("G:\\Shekhar\\Pattern1.txt");
			int i;
			while((i=fin.read())!=-1) {
				System.out.print((char)i);  //To print in console
//				Thread.sleep(100);
				fout.write(i);
			}
			fout.flush();
			System.out.print("Successfully copied");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				fin.close();
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
