package Dec_14.Ass1;
/*
4. Create class Car which has Attributes (id, name, Engine, Gear). Where Engine and Gear is class, Gear has (gear_id, no_of_gear)  and 
   Engine has (eid, ename, SubEngine) Again SubEngine is class SubEngine has (sub_e_id, sub_e_model).
   Note. Containment using constructor and getter/setter. 
*/
public class Car {
	private int id;
	private String name;
	Engine e;
	Gear g;
	
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
	
	void display() {
		System.out.println("ID:: "+id+"\n"+"Name of car:: "+name);
		System.out.println("ID:: "+e.getEid()+"\n"+"Name of engine:: "+e.getEname());
		System.out.println("ID:: "+g.getGear_id()+"\n"+"No of gear:: "+g.getGear_id());
		System.out.println("ID:: "+e.se.getSub_e_id()+"\n"+"Name of model:: "+e.se.getSub_e_model());
	}
}
