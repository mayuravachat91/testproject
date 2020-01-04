package Dec_14.Ass1;
/*
 2. Create class Person which has attributes (name, gender, age, Address). 
 	Address is class which has attributes (city, state, country).
  	Display Persons data  Note. Containment using constructor and getter/setter. 
*/
public class Person {
	private String name;
	private String gender;
	private int age;
	private String Address;
	Address a;
	
	public Person(String name, String gender, int age, String Address, Address a) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.Address = Address;
		this.a = a;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	void display() {
		System.out.println("****** Person Detail's ******");
		System.out.println("Name:: "+getName()+"\n"+"Gender:: "+getGender()+"\n"+"Age:: "+getAge()+"\n"+"Address:: "+getAddress());
		System.out.println("City:: "+a.getCity()+"\n"+"State:: "+a.getState()+"\n"+"country:: "+a.getCountry());
	}
}
