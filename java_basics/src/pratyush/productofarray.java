package pratyush;

/**
 * Problem: Given an array of n integers where n>1, return an array of same size
 * an input array where at every index of the output array should contain the
 * product of all elements in the array except the element at the given index.
 * Example: arr[] = {10, 4, 1, 6, 2} prod[] = {48,120,480,80,240}
 * 
 * @author pratyusk
 *
 */


public class productofarray {
	public static void printArray(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	}
	
	public static void main(String args[]) {
		int arr[] = { 10, 4, 1, 6, 2 };
		int[] mul= new int[5];
		int multiplication=1;
		printArray(arr);
		for (int i = 0; i < 5; i++) {
			multiplication*=arr[i];
		}
		
		for(int i=0;i<5;i++){
			mul[i]=multiplication/arr[i];
		}
		printArray(mul);
	}
}
