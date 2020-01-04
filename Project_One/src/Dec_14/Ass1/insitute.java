package Dec_14.Ass1;

public class insitute {
	private int id;
	private String iname;
	Branch b;
	/*private Branch b;
	
	public Branch getB() {
		return b;
	}
	public void setB(Branch b) {
		this.b = b;
	}*/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	
	void display() {
		System.out.println("ID:: "+id+"\n"+"Name :: "+iname);
		System.out.println("ID:: "+b.getId()+"\n"+"Name :: "+b.getB_name());
		System.out.println("ID:: "+b.sb.getId()+"\n"+"Name :: "+b.sb.getS_name());
		System.out.println("ID:: "+b.sb.t.getId()+"\n"+"Name :: "+b.sb.t.getT_name());
		System.out.println("ID:: "+b.sb.t.sub_topic.getId()+"\n"+"Name :: "+b.sb.t.sub_topic.getS_name());
		System.out.println("ID:: "+b.sb.t.sub_topic.q.getId()+"\n"+"Name :: "+b.sb.t.sub_topic.q.getQ_name());
		
	}
}
