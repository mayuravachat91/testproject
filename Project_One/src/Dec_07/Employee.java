package Dec_07;

import java.util.Scanner;

public class Employee {
	int id;
	String name;
	double salary;
	
	void init(int id, String name, double sal){
		this.id = id;
		this.name = name;
		this.salary = sal;
	}		
	
	void display() {
		System.out.println("Id: "+id+"\n"+"Name: "+name+"\n"+"Salary: "+salary);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("::Enter the details of Employee:: ");
		
		/*Enter the name of employee*/
		System.out.print("Enter the Name:: ");
		String names = sc.nextLine();
		
		/*Enter the id of Employee*/
		System.out.print("Enter the id:: ");
		int roll_no = sc.nextInt();
		
		/*Enter the Salary*/
		System.out.print("Enter the Salary:: ");
		double sal =sc.nextDouble();
		
		Employee e= new Employee();
		e.init(roll_no, names, sal);
		e.display();
	}
}

