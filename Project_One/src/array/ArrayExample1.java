package array;

public class ArrayExample1 {

	public static void main(String[] args) {
		
		// single dim array
		int arr[] = new int[5];
		
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
		
		System.out.println("----------------------");
		
		
		for(int i = 0; i < arr.length; i++){
			arr[i] = i++;
		}
		
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}

	}

}
