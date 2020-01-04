package array;

public class Example4 {

	public static void main(String[] args) {
		int num = 88;
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		System.out.println(arr[4]);
		System.out.println(num);
		fun(arr, num);
		System.out.println(arr[4]);
		System.out.println(num);
		
		System.out.println(arr[0]);
		System.out.println(arr[2]);
	}

	private static void fun(int[] aaa, int num) {
		
		aaa[0] = 90;
		aaa[1] = 77;
		aaa[4] = 88;
		aaa[6] = 55;
		
		num = 101;
		
	}

}
