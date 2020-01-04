package accessmodifiers1;


public class OtherPackageSubclass1 extends OtherPackageClass {
	public static void main(String[] args) {
		OtherPackageClass otherPackageSubclassObj = new OtherPackageClass();
		System.out.println("public var : " + otherPackageSubclassObj.publicVar);
		System.out.println("default var : " + otherPackageSubclassObj.defaultVar);
		System.out.println("protected var : " + otherPackageSubclassObj.protectedVar);
		System.out.println("private var : " + otherPackageSubclassObj.privateVar);
		System.out.println("-------------------------------------------------------");
	}
}
