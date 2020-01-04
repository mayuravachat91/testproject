package Des_06;

import java.util.Scanner;

public class pattern_01 {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter the no:");
		int n = sc.nextInt();
		int no1 = 1, no2 = 2;
		for (int i=1; i<=n;i++) {
			for (int j=1; j<=i; j++) {
				if(i%2!= 0) {
					System.out.print(no1+" ");
					no1 += 2;
				}else {
					System.out.print(no2+" ");
					no2 += 2;
				}
			}
			System.out.println(" ");
		}
	}
}
/*o/p: 5

1  
2 4  
3 5 7  
6 8 10 12  
9 11 13 15 17*/