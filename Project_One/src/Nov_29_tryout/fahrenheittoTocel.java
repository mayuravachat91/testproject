package Nov_29_tryout;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fahrenheittoTocel {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the celsius :");
		double fahrenheit = Double.parseDouble(br.readLine());
		double cel = (5.0/9.0)*(fahrenheit - 32);
		System.out.println("Fahrenheit= "+cel);
	}
}
