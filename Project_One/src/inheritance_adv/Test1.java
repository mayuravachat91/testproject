package inheritance_adv;

public class Test1 {

	public static void main(String[] args) {

		Child gpobj = new Child();
		
		System.out.println("the end...");
		
		gpobj.GPDisplay();
		
		System.out.println(gpobj.childAge);
		
		gpobj.childDisplay();
	}

}
