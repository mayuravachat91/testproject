package array;

import java.util.Scanner;

public class acceptArray {
	
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array:");
		int no = sc.nextInt();
		int array[] = new int[no];
		int i;
		for (i=0; i<array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		/*System.out.print("Enter no. of elements you want in array:");
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
	    }*/
	}

}
