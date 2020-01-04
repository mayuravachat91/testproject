package Dec_12;

import java.util.Scanner;

public class Student_test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		Student stud = new Student();
		
		System.out.print("Enter the Name:: ");
		String s = sc.nextLine();
		stud.setString(s);
		
		System.out.print("Enter the ID:: ");
		int n = sc.nextInt();
		stud.setRoll_no(n);
		
		System.out.println("******** Detail's of Employee ********");
		System.out.println("ID :: "+stud.getRoll_no());
		System.out.println("Name :: "+stud.getString());
	}
}
