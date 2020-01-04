package Dec_04;

import java.util.Scanner;

public class patter_12 {
	private static Scanner sc;

	public static void main(String[] args) {   
		sc = new Scanner(System.in);
		System.out.println("Enter the no:");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++){
			for (int j=1; j<i; j++) {
				System.out.print(" ");
			}
			for (int k=i; k<=n; k++) { 
				System.out.print(k+" "); 
			} 
			System.out.println(); 
		} 

		for (int i=n-1; i>=1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k <= n; k++){
				System.out.print(k+" ");
			}     
		System.out.println();
		}
	}
}