import java.util.ArrayList;

public class CommonInThreeArray {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6};
		int[] arr2 = {3, 4, 5, 6, 7, 8};
		int[] arr3 = {4, 5, 6, 7, 8, 9};
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i : arr) {
			for(int j : arr2) {
				for(int k : arr3) {
					if(i == j && i == k) {
						list.add(k);
					}
				}
			}
		}
		System.out.println(list);
	}
}
