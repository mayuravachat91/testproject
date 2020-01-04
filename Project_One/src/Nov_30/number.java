package Nov_30;

import java.util.Scanner;

public class number {
	private static Scanner sc;

	public static void main(String[] args) 
    { 
        sc = new Scanner(System.in);
        System.out.println("Enter The Number :: ");
        int no = sc.nextInt();
        if(no > 0) {
        	System.out.println(no+" is a positive number");
        }else if(no < 0) {
        	System.out.println(no+" is a negative number");
        }else if (no == 0){
        	System.out.println(no+" is a zero");
        }/*else {
        	System.out.println("Is Not positive or Negative");
        }*/
    }
}
