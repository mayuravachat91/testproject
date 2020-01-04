package Dec_14.Ass1;
/*
 3. Create Employee class which has attributes (id, name, salary, dept, mydate). 
 	Where dept and mydate is class, dept has (dept_id, dept_name)
    And mydate has (day, month, year).  Display Employee information.  
 	Note. Containment using constructor and getter/setter. 
*/

public class Employee {
	private int id;
	private String name;
	private double salary;
	Emp_Department d;
	MyDate joinning_date;
	
	/*public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}*/
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	void display() {
		System.out.println("!!!!!!!!!!!!!!!!Detail's of Employee!!!!!!!!!!!!!!!");
		System.out.println("ID:: "+id+"\n"+"Name of employee:: "+name+"\n"+"Salary:: "+salary);
		System.out.println("Department ID:: "+d.getDept_id()+"\n"+"Department_name :: "+d.getDept_name());
		System.out.println("Joinning Date:: "+joinning_date.getDay()+"/"+joinning_date.getMonth()+"/"+joinning_date.getYear());
	}
}