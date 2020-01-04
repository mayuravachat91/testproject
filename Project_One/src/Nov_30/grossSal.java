package Nov_30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class grossSal {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Subject Marks :");
		float basicSal = Integer.parseInt(br.readLine());
		double da,gross,hra;
		if (basicSal<=10000) {
			 da = basicSal*0.8;
			 hra= basicSal*0.2;
		}else if (basicSal<=20000) {
			 da = basicSal*0.9;
			 hra= basicSal*0.25;
		}else {
			 da = basicSal*0.95;
			 hra= basicSal*0.3;
		}
		gross = basicSal + da + hra;
		System.out.println("Gross Salary :: "+gross);
	}
}
