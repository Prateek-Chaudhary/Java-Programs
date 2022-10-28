package sorting;

public class BubbleSort {
	
	public static void bubbleSort(int[] ar) {
		for(int i = 0; i < ar.length-1; i++) {
			for(int j = 0; j < ar.length-1-i; j++) {
				int n = ar[j];
				if(ar[j] > ar[j+1]) {
					ar[j] = ar[j+1];
					ar[j+1] = n;
				}
			}
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
		bubbleSort(ar);
		printArray(ar);
	}
}
