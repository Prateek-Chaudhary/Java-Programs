package sorting;

public class SelectionSort {
	
	public static void selectionSort(int[] ar) {
		for(int i = 0; i < ar.length; i++) {
			int small = i;
			for(int j = i + 1; j < ar.length; j++) {
				if(ar[small] > ar[j])
					small = j;
			}
			int n = ar[i];
			ar[i] = ar[small];
			ar[small] = n;
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
		selectionSort(ar);
		printArray(ar);
	}
}
