package Nov_27;

public class firstTenEvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=1;
		for (int i=2;;i++) {
			if(count<=10) {
				if(i%2==0) {
					System.out.println(i+"\t");
					count++;
				}
			}
		}
	}
}
