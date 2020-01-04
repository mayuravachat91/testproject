package Dec_14.Ass1;

public class Ass_05 {

	public static void main(String[] args) {
		insitute i = new insitute();
		//Branch b = new Branch(); 
		//i.setB(new Branch());
		i.b = new Branch();
		i.b.sb = new Subject();
		i.b.sb.t = new Topic();
		i.b.sb.t.sub_topic = new Sub_topic();
		i.b.sb.t.sub_topic.q = new Question();
		
		i.setId(12);
		i.setIname("Indira");
		i.b.setId(15);
		i.b.setB_name("Science");
		i.b.sb.setId(25);
		i.b.sb.setS_name("Comp");
		i.b.sb.t.setId(50);
		i.b.sb.t.setT_name("Math");
		i.b.sb.t.sub_topic.setId(86);
		i.b.sb.t.sub_topic.setS_name("C");
		i.b.sb.t.sub_topic.q.setId(14);
		i.b.sb.t.sub_topic.q.setQ_name("programming");
		
		i.display();
	}

}
