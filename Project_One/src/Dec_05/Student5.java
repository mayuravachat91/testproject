package Dec_05;

public class Student5 {

	int id=4, id2=5;
	String name="Rahul Arun Misal";
	String name2="Bhagvat Khandekar";
	
	public static void main(String[] args) {
		
		Student5 s = new Student5();
		s.id=6;
		Student5 s2=new Student5();
		s2.id2=7;
		System.out.println("Id: "+s.id);
		System.out.println("Name: " +s.name);
		System.out.println("Id: "+s2.id2);
		System.out.println("Name: "+s2.name2);
	}

}
