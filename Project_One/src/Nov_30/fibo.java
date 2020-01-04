package Nov_30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fibo {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int a=0,b=1,c,count=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the NO :");
		int no = Integer.parseInt(br.readLine());
		while(count<=no) {
			
			c=a+b;
			a=b;
			b=c;
			++count;
			System.out.println(c+"\t");
		}
	}
}
