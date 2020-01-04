package Nov_30;

import java.util.Scanner;

public class Calculator {

    private static Scanner sc;

	public static void main(String[] args) {

    	double num1, num2;
        sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        num1 = sc.nextDouble();
        System.out.print("Enter second number:");
        num2 = sc.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        char op = sc.next().charAt(0);
        double num3;
        switch(op)
        {
            case '+':
            	num3 = num1 + num2;
                break;

            case '-':
            	num3 = num1 - num2;
                break;

            case '*':
            	num3 = num1 * num2;
                break;

            case '/':
            	num3 = num1 / num2;
                break;

            default:
                System.out.printf("You have entered wrong operator");
                return;
        }
        System.out.println(num1+" "+op+" "+num2+"="+num3);
    }
}

