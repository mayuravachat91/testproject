package Nov_27;

import java.util.Scanner;

public class multiplication_Table {
	private static Scanner s;

	public static void main(String[] args) 
    {
        s = new Scanner(System.in);
        System.out.print("Enter number:");        
        int n= s.nextInt();
        for(int i=1; i <= 10; i++)
        {
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}
