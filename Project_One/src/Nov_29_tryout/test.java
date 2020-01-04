package Nov_29_tryout;

import java.util.Scanner;

public class test {
	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		//System.out.print("Elements in Array is :\n");
	    for(int i=0; i<n; i++)
	    {
	    	if(arr[i]%5==0) {
	    		System.out.println("-1");
	    	}else {
	    		System.out.println(arr[i] + "  ");
	    	}
	    }
	}
}
