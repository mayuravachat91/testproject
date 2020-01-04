package Nov_29_tryout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class circle {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Redius:");
		int r = Integer.parseInt(br.readLine());
		System.out.println("Area of diameter= "+2*r);
		System.out.println("Area of area= "+3.14f*r*r);
		System.out.println("Area of circumference = "+2*3.14f*r);
	}
}
