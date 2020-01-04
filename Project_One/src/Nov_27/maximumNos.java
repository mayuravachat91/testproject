package Nov_27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class maximumNos {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the NO :");
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		if (a > b && a > c)
		      System.out.println("A is largest.");
		    else if (b > a && b > c)
		      System.out.println("B is largest.");
		    else if (c > a && c > b)
		      System.out.println("C is largest.");
		    else
		      System.out.println("The numbers are not distinct.");
	}
}
