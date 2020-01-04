package Dec_12;

/*4.	
  Class Student have roll_no, name. create getter and setter for the same
*/

public class Student {
	private int roll_no;
	private String name;
	
	// setter can set the roll number
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	
	// setter can set the roll number
	public int getRoll_no() {
		return this.roll_no;
	}
	
	// setter can set the String name
	public void setString(String name) {
		this.name = name;
	}

	// getter can get the string name to user
	public String getString() {
		return this.name;
	}
}
