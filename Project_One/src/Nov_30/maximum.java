package Nov_30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class maximum {
	public static void main(String[] aregs) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the NO :");
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		if (a == b && b==c) {
			System.out.println("all equal");
		}else if(a>b && a>c) {
			System.out.println("a greater");
		}else if(a == c && a!=b && b<a) {
			System.out.println("a and c equal and greater");
		}else if(a == b && b!=c && c<a){
			System.out.println("a and b equal and greater");
		}else if(b>a && b>c) {
			System.out.println("a greater");
		}else if(b==c && b!=a) {
			System.out.println("b and c equal and greater");
		}else if(c>a && c>b) {
			System.out.println("c greater");
		}
	}
}
