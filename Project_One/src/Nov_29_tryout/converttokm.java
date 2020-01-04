package Nov_29_tryout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class converttokm {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the celsius :");
		double celsius = Double.parseDouble(br.readLine());
		double fahrenheit = (9.0/5.0)*celsius + 32;
		System.out.println("Fahrenheit= "+fahrenheit);
	}
}
