package Nov_30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class evennumber {
	public static void main(String[] aregs) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the NO :");
		int no = Integer.parseInt(br.readLine());
		int i=1;
		while(i<=no) {
			if(i%2==0) {
				System.out.println("even number");
			}
			i++;
		}
	}
}
