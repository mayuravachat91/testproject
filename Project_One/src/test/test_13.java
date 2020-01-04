package test;

public class test_13 {

	public static void main(String[] args) {
		int i,sum=0,c=0,c1=0,c2=3;
		for (i=1;i<=50;i++) {
			if(i%3==0) {
				System.out.println("No is "+i+" buzz");
				c++;
			}
			if(i%5==0) {
				System.out.println("No is "+i+" fizz");
				c1++;
			}
			if (i%3==0 && i%5==0) {
				System.out.println("No is "+i+" buzzfizz");
				c2++;
			}
		}
		System.out.println("buzz:: "+c+" "+"fizz:: "+c1+" "+"buzzfizz:: "+c2);
	}
}
