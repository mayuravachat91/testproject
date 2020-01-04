package Dec_05;

public class Student7 {

	int id;
	String name;
	
	void getId()
	{
		id=14;
		System.out.println("Id: "+id);

	}
	void displayData() {
		
		getId();
		name="Rahul Misal";
		System.out.println("Name: "+name);
	}
	public static void main(String[] args) {
		Student7 s=new Student7();
		s.displayData();

	}

}
