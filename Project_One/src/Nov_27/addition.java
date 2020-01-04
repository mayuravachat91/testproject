package Nov_27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class addition {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the NO :");
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		System.out.println("Addition is :"+(a+b));
	}
}

