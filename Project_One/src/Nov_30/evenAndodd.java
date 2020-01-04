package Nov_30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class evenAndodd {
	public static void main(String[] aregs) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the NO :");
		int no = Integer.parseInt(br.readLine());
		switch(no%2) {
			case 0:
				System.out.println("Even Number");
			break;
			case 1:
				System.out.println("Odd Number");
			break;
		}
	}
}

