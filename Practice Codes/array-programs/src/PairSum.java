public class PairSum {
	public static void main(String[] args) {
		int arr[] = {4, 1, 3, 5, 2, 8, 6, 9, 7};
		int sum = 14;
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				int sm = arr[i] + arr[j];
				if(sm == sum)
					System.out.println(arr[i]+","+arr[j]);
			}
		}
	}
}
