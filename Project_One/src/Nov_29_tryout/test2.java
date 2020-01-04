package Nov_29_tryout;

import java.util.Scanner;

public class test2 {
	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        int n = s.nextInt();
        int m = s.nextInt();
        int arr[][] = new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j] = s.nextInt();
			}
		}
	}
}
