package array;

class Student{
	public int id;
	public String name;
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

public class Example6 {
	public static void main(String[] args) {

		Student studarr[] = new Student[3];

		Student s1 = new Student(1001, "aaa");
		Student s2 = new Student(2001, "bbb");
		
		studarr[0] = s1;
		studarr[1] = s2;
		
		studarr[2] = new Student(3001, "ccc");
		
		for(int i = 0; i < studarr.length; i++){
			System.out.println(studarr[i].id);
			System.out.println(studarr[i].name);
			System.out.println("--------------------------------------");
		}
		
	}

}
