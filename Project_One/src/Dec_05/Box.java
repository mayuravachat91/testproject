package Dec_05;

public class Box {

	double height,width,depth;
	
	void getVolume()
	{
		double volume=height*width*depth;
		System.out.println("Volume: "+volume);
	}
	public static void main(String[] args) {	
		
		Box b=new Box();
		b.height=10;
		b.depth=20;
		b.width=15;
		
		b.getVolume();

	}

}
