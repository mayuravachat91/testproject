package this_package;

public class ThisTest1 {
	
	// this - instance variables
	// instance variables
	int num;
	String name;
	
	ThisTest1(int num, String name){
		this.num = num;
		this.name = name;
	}
	
	ThisTest1(){
		System.out.println("Deafult constructor..");
	}

	public static void main(String[] args) {
		
		ThisTest1 thisTest1Obj = new ThisTest1(100, "aaa");
		
		System.out.println("Num : " + thisTest1Obj.num);
		System.out.println("Name  : " + thisTest1Obj.name);
		
		ThisTest1 thisTest1Obj1 = new ThisTest1();

	}

}
