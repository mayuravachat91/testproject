package Static;

public class classStatic {
	int i = 20;
	static int anotherValue = 130;
	
	static void displayStaticMethodBehavoiur() {
		System.out.println("anotherValue is "+ anotherValue);
		anotherValue++;
		System.out.println("anotherValue is "+ anotherValue);
	}
	public static void main(String[] args) {
		classStatic obj1 = new classStatic();
		obj1.i = 123;
		System.out.println("obj1.i = "+obj1.i);
		
		classStatic obj2 = new classStatic();
		obj2.i = 200;
		System.out.println("obj2.i = "+obj2.i);
		
		System.out.println("obj1.anotherValue is "+ obj1.anotherValue);
		System.out.println("obj2.anotherValue is "+obj2.anotherValue);
		
		obj1.anotherValue++;
		System.out.println("obj1.anotherValue is "+ obj1.anotherValue);
		System.out.println("obj2.anotherValue is "+obj2.anotherValue);
		
		obj2.anotherValue++;
		System.out.println("obj1.anotherValue is "+ obj1.anotherValue);
		System.out.println("obj2.anotherValue is "+obj2.anotherValue);
		classStatic.displayStaticMethodBehavoiur();
	}

}
