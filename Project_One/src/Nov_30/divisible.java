package Nov_30;

import java.util.Scanner;

public class divisible {
	private static Scanner sc;

	public static void main(String[] args) 
    { 
        sc = new Scanner(System.in);
        System.out.println("Enter The Number :: ");
        int no = sc.nextInt();
        if((no%5==0) && (no%11==0)) {
        	System.out.println(no+" is divisible by 5 and 11");
        }else {
        	System.out.println(no+" is not divisible by 5 and 11");
        }
    }
}
