package Des_06;

import java.util.Scanner;

public class pattern_02 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter the no:");
		int n = sc.nextInt();
		for(int i=9; i >=n; i--) {
			for(int j=n; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println(" ");
		}
	}
}

/*o/p:: n = 5;
5 6 7 8 9  
5 6 7 8  
5 6 7  .....
5 6  
5  
*/