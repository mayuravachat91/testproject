package Dec_12;

import java.util.Scanner;

public class Employee_test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		Employee emp = new Employee();
		
		System.out.print("Enter the Name:: ");
		String s = sc.nextLine();
		emp.setString(s);
		
		System.out.print("Enter the ID:: ");
		int n = sc.nextInt();
		emp.setId(n);
		
		System.out.print("Enter the Salary:: ");
		double salary = sc.nextDouble();
		emp.setSal(salary);
		

		System.out.println("******** Detail's of Employee ********");
		System.out.println("ID :: "+emp.getId());
		System.out.println("Name :: "+emp.getString());
		System.out.println("Salary :: "+emp.getSal());
	}
}
