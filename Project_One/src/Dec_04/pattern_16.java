package Dec_04;

public class pattern_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("0 ");
			}
			System.out.print(i+" ");
			for (int k=i;k<n;k++) {
				System.out.print("0 ");
			}
			System.out.println( );
		}
	}
}

/*o/p::
	0 0 0 0 0 
	0 1 0 0 0 
	0 0 2 0 0 
	0 0 0 3 0 
	0 0 0 0 4*/ 

	