package Dec_07;

public class Cycle {
	
	int acc_no;
	int noOfWheels;
	
	public Cycle() {
		System.out.println("This Default Consructor");
	}
	
	public Cycle(int a,int b){
		this();
		System.out.println("This is another constructor");
	}

	public static void main(String[] args) {
		
		Cycle c=new Cycle();
		Cycle c2=new Cycle(26,2);
		

	}

}
