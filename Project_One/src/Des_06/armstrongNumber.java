package Des_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class armstrongNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int cube = 0, temp, rem = 0, sum = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the NO :");
		int number = Integer.parseInt(br.readLine());
		temp = number;
		while(number != 0) {
			rem = number % 10;
			cube = (int) Math.pow(rem , 3);
			sum = sum + cube;
			number = number / 10;
		}
		if (sum == temp) {
			System.out.println("armstrong");
		}else {
			System.out.println("Not armstrong");
		}
	}
}
