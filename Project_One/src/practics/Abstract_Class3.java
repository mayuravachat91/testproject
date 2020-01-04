package practics;
import java.lang.*;

// abstract class contains 0 or more abstract methods
abstract class Base
{
	int i;
	 	
	Base()
	{
		i = 10;
		System.out.println("In abstract class constructor");
	}

	void fun()
	{
		System.out.println("In Base fun");
	}
}

class Demo extends Base
{
	Demo()
	{
		System.out.println("Demo constructor get called after base constructor");
	}
	void gun()
	{
		System.out.println("In gun of Demo");
		System.out.println("Value of i"+i);
	}

	void fun()
	{
		System.out.println("In Demo fun");
	}
	
}

class Abstract_Class3
{
	public static void main(String args[])
	{	
		Demo dobj = new Demo();
		dobj.fun();
		dobj.gun();

		// We can not create object of abstract class
		// but we can create its reference
		Base bobj = new Demo();
		bobj.fun();
	}
}
// Now concept understand in this program is that if base class contain fun function and derivd class contains also fun function and
// base clss is abstarct class then while creating the ref of absract class which contains the address of deerived class object , then
// function of derived class get called but if the fun function is not in the derive class then fun function of base class get called.