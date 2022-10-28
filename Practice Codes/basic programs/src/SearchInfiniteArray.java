public class SearchInfiniteArray {

	public static int infiniteArray(int arr[], int key, int low, int high) {
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == key) {
				return mid;
			}
			if (arr[mid] > key) {
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}
		return 0;
	}

	public static int binarySearch(int a[], int key) {
		int low = 0, high = 1;
		while (a[high] < key) {
			low = high;
			high = high * 2;
		}
		return infiniteArray(a, key, low, high);
	}

	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27,
				28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
		System.out.println(binarySearch(ar, 23));
	}
}
