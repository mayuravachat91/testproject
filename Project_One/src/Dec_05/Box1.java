package Dec_05;

import java.util.Scanner;

public class Box1 {
	double height;
	double width;
	double depth;
	private static Scanner scanner;
	
	void init(double h, double w, double d) {
		height = h;
		width = w;
		depth = d;
	}
	
	double calculateVolume() {
		double volume = height * width * depth; 
		return volume;
	}
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.println("Enter the height, width and depth:: ");
		double h1 = scanner.nextDouble();
		double w1 = scanner.nextDouble();
		double d1 = scanner.nextDouble();
		Box1 b1;
		b1  = new Box1();
		b1.init(h1, w1, d1);
		double volume = b1.calculateVolume();
		System.out.println("Volume is:: "+volume);
	}
}
