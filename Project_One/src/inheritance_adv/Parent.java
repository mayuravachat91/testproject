package inheritance_adv;

public class Parent extends GrandParent {
	
	int prentAge = 37;
	int childAge = 77;

	public Parent() {
		super(66);
		System.out.println("Parent default con...");
	}
	
	public Parent(int age){
		super(66);
		System.out.println("Parent param....");
	}

	
	public void pDisplay(){
		System.out.println("p Display.....");
	}
	
	public void GPDisplay(){
		System.out.println("GP parent Display.....");
	}
	
}
