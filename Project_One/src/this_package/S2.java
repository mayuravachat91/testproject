package this_package;

class S2 {
	
	private S2(){
		System.out.println("s2..");
	}
	
	void m(S2 obj) {
		
		System.out.println("method is invoked");
	}

	void p() {
		System.out.println(this);
		m(this);
	}
	

	public static void main(String args[]) {
		S2 s1 = new S2();
		System.out.println(s1);
		s1.p();
	}
}
