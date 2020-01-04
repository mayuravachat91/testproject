package accessmodifiers;

import accessmodifiers1.OtherPackageClass;

public class OtherPackageNoSubclass {
	public static void main(String[] args) {
		OtherPackageClass otherPackageClassObj = new OtherPackageClass();
		System.out.println("public var : " + otherPackageClassObj.publicVar);
		//System.out.println("default var : " + otherPackageClassObj.defaultVar);
		//System.out.println("protected var : " + otherPackageClassObj.protectedVar);
		//System.out.println("private var : " + otherPackageClassObj.privateVar);
		System.out.println("-------------------------------------------------------");
	}
}
