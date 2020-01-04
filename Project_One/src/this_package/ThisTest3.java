package this_package;

public class ThisTest3 {
	
	ThisTest3(){
		System.out.println("Default constructor...");
	}
	
	ThisTest3(int num){
		this(56, 78);
		System.out.println("single param constructor...");
	}
	
	ThisTest3(int num1, int num2){
		System.out.println("double param constructor...");
	}

	public static void main(String[] args) {
		
		ThisTest3 obj = new ThisTest3(12);

	}

}
