package Des_06;

import java.util.Scanner;

public class Student {
	int id;
	String name;
	long cont_no;
	double marks;
	private static Scanner sc;
	 
	Student(int n, String ss, long no, double m){
		id = n;
		name = ss;
		cont_no = no;
		marks = m;
	}
	
	void disp() {
		System.out.println("::STUDENT DETAILS:: "+"\n"+"ID:: "+id+"\n"+"Name:: "+name+"\n"+"Contact No:: "+cont_no+"\n"+"Marks:: "+marks);
	}
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("::Enter the details of student:: ");
		
		/*Enter the name of student*/
		System.out.println("Enter the Name:: ");
		String names = sc.nextLine();
		
		/*Enter the id of student*/
		System.out.println("Enter the id:: ");
		int roll_no = sc.nextInt();
		
		/*Enter the Contact number of student*/
		System.out.println("Enter the Contact number:: ");
		long cont_nos =sc.nextLong();
		
		/*Enter the marks of student*/
		System.out.println("Enter the Marks:: ");
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int m3 = sc.nextInt();
		int m4 = sc.nextInt();
		int m5 = sc.nextInt();
		
		/*If the mark is less than 35 then output is fail*/
		if (m1 < 35 || m2 < 35 || m3 < 35 || m4 < 35 || m5 < 35 ) {
			System.out.println("Fail");
		}
		
		/*Calculate the percentage*/
		int addition = m1 + m2 + m3 + m4 + m5;
		System.out.println(addition);
		double per = addition / 5 ;
		
		/*Create object of class*/
		Student s = new Student(roll_no, names, cont_nos, per);
		s.disp();
	}
	

}
