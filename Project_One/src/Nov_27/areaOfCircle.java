package Nov_27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class areaOfCircle {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the NO :");
		int r = Integer.parseInt(br.readLine());
		int area = (int) (3.14*r*r);
		System.out.println(area+"\t");
	}
}
