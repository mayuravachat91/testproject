package Des_06;

public class Employee9 {
	
	int id;
	String name;
	int salary;
	
	void init(int i, String n, int s)
	{
		id=i;
		name=n;
		salary=s;
		System.out.println("Id: " +id+ " Name: " +name+ " Salary: "+salary);
	}		
	
	public static void main(String[] args) {
		
		Employee9 e=new Employee9();
		e.init(12, "Rahul", 25000);
		Employee9 e2=e;

		
	}

}
