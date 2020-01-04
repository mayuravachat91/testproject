package Nov_30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class table {
	public static void main(String[] aregs) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the NO :");
		int sno = Integer.parseInt(br.readLine());
		int lno = Integer.parseInt(br.readLine());
		for (int i=sno;i<=lno;i++) {
			for (int j=1;j<=10;j++) {
				System.out.println(i*j);
			}
		}
	}
}
