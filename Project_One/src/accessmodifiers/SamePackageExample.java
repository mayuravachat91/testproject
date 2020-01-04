package accessmodifiers;

class Example {
	public int publicVar = 10;
	int defaultVar = 20;
	protected int protectedVar = 30;
	private int privateVar = 40;
}

public class SamePackageExample {

	public static void main(String[] args) {
		Example exampleObj = new Example();
		System.out.println("public var : " + exampleObj.publicVar);
		System.out.println("default var : " + exampleObj.defaultVar);
		System.out.println("protected var : " + exampleObj.protectedVar);
		//System.out.println("private var : " + exampleObj.privateVar);
		System.out.println("-------------------------------------------------------");
	}
}
