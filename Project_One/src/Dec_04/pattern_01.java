package Dec_04;

import java.util.Scanner;

public class pattern_01 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter the number:: ");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" * ");
			}
			System.out.println(" ");
		}
	}
}

/*O/P:: 5
* 
** 
*** 
**** 
******/ 

	