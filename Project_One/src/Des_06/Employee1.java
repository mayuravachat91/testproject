package Des_06;

public class Employee1 {
	
	int id;
	String name;
	double salary;
	
	void displayInfo() {
		id=10;
		name="Rahul";
		salary=25000;
		System.out.println("Id: "+id+" Name: "+name+" Salary "+salary);
	}

	public static void main(String[] args) {
		
		Employee1 e=new Employee1();
		e.displayInfo();
		

	}

}
