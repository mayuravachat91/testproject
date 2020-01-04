package Des_06;

public class Employee4 {
	
	int id;
	String name;
	int salary;
	
	void display()
	{
		id=26;
		name="Rahul";
		salary=25000;
		System.out.println("Id: " +id+ " Name: " +name+ " Salary: "+salary);

	}

	public static void main(String[] args) {
		
		Employee4 e=new Employee4();
		 e.display();
	}

}
