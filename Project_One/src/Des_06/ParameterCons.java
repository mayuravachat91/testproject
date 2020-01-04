package Des_06;

public class ParameterCons {
	
	int id;
	String name;
	
	ParameterCons(int i,String s) {
		
		id=i;
		name=s;
	}

	public static void main(String[] args) {
		
		ParameterCons pc=new ParameterCons(100,"Karan");
		System.out.println("I Am In Paramererized Constructor");
		ParameterCons pc2=new ParameterCons(420,"Rahul");
		System.out.println(pc2.id+" "+pc2.name );

	}

}
