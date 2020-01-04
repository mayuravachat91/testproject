package test;

public class Pattern_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,num = 2;
		for(i=1;i<=5;i++) {
			for(j=2;j<=num;j++) {
				if(num%2!=0) {
					System.out.println(++num);
				}else {
					num++;
				}
			}
			System.out.println(" ");
		}
	}

}
