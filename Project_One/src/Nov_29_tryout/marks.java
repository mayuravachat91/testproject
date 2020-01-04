package Nov_29_tryout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class marks {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Subject Marks :");
		int m1 = Integer.parseInt(br.readLine());
		int m2 = Integer.parseInt(br.readLine());
		int m3 = Integer.parseInt(br.readLine());
		int m4 = Integer.parseInt(br.readLine());
		int m5 = Integer.parseInt(br.readLine());
		int total = m1+m2+m3+m4+m5;
		int avg = total/5;
		int per = (total/500)*100;
		System.out.println("Total Marks:: "+total);
		System.out.println("Average Marks:: "+avg);
		System.out.println("Percentage:: "+per);
	}
}
