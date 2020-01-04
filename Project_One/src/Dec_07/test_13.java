package Dec_07;

public class test_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1,k=1; //int i = 1; k = 1;(Error:k cannot be resolved to a variable)
		while (i++<=5) {
			k*=i;
		}
		System.out.println("K="+k+"i="+i);
	}

}
