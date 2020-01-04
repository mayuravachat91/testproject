package test;

public class test_09 {
	public static void main(String[] args) {
		int i,j,sum=0;
		for (i=1;i<=4;i++) {
			for(j=1;j<=7;j++) {
				if(j==1) {
					sum+= 47 + 1;
				}else if(j==2) {
					sum+= 47 + 2;
				}else if(j==3) {
					sum+= 47 + 3;
				}else if(j==4) {
					sum+= 47 + 4;
				}else if(j==5) {
					sum+= 47 + 5;
				}else if(j==6) {
					sum+= 47 + 6;
				}else if(j==7) {
					sum+= 47 + 7;
				}
			}
			System.out.println("Week Sum:: "+sum);
			sum = 0;
		}

	}

}
