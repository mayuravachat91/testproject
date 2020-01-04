package Dec_11;

public class Manager extends Employee {
	double bonus;
	
	Manager(){
		
	}
	
	public Manager(int id, String name, double sal, double bonus) {
		super(id, name, sal);
		this.bonus = bonus;
		
	}

}
