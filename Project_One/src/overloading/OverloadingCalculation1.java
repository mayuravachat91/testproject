package overloading;

class OverloadingCalculation1 {
	
	
	int sum(int a, int b) {
		System.out.println("void sum(int a, int b) : ");
		System.out.println(a + b);
		return a+b;
	} 
	
	
	void sum(int a, float f) {
		System.out.println("In int, float");
	}
	
	void sum(float f, int a) {
		System.out.println("In  float, int");
	}

	void sum(int a, int b, int c) {
		System.out.println("void sum(int a, int b, int c) : ");
		System.out.println(a + b + c);
	}
	
	void sum(int a, int b, int c, int d) {
		System.out.println("void sum(int a, int b, int c,int d) : ");
		System.out.println(a + b + c + d);
	}

	public static void main(String args[]) {
		OverloadingCalculation1 obj = new OverloadingCalculation1();
//		obj.sum(20, 20);// now second int literal will be promoted to long
//		obj.sum(20, 20, 20);
//		obj.sum(23, 25, 27, 20);
		obj.sum(60.8f, 10);

	}
}