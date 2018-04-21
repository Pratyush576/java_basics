package utils;

public class CommonUtils {
	/*
	 * Prints all elements of the array
	 */
	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}
	
	public static int getMinimumElementofTheArray(int arr[]){
		int min=1000000000;
		for(int i=0;i<arr.length;i++){
			if(min>arr[i]){
				min=arr[i];
			}
		}
		System.out.println("Minimum Element of the Array is :"+min);
		return min;
	}
	
	
	
}
