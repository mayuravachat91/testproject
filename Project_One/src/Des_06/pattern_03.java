package Des_06;

import java.util.Scanner;

public class pattern_03 {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter the no:");
		int n = sc.nextInt();
		int no1 = 0, no2 = 1, sum = 0;
		for(int i=1; i <=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(no1+" ");
				sum = no1 + no2;
				no1 = no2;
				no2 = sum;
				//System.out.print(sum+" ");
			}
			System.out.println(" ");
		}
	}
}

/*o/p::
	Enter the no:
		4
		0  
		1 1  
		2 3 5  
		8 13 21 34*/
