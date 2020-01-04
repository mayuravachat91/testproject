package test;

/*
 * Sparse Arrays
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of array ::");
		int n = sc.nextInt();
		String[] s = new String[n];
		int count = 0;
		System.out.println("Enter the String 1 ::");
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			s[i] = sc.next();
		}
		System.out.println("Enter the no of array ::");
		int n1 = sc.nextInt();
		String[] s1 = new String[n1];
		System.out.println("Enter the String 2 ::");
		for (int j = 0; j < n1; j++) {
			sc.nextLine();
			s1[j] = sc.next();
		}
		for (int i = 0; i < n1; i++) {
			count = 0;
			for (int j = 0; j < n; j++) {
				if ((s[j].equals(s1[i]))) {
					count++;
				}

			}
			System.out.println(count);
		}

	}

}
