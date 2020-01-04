package super_package;

class B{
	
	 public void buyCar(){
		 System.out.println("buy nano...");
	 }

}


public class A extends B {
	
	public void buyCar(){
		System.out.println("buy bmw car..");
		
		super.buyCar();
		
	}
	

	
	public static void main(String[] args) {
		A obj = new A();
		
		obj.buyCar();
		
	}

}
