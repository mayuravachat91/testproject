package Dec_14.Ass1;
/*
1. WAP to have Department class created with dept_id, dept_name . Student class has roll, name and Department object should have id and name. 
Assign and print individual values in main method.     
Note: Containment Using Constructor and getter/setter. 
*/
public class Department {
	
	private int dept_id;
	private String dept_name;
	
	public Department(int id, String d_name) {
		this.dept_id = id;
		this.dept_name =d_name;
	}
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
}
