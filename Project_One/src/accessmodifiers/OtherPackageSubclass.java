package accessmodifiers;

import accessmodifiers1.OtherPackageClass;

public class OtherPackageSubclass extends OtherPackageClass{
	public static void main(String[] args) {
		OtherPackageSubclass otherPackageSubclassObj = new OtherPackageSubclass();
		System.out.println("public var : " + otherPackageSubclassObj.publicVar);
		//System.out.println("default var : " + otherPackageSubclassObj.defaultVar);
		System.out.println("protected var : " + otherPackageSubclassObj.protectedVar);
		//System.out.println("private var : " + otherPackageSubclassObj.privateVar);
		System.out.println("-------------------------------------------------------");
	}
}
