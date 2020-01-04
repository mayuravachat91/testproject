package Nov_27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swappingWithUsingThird {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the NO :");
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int temp;
		System.out.println(a+"\t"+b);
		//Swapping of 2nos
		temp=a;
		a=b;
		b=temp;
		System.out.println("Swapping Nos :"+a+"\t"+b);
	}
}
