package Dec_07;

public class divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for( int i = 1; i<=100; i++) {
			if((i%3 == 0) || (i%7 == 0)) {
				System.out.println("Divisible by 3 or 7 number is:: "+i);
			}else {
				System.out.println("Not Divisible by 3 or 7 number is:: "+i);
			}
		}
	}
}
