package Dec_12;

public class Employee_final3 extends Employee_final{

	public static void main(String[] args) {
		Employee_final3 emp3 = new Employee_final3();
		Employee_final2 emp2 = new Employee_final2();
		Employee_final emp = new Employee_final3();
		
		emp3.display(25);
		emp2.fun();
		emp.display2();
		/*emp.id = 20; // can not change the value of variable (bcoz it's define as a final
*/	}

}
