package pratyush;

/**
 * 
 * @author pratyusk
 *
 */
public class MergeSort {

	static void merge_sort(int[] a, int low, int high) {
		if (low == high)
			return;
		if (high == low + 1) {
			if (a[high] < a[low]) {
				a[high] += a[low];
				a[low] = a[high] - a[low];
				a[high] = a[high] - a[low];
			}
			return;
		}

		int mid = (low + high) / 2;
		merge_sort(a, low, mid);
		merge_sort(a, mid + 1, high);
		merge(a, low, mid, high);
		

	}

	static void merge(int[] a, int low, int mid, int high) {
		int size1 = high - low + 1;
		int tempArr[] = new int[size1];
		int i = low, j = mid + 1, index = 0;
		while (i <= mid && j <= high) {
			if (a[i] > a[j]) {
				tempArr[index] = a[j];
				j++;
				index++;
			} else {
				tempArr[index] = a[i];
				i++;
				index++;
			}
		}

		while (i <= mid) {
			tempArr[index] = a[i];
			i++;
			index++;
		}
		while (j <= high) {
			tempArr[index] = a[j];
			j++;
			index++;
		}
		
		for(int p=low;p<=high;p++){
			a[p]=tempArr[p-low];
		}
	}

	public static void main(String[] args) {
		int arr[] = { 11, 38, 37, 43, 65, 23, 71, 21, 9, 5 };
		System.out.print("Array before sorting: ");
		for (int element : arr) {
			System.out.print(element + " ");
		}
		System.out.println();

		merge_sort(arr, 0, arr.length - 1);

		System.out.print("Sorted Array: ");
		for (int element : arr) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}
