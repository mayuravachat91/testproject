package Nov_29_tryout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Perimeter {

	public static void main(String[] args) throws NumberFormatException, IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the Breadth and length :");
			int bre = Integer.parseInt(br.readLine());
			int len = Integer.parseInt(br.readLine());
			int perimeter = 2*(bre +len);
			System.out.println("Perimeter= "+perimeter);
	}
}
