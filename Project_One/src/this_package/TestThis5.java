package this_package;

class AA {
	AA() {
		this(10, 20);
		System.out.println("Hello aa.....");
	}

	AA(int x) {
		this();
		m1();
		System.out.println(x);
	}
	
	AA(int x, int y) {
		System.out.println(x + y);
	}
	
	public void m1(){
		System.out.println("inside m1..");
	}
}

class TestThis5 {
	public static void main(String args[]) {
		AA a = new AA(10);
	}
}