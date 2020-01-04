package test;

import java.util.Scanner;

public class Coin { 
	public static void main (String[] args) { 
		int no = 33;
		int c5 = 0, c2 = 0;
		if (no%5==0){
			c5 = no/5;
			System.out.println(c5+"	Coins of 5");
		}else {
			c5 = no/5;
			no = no -(c5*5);
			if(no%2==0) {
				c2 = no/2;
				System.out.println(c5+"	Coins of 5");
				System.out.println(c2+"	Coins of 2");
			}else {
				c5--;
				no = no + 5;
				c2 = no/2;
				System.out.println(c5+" Coins of 5");
				System.out.println(c2+" Coins of 2");
			}
		}
	}
}