package searching;

public class SearchInfiniteArray {
	
	public static int binarySearch(int[] ar, int key, int low, int high) {
		while(low <= high) {
			int mid = (low + high)/2;
			if(ar[mid] == key)
				return mid;
			if(ar[mid] < key)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return 0;
	}
	
	public static int infiniteSearch(int[] ar, int key) {
		int low = 0, high = ar.length-1;
		while(ar[high] < key) {
			low = high;
			high = high*2;
		}
		return binarySearch(ar, key, low, high);
	}
	
	public static void main(String[] args) {
		int[] ar = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		System.out.println(infiniteSearch(ar, 11));
	}
}
