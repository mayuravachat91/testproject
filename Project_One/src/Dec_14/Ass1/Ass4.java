package Dec_14.Ass1;

public class Ass4 {

	public static void main(String[] args) {
		Car c = new Car();
		c.g = new Gear();
		c.e = new Engine();
		c.e.se = new SubEngine();
		c.setId(112);
		c.setName("Honda");
		c.g.setGear_id(125);
		c.g.setNo_of_gear(6);
		c.e.setEid(12456);
		c.e.setEname("ab125hhd99");
		c.e.se.setSub_e_id(12486);
		c.e.se.setSub_e_model(55454);
		
		c.display();
	}
}
