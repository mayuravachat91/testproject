package super_package;

class Animal3 {
	Animal3() {
		System.out.println("animal is created");
	}
}

class Dog3 extends Animal3 {
	Dog3() {
		System.out.println("dog is created");
	}
}

class TestSuper4 {
	public static void main(String args[]) {
		Dog3 d = new Dog3();
	}
}
