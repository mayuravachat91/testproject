package Dec7_Inheritance;

public class MultiEmployee3 extends MultiEmployee2 {

	void display2() {
		
		System.out.println("Hello Again");
	}
	public static void main(String[] args) {
		
		MultiEmployee3 mp=new MultiEmployee3();
		mp.display();
		mp.display2();

	}

}
