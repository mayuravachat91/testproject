package Dec_07;

import java.util.Scanner;

public class factorial {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int i, d, sum = 0, temp , fact, no;
        System.out.println("Enter a number:");
        no = sc.nextInt();
        temp = no;
        while(no != 0)
        {
            d = no % 10;
            no = no / 10; 
            fact = 1;
            for(i = 1;i <= d; i++)
            {
                fact*=i;
            }
            sum+= fact;
        }
        System.out.println("Sum of :"+sum);
        if (sum == temp) {
        	System.out.println("Number is Krishnamurthy");
        }else {
        	System.out.println("Number is not Krishnamurthy");
        }
	}
}
