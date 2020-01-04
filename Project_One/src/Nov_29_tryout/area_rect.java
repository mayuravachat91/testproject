package Nov_29_tryout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class area_rect {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Breadth and length :");
		int b = Integer.parseInt(br.readLine());
		int l = Integer.parseInt(br.readLine());
		int area = b*l;
		System.out.println("Area of rectangle= "+area);

	}

}
