package Dec_05;

public class Student8 {
	
	int customId;
	String customName;
	
	void init(int id, String name) {
		 customId=id;
		 customName=name;
	}
	void customData() {
		
		System.out.println("Id: "+customId);
		System.out.println("Name: "+customName);
	}

	public static void main(String[] args) {
		
		Student8 s=new Student8();
		s.init(15,"Rahul");
		s.customData();

	}

}
