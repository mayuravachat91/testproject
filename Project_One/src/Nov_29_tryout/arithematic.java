package Nov_29_tryout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class arithematic {

	public static void main(String[] aregs) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the no :");
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		System.out.println("Addition is :"+(a+b));
		System.out.println("Sub is :"+(a-b));
		System.out.println("Multi is :"+(a*b));
		System.out.println("Division is :"+(a/b));
		System.out.println("Mod is :"+(a%b));
	}
}

