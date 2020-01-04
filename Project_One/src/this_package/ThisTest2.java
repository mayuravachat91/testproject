package this_package;

public class ThisTest2 {

	// method
	
	public void add(int num1, int num2){
		this.display(num1, num2);
	}
	
	private void display(int num1, int num2){
		System.out.println("Display..." + (num1 + num2));
		System.out.println(num1 + num2);
		int result = num1 + num2;
		
		
		System.out.println("Display...." + result);
	}
	
	public static void main(String[] args) {
		ThisTest2 obj = new ThisTest2();
		
		obj.add(10, 30);

	}

}
