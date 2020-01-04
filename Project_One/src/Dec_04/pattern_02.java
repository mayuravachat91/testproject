package Dec_04;

import java.util.Scanner;

public class pattern_02 {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter the number:: ");
		int n = sc.nextInt();
		for(int i=n; i>=1; i--) {
			for(int j=i; j>=1; j--) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
}

/*o/p:: 5
***** 
**** 
*** 
** 
* */