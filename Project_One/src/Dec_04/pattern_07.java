package Dec_04;

public class pattern_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		for(int i=1; i<=n; i++) {
			for(int j=i; j>=1; j--) {
				System.out.print(j);
			}
			System.out.println( );
		}
	}

}

/*o/p: 5
1
21
321
4321
54321*/