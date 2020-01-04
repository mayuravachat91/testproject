package this_package;

class A {
	void m() {
		System.out.println("Hello m.....");
	}

	void n() {
		m();
		System.out.println("Hello n.....");
		this.m();
	}
}

class TestThis4 {
	public static void main(String args[]) {
		System.out.println("original main...");
		A a = new A();
		a.n();
	}
	
}
