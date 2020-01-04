package inheritance_adv;

public class Child extends Parent {
	int childAge = 7;
	
	public Child(){
		System.out.println("Inside Child Default Constructor...");
	}
	
	public Child(int num){
		System.out.println("Child param....");
	}
	
	public void childDisplay(){
		System.out.println(super.childAge);
		System.out.println("Child Display.....");
	}
}
