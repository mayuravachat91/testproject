package Nov_29_tryout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class power {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the value of base :");
		int base = Integer.parseInt(br.readLine());
		System.out.println("Enter the value of exponent :");
		int exponent = Integer.parseInt(br.readLine());
		int a = (int) Math.pow(base, exponent);
		System.out.println("Power of "+base+"^"+exponent+"="+a);
	}
}
