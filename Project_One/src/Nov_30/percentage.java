package Nov_30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class percentage {
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
		float per = total/5;
		System.out.println("Total Marks:: "+total);
		System.out.println("Average Marks:: "+avg);
		System.out.println("Percentage:: "+per);
		if (per>=90) {
			System.out.println("Grade A Percentage is:: "+per+"%");
		}else if(per>=80) {
			System.out.println("Grade B Percentage is:: "+per+"%");
		}else if(per>=70) {
			System.out.println("Grade C Percentage is:: "+per+"%");
		}else if(per>=60) {
			System.out.println("Grade D Percentage is:: "+per+"%");
		}else if(per<50) {
			System.out.println("Grade E Percentage is:: "+per+"%");
		}
	}
}

