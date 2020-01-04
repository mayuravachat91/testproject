package Dec_05;

public class Student6 {
	
	int id=22;
	String name="Rohit";
	
	void displayData()
	{
		id=26;
		name="Rahul Arun Msal";
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		
	}

	public static void main(String[] args) {
		Student6 s=new Student6();
		
		s.displayData();

	}

}
