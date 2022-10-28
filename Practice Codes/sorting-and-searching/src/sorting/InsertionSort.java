package sorting;

public class InsertionSort {
	
	public static void insertionSort(int[] ar) {
		for(int j = 2; j < ar.length; j++) {
			int key = ar[j];
			int i = j - 1;
			while(i >= 0 && ar[i] > key) {
				ar[i+1] = ar[i];
				i -= 1;
			}
			ar[i+1] = key;
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
		insertionSort(ar);
		printArray(ar);
	}
}
