package Dec_14.Ass1;

import java.util.Scanner;

public class person_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("!!!!!!!!!!!!!!!!Enter the Detail's of Person!!!!!!!!!!!!!!!");
		System.out.print("Enter the name:: ");
		String name = sc.nextLine();
		
		System.out.print("Enter the no (1.Male or 2.Female):: ");
		int i = sc.nextInt();
		String gender = null;
		switch (i) {
		case 1:
			gender = "Male";
			break;

		case 2:
			gender = "Female";
			break;
		}
		
		System.out.print("Enter the age:: ");
		int age = sc.nextInt();
		
		System.out.print("Enter the address:: ");
		String Address = sc.nextLine();
		sc.next();
		
		System.out.print("Enter the city:: ");
		String city = sc.nextLine();
		sc.next();
		
		System.out.print("Enter the state:: ");
		String state = sc.nextLine();
		sc.next();
		
		System.out.print("Enter the country:: ");
		String country = sc.nextLine();
		sc.next();
		
		Person p = new Person(name, gender, age, Address, new Address(city, state, country));
		p.display();
	}

}
