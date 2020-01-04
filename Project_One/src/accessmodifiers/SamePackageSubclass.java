package accessmodifiers;

public class SamePackageSubclass extends SameClassExample {
	public static void main(String[] args) {
		SamePackageSubclass samePackageSubclassObj = new SamePackageSubclass();
		System.out.println("public var : " + samePackageSubclassObj.publicVar);
		System.out.println("default var : " + samePackageSubclassObj.defaultVar);
		System.out.println("protected var : " + samePackageSubclassObj.protectedVar);
		//System.out.println("private var : " + samePackageSubclassObj.privateVar);
		System.out.println("-------------------------------------------------------");
	}
}
