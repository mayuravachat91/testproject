package inheritance_adv;

public class GrandParent {
	int grandParentAge = 77;
	int childAge = 777;
	
	/*public GrandParent(){
		System.out.println("Inside GrandParent Default Constructor...");
	}*/
	
	public GrandParent(int grandParentAge){
		System.out.println("Inside GrandParent Parameterized Constructor...");
	}
	
	public void GPDisplay(){
		System.out.println("GP Display.....");
	}
	
}
