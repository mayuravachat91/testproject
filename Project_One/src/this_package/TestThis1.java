package this_package;

class Student5 {
	int rollno;
	String name;
	float fee;

	Student5(int rollno, String name, float fee) {
		//System.out.println(rollno + " " + name + " " + fee);
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}
}

public class TestThis1 {
	public static void main(String args[]) {
		Student5 s1 = new Student5(111, "ankit", 5000f);
		Student5 s2 = new Student5(112, "sumit", 6000f);
		s1.display();
		s2.display();
	}
}