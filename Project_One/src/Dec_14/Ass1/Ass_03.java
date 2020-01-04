package Dec_14.Ass1;

import java.util.Scanner;

public class Ass_03 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Employee emp =new Employee();
		emp.d=new Emp_Department();
		emp.joinning_date = new MyDate();
		
		System.out.println("!!!!!!!!!!!!!!!!Enter the Detail's of Employee!!!!!!!!!!!!!!!");
		System.out.print("Enter the name:: ");
		String name = sc.nextLine();
		emp.setName(name);
		
		System.out.print("Enter the id:: ");
		int id = sc.nextInt();
		emp.setId(id);
		
		System.out.print("Enter the salary: ");
		double salary = sc.nextDouble();
		emp.setSalary(salary);
		
		System.out.print("Enter the department name: ");
		String dept_name = sc.nextLine();
		sc.next();
		emp.d.setDept_name(dept_name);
		
		System.out.print("Enter the dept_id: ");
		int dept_id = sc.nextInt();
		emp.d.setDept_id(dept_id);
		
		System.out.println("Enter the day: ");
		int day = sc.nextInt();
		emp.joinning_date.setDay(day);
		
		System.out.println("Enter the Month: ");
		int month = sc.nextInt();
		emp.joinning_date.setMonth(month);
		
		System.out.println("Enter the year: ");
		int year = sc.nextInt();
		emp.joinning_date.setYear(year);
		
		emp.display();
	}
}
