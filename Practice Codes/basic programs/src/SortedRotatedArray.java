public class SortedRotatedArray {
	
	public static int binarySearch(int ar[], int key) {
		int low = 0, high = ar.length-1;
		while(low <= high) {
			int mid = (low + high)/2;
			if(ar[mid] == key)
				return mid;
			if(ar[low] < ar[mid]) {
				if(key >= ar[low] && key < ar[mid])
					high = mid - 1;
				else
					low = mid + 1;
			}
			else {
				if(key > ar[mid] && key <= ar[high])
					low = mid + 1;
				else
					high = mid - 1;
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
		int[] ar = {13, 14, 15, 5, 6, 7, 8, 9, 10, 11, 12};
		System.out.println(binarySearch(ar, 15));
	}
}
