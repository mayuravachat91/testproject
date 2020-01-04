package Dec_07;

public class test_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i<=20 ; i++) {
			if (i<=10) {
				System.out.println("Barrel "+i+" Price of barrel "+i*89);
			}else {
				System.out.println("Barrel "+i+" Price of barrel "+i*(89-i));
			}
		}
	}

}
