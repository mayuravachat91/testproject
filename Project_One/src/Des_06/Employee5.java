package Des_06;

public class Employee5 {
	
	int id;
	String name;
	int salary;
	
	void display()
	{
		id=24;
		name="Rahul.Misal";
		salary=50000;
		System.out.println("Id: " +id+ " Name: " +name+ " Salary: "+salary);

	}

	public static void main(String[] args) {
		new Employee5().display();
		
	}

}
