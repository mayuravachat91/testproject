package Des_06;

public class Employee3 {
	
	int id;
	String name;
	int salary;
	
	void init(int i,String n,int s)
	{
		id=i;
		name=n;
		salary=s;
		System.out.println("Id: " +id+ " Name: " +name+ " Salary: "+salary);

	}

	public static void main(String[] args) {
		
		Employee3 e=new Employee3();
		 e.init(12, "Rahul", 25000);
	}

}
