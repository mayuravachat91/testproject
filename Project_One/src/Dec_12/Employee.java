package Dec_12;

/*
3.	You have one class ‘Employee’ which have id, name, salary private data members, create getter and setter for the same.
Note: Getter and setter type, don’t use shortcut.

*/
import java.util.Scanner;

public class Employee {
	private int id;
	private String name;
	private double sal;
	
	//setter can set the id 
	public void setId(int id) {
		this.id =id;
	}
	
	//getter can get id to user
	public int getId() {
		return this.id;
	}
	
	// setter can set the String name
	public void setString(String name) {
		this.name = name;
	}

	// getter can get the string name to user
	public String getString() {
		return this.name;
	}

	// Setter can set the sal
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	// getter can get sal 
	public double getSal() {
		return this.sal;
	}
}