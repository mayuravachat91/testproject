package Static;

public class StaticExample {

	int i = 120;
	static int anotherValue = 230;
	
	static void displayStaticMethodBehaviour() {
		
		//static method cant access non static / instance variables
		//i = 331;
		//System.out.println("i is " + i);

		//static methods 
		//check the value of anotherValue
		System.out.println("anotherValue is " + anotherValue);

		//change the value of anotherValue for obj1
		anotherValue++;
		
		//now check the value of anotherValue in both objects
		System.out.println("anotherValue is " + anotherValue);
		
	}

	public static void main(String args[]) {
		
		//value variable has a copy per obj / class instance
		StaticExample obj1 = new StaticExample();
		obj1.i = 331;
		System.out.println("obj1.i is " + obj1.i);

		StaticExample obj2 = new StaticExample();
		obj2.i = 441;
		System.out.println("obj2.i is " + obj2.i);

		//check the value of anotherValue in both objects
		System.out.println("obj1.anotherValue is " + obj1.anotherValue);
		System.out.println("obj2.anotherValue is " + obj2.anotherValue);

		//change the value of anotherValue for obj1
		obj1.anotherValue++;
		
		//now check the value of anotherValue in both objects
		System.out.println("obj1.anotherValue is " + obj1.anotherValue);
		System.out.println("obj2.anotherValue is " + obj2.anotherValue);
		

		//change the value of anotherValue for obj2
		obj2.anotherValue++;
		//again check the value of anotherValue in both objects
		System.out.println("obj1.anotherValue is " + obj1.anotherValue);
		System.out.println("obj2.anotherValue is " + obj2.anotherValue);

		// check if value of i has changed
		System.out.println("obj1.i is " + obj1.i);
		System.out.println("obj2.i is " + obj2.i);
		//object variable i is still holding respective value of i 
		
		
		//static variables are variables shared across the class
		//static variables have only 1 copy
		//while non-static variables are separate copies for each obj
		
		//Correct way of accessing anotherValue
		System.out.println("StaticExample.anotherValue is " + StaticExample.anotherValue);
		
		StaticExample.anotherValue = 551;

		//Since there is only 1 copy of the variable anotherValue, print the variable via object or class yields the same output
		System.out.println("obj1.anotherValue is " + obj1.anotherValue);
		System.out.println("obj2.anotherValue is " + obj2.anotherValue);
		System.out.println("StaticExample.anotherValue is " + StaticExample.anotherValue);
		
		
		
		//static method
		StaticExample.displayStaticMethodBehaviour();
	}

}
