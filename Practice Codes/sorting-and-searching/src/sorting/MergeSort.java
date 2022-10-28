package sorting;

public class MergeSort {
	
	public static void merge(int[] ar, int start, int mid, int end) {
		int n1 = mid - start + 1, n2 = end - mid;
		int[] l = new int[n1];
		int[] r = new int[n2];
		for(int i = 0; i < l.length; i++) {
			l[i] = ar[start + i];
		}
		for(int j = 0; j < r.length; j++) {
			r[j] = ar[mid + 1 + j];
		}
		int i = 0, j = 0, k = start;
		while(i < n1 && j < n2) {
			if(l[i] < r[j]) {
				ar[k] = l[i];
				k++;
				i++;
			}
			else {
				ar[k] = r[j];
				j++;
				k++;
			}
		}
		while(i < n1) {
			ar[k] = l[i];
			i++;
			k++;
		}
		while(j < n2) {
			ar[k] = r[j];
			j++;
			k++;
		}
	}
	
	public static void mergeSort(int[] ar, int start, int end) {
		if(start < end) {
			int mid = (start + end)/2;
			mergeSort(ar, start, mid);
			mergeSort(ar, mid + 1, end);
			merge(ar, start, mid, end);
		}
	}
	
	public static void printArray(int[] ar) {
		for(int i : ar)
			System.out.print(i+" | ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] ar = {5, 9, 3, 7, 1, 6, 4, 2, 8};
		printArray(ar);
		mergeSort(ar, 0, ar.length - 1);
		printArray(ar);
	}
}
