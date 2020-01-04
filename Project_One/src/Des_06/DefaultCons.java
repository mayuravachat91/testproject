package Des_06;

public class DefaultCons {
	
	int id;
	String s;
	
	public DefaultCons() {
		
		id=420;
		s="Mayur";
	}

	public static void main(String[] args) {
		
		DefaultCons dc=new DefaultCons();
		System.out.println("I Am In Default Constructor");
		System.out.println(dc.id+" "+dc.s );

	}

}
