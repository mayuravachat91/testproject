package Nov_30;

import java.util.Scanner;

public class character {
	private static Scanner sc;

	public static void main(String[] args) 
    { 
        sc = new Scanner(System.in); 
        char c = sc.next().charAt(0); 
        if(c>=96 && c<=123 ||c>=64 && c<=91 ) { 
        	System.out.println("Is Character"); 
        }else if(c>=48 && c<=57){
        	System.out.println("Is Digit");
        }else {
        	System.out.println("Is Special Character");
        }
    } 
}
