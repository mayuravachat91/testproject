package Dec_14.Ass1;

import java.util.Scanner;

public class Student {
	int roll_no;
	String name;
	Department d;
	
	public Student(int id, String name, Department d) {
		this.roll_no = id ;
		this.name = name;
		this.d = d;
	}
	
	void display()
	{
		System.out.println("****** Student and Department Detail's ******");
		System.out.println("Roll No:: "+roll_no+"\n"+"Name of student:: "+name+"\n"+"Department id:: "+d.getDept_id()+"\n"+"Department name:: "+d.getDept_name());
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("****** Enter the detail ****** ");
		System.out.print("Enter the Name of student:: ");
		String name = sc.nextLine();
		
		System.out.print("Enter the Roll No of student:: ");
		int id = sc.nextInt();
		
		System.out.print("Enter the Name of department:: ");
		sc.next();
		String s = sc.nextLine();
		
		System.out.print("Enter the ID:: ");
		int n = sc.nextInt();
		
		Student stud = new Student(id, name, new Department(n, s));
		stud.display();
	}
}
