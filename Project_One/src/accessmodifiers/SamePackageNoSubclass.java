package accessmodifiers;

public class SamePackageNoSubclass {
	public static void main(String[] args) {
		Example exampleObj = new Example();
		System.out.println("public var : " + exampleObj.publicVar);
		System.out.println("default var : " + exampleObj.defaultVar);
		System.out.println("protected var : " + exampleObj.protectedVar);
		//System.out.println("private var : " + exampleObj.privateVar);
		System.out.println("-------------------------------------------------------");
	}
}
