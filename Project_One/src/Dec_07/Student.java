package Dec_07;

public class Student {
	
	int roll_no;
	String name;
	
	public Student() {
		
		System.out.println("Default Constructor");
	}
	
	void init(int r,String s) {
		
		this.roll_no=roll_no;
		this.name=name;
		this.disp();
	}
	
	public Student(int r,String s) {
		this();
		Student s1=new Student();
		this.roll_no=roll_no;
		this.name=name;
	
	}
	
	void disp() {
		
		Student s2=new Student(23, "Rahul");
		System.out.println("This is init method in display method");
		
	}
	
	Student disp2() {	
		System.out.println("Return This");
		return this;		
	}
	
	public static void main(String[] args) {
		
		Student s=new Student();
		
		s.init(45, "Metal");
		s.roll_no=25;
		s.name="Metal";
		System.out.println(s.roll_no+ " " +s.name);
		s.disp();
		s.disp2();
	}

}
