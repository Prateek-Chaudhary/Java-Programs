package searching;

import java.util.Arrays;

public class BinarySearch {
	
	public static int binarySearch(int[] ar, int s) {
		int start = 0, end = ar.length-1;
		Arrays.parallelSort(ar);
		while(start <= end) {
			int mid = (start + end)/2;
			if(ar[mid] == s)
				return mid;
			if(ar[mid] > s)
				end = mid - 1;
			else
				start = mid + 1;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		int[] ar = {5, 6, 2, 9, 7, 3, 1};
		System.out.println(binarySearch(ar, 7));
	}
}
