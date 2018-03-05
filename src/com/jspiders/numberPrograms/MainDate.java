package com.jspiders.numberPrograms;

public class MainDate {
	
	

	public static void main(String[] args) {
		Date dob= new Date(14,7,1988);
		Date today= new Date(22,9,2017);
		System.out.println(dob.getNoOfDays());
		System.out.println(today.getNoOfDays());
		int days=today.getNoOfDays()-dob.getNoOfDays();
		System.out.println("I spended "+days+" days");
		System.out.println("I am "+days/365+" years old");
		

	}

}

class Date{
	int dd;
	int mm;
	int year;
	Date(int dd,int mm,int year){
		this.dd=dd;
		this.mm=mm;
		this.year=year;
	}
	int getNoOfDays() {
		int y=year-1;
		int dy=y*365;
		int leap=y/400+y/4-y/100;
		dy=dy+leap;
		int month[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if(year%4==0&&year%100!=0||year%400==0)
			month[2]=29;
		for(int i=1;i<mm;i++) {
			dy=dy+month[i];
		}
		return dy+dd;
		
	}
}
