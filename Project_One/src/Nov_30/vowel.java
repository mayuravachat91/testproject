package Nov_30;

import java.util.Scanner;

public class vowel {
	private static Scanner sc;

	public static void main(String[] args) 
    { 
        sc = new Scanner(System.in);
        System.out.println("Enter the Char :: ");
        char c = sc.next().charAt(0); 
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') { 
        	System.out.println("Is Vowel"); 
        }else {
        	System.out.println("Is Consonant");
        }
    } 
}
