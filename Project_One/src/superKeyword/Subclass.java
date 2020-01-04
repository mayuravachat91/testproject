package superKeyword;


//Parent class or Superclass
class Parentclass
{
   int num=4;
   int j = 12;
}
//Child class or subclass
public class Subclass extends Parentclass
{
   int num=110;
   
   void printNumber(){
      //Super.variable_name
      System.out.println(super.num);
      num = 23;
      j = 12;
   }
   
   public static void main(String args[]){ 
      Subclass obj= new Subclass();
      obj.printNumber();	
   }
   
}

class Animal {
    
	protected String name; // use of protected keyword

	void eat() {
		System.out.println("eating...");
	}
}

class Dog extends Animal {// use of extends keyword
    
	private int age = 3;// use of private keyword

	void eat() {
		name = "jack";
		System.out.println(name + "eating bread...");
	}

	void bark() {
		System.out.println("barking...");
	}

	void work() {
		super.eat();// use of super keyword
		bark();
	}

	void age() {
		int noOfLegs = new Parentclass().num; // use of new keyword
		System.out.println("no of legs" + noOfLegs);
		System.out.println("age is" + age);
	}
}