package Dec_07;

import java.util.Scanner;

public class test_10 {
	
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in); 
		char ch;
		int sum = 0;
		System.out.println("Enter the number a and b: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Enter the choice (+,-,*,/):: ");
		ch = sc.next().charAt(0);
		switch(ch) {
			case '+' : 
				sum = a + b;
				System.out.println("Addition is :: "+ sum);
				break;
				
			case '-' : 
				sum = a - b;
				System.out.println("Subtraction is :: "+ sum);
				break;
				
			case '*' : 
				sum = a * b;
				System.out.println("Multiplication is :: "+ sum);
				break;
				
			case '/' : 
				sum = a / b;
				System.out.println("Div is :: "+ sum);
				break;
		}
	}
}
