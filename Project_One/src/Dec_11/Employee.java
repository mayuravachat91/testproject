package Dec_11;

public class Employee {
	int id;
	String name;
	double sal;
	
	Employee(){
		
	}
	
	Employee(int id, String name, double sal)
	{
		this.id= id;
		this.name= name;
		this.sal= sal;
	}
	
	void display() {
		System.out.println("Id: " +id+ " Name: " +name+ " Salary: "+sal);
	}
	
}

