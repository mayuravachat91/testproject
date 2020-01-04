package Nov_27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class findPerimeter {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the NO :");
		int len = Integer.parseInt(br.readLine());
		int width = Integer.parseInt(br.readLine());
		int P = 2*len+2*width;
		System.out.println(P+"\t");
	}

}
