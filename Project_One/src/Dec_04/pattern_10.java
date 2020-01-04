package Dec_04;

import java.util.Scanner;

public class pattern_10 {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter the no:");
		int n = sc.nextInt();
		for (int i=1; i<=n;i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int k=n; k>=i; k--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }		
	}
}

