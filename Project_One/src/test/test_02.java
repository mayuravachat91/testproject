package test;

import java.util.Scanner;

public class test_02 {
	private static Scanner sc;

		
		public static void main(String[] args) {
			sc = new Scanner(System.in);
			//System.out.println("Enter the number:: ");
			char ch = 'A';
			int no =5;
			int c = no - 1;
			for(int i = 1;i<=no;i++) {
				for(int j = 1;j<=c;j++) {
					System.out.print(" ");
					c--;
				}
				for(int k=1; k<=i; k++) {
					System.out.println(ch);
					//System.out.println( );
					ch++;
				}
			}
			
			/*for (int i=1; i<=5; i++) {
				for(int j=1; j<=i; j++) {
					if(j==3) {
						System.out.print("0");
					}else {
						System.out.print("*");
					}
				}
				System.out.println(" ");
			}*/
			
		}
	}