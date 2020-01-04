package Nov_30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fromnum {
	public static void main(String[] aregs) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the NO :");
		int fromNum = Integer.parseInt(br.readLine());
		int tonum = Integer.parseInt(br.readLine());
		
//using while
		int i = fromNum;
		while(i<=tonum) {
			if(i%2==0) {
				System.out.println(i);
			}
			i++;
		}
		
		int j = tonum;
		while(j<=fromNum) {
			if(j%2==0) {
				System.out.println(j);
			}
			j++;
		}

// using do...while
		/*int i = fromNum;
		do{
			if(i%2!=0) {
				System.out.println(i);
			}
			i++;
		}while(i<=tonum);
		
		int j = tonum;
		do{
			if(j%2!=0) {
				System.out.println(j);
			}
			i++;
		}while(i<=tonum);*/
	}
}
