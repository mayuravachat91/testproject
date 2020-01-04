package accessmodifiers;

public class SameClassExample {
	public int publicVar = 10;
	int defaultVar = 20;
	protected int protectedVar = 30;
	private int privateVar = 40;
	
	public static void main(String[] args) {
		SameClassExample sameClassExampleObj = new SameClassExample();
		System.out.println("public var : " + sameClassExampleObj.publicVar);
		System.out.println("default var : " + sameClassExampleObj.defaultVar);
		System.out.println("protected var : " + sameClassExampleObj.protectedVar);
		System.out.println("private var : " + sameClassExampleObj.privateVar);
		System.out.println("-------------------------------------------------------");
		sameClassExampleObj.display();
	}

	private void display() {
		System.out.println("public var : " + publicVar);
		System.out.println("default var : " + defaultVar);
		System.out.println("protected var : " + protectedVar);
		System.out.println("private var : " + privateVar);
	}
}
