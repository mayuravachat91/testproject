package overloading;

class Adder2 {
	 void add(int a, int b) {
		 System.out.println("1");
		
		
	}

	 void add(double a, double b) {
		 System.out.println("2");
		
		
	}
}

class TestOverloading3 {
	public static void main(String[] args) {
		Adder2 obj = new Adder2();
		obj.add(2,5);
	}
}