package com.collectionsConcepts;

public class DemoChild extends DemoMain {
	public void m() {
		System.out.println("Child method");
	}

	public static void main(String[] args) {
		
		DemoMain d=new DemoChild();
		d.m();

	}

}
