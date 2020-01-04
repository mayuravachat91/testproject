package Nov_30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class leapYear {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the year :");
		int year= Integer.parseInt(br.readLine());
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
			System.out.println("Leap Year");
		}else {
			System.out.println("Not Leap Year");
		}
	}
}
