package inheritance;

public class ChildClass extends SingleInheritance{
		
		int b=24;
		String s1="Misal";	
		

	public static void main(String[] args) {
		
		ChildClass i=new ChildClass();
		i.display();
		System.out.println(i.b+" "+i.s1);

	}
}