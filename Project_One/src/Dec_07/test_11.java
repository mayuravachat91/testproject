package Dec_07;

public class test_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, k, x, l, d;
		for(i = 1; i<=5; i++) {
			x = 6 - i;
			if(i%2!=0) {
				for(j = 1; j<=x; j++) {
					l = x-2;
					System.out.print(j+" ");
				}
			}else {
				d = 5 -i;
				for (k=x; k>=1; k--) {
					System.out.print(k+" ");
				}
			}
			System.out.println(" ");
		}
	}
}
