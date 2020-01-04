package Dec_07;

import java.util.Scanner;

public class test_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int i, j, c1=-2, c2=2, sum =0,temp=0;
		System.out.println("Enter the number:: ");
		int no1 = sc.nextInt();
		int no2 = sc.nextInt();
		/*for(i = 1; i<=no1; i++) {
			if (no1%i==0) 
				c1++;
		}
		for(j = 1; j<=no2; j++) {
			if (no2%j==0) 
				c2++;
		}
		d= Math.abs(no1 - no2);//Math.abs() function return the absolute value
		System.out.println("Value of d:: "+d);*/
		
		for (i=2;i<no1;i++) {
			if(no1%i==0) {
				temp=temp+1;
			}
		}
		for (i=2;i<no2;i++) {
			if(no2%i==0) {
				temp=temp+1;
			}
		}
		sum = no1-no2;
		if(temp>0) {
			System.out.println("Not Twin Prime");
		}else if (sum==c1 || sum==c2) {
			System.out.println("Twin Prime");
		}else {
			System.out.println("Not Twin Prime");
		}
	}
}
