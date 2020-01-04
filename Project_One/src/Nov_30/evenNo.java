package Nov_30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class evenNo {
	public static void main(String[] aregs) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the NO :");
		int fromNum = Integer.parseInt(br.readLine());
		int tonum = Integer.parseInt(br.readLine());
		if(fromNum<=tonum) {
			for(int i=fromNum;i<=tonum;i++) {
				if(i%2==0) {
					System.out.println(i);
				}else {
					for(int i1=tonum;i1<=fromNum;i1++) {
						if(i1%2==0) {
							System.out.println(i1);
						}
					}
				}
			}
		}
	}
}
