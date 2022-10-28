public class BinarySearch {
	
	public static int binarySearch(int ar[], int key) {
		int low = 0, high = ar.length;
		while(low <= high) {
			int mid = (low + high)/2;
			if(ar[mid] == key)
				return mid;
			if(ar[mid] > key)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		int[] search = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println(binarySearch(search, 3));
	}
}
